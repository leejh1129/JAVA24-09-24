package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javadb.Board;

public class BookDao {

	Connection conn = null;

	// 1.연결설정 메소드 : 메소드 (void)
	public void getOpen() {
		try {
			// jdbc 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", // url
					"java", // 계정
					"1234"); // 비밀번호
//			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 2.연결끊기 메소드 : 메소드 (void)
	public void getClose() {
		if (conn != null) {
			try {
				conn.close();
//				System.out.println("연결끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 3. insert 메소드
	public int insert(Book book) {
		// 데이터 추가
		getOpen();
		try {
			String sql = "" + "insert into book (title,writer,price,bnum) " + "values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getWriter());
			pstmt.setInt(3, book.getPrice());
			pstmt.setString(4, book.getBnum());

			// sql문장 실행
			int rows = pstmt.executeUpdate();
			getClose();
			pstmt.close();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 4. select : 조건에 따른 검색(책제목) 메소드
	public void select(Book book2) {
		// 데이터 조회
		getOpen();
		try {
			String sql = "select * from book where title=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book2.getTitle());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Book bk = new Book();
				bk.setTitle(rs.getString(1));
				bk.setWriter(rs.getString(2));
				bk.setPrice(rs.getInt(3));
				bk.setBnum(rs.getString(4));

				System.out.println(bk);
			}
			getClose();
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 5. select : 목록전체 조회 메소드
	public void selectAll() {
		getOpen();
		try {
			String sql = "select * from book";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Book bk = new Book();
				bk.setTitle(rs.getString(1));
				bk.setWriter(rs.getString(2));
				bk.setPrice(rs.getInt(3));
				bk.setBnum(rs.getString(4));

				System.out.println(bk);
			}
			getClose();
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 6. delect : 메소드 (북번호 이용)
	public int delect(Book book3) {
		getOpen();
		try {
			// 데이터 삭제
			String sql = "delete from book where bnum=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book3.getBnum());
			int rows = pstmt.executeUpdate();
//			System.out.println("삭제행 수 : " + rows);

			pstmt.close();
			getClose();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}

	// 7. update : 메소드(책제목의 가격과 책번호 수정)
	public int update(Book book4) {
		getOpen();
		try {
			String sql = "" + "update book " + "set price=?, bnum=? " + "where title=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book4.getPrice());
			pstmt.setString(2, book4.getBnum());
			pstmt.setString(3, book4.getTitle());
			
			int rows = pstmt.executeUpdate();
			pstmt.close();
			getClose();
			return rows;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
