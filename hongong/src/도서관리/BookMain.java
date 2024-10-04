package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 도서관리
		// 메인메뉴

		// 선택2번 : 도서검색 => 책제목으로 검색
		// 선택3번 : 도서전체 조회
		// 선택4번 : 도서삭제
		// 선택5번 : 도서 정보 변경
		// 책제목, 변경할 책번호, 변경할 책 가격 입력
		// 선택6번 : 프로그램 종료
		Scanner sc = new Scanner(System.in);
		BookDao dao = null;
		int cnt = 0;
		String check = "";
		boolean run = true;

		while (run) {
			System.out.println("=========================================================================");
			System.out.println("| 1.도서등록 | 2.도서검색 | 3.도서전체 조회 | 4.도서삭제 | 5.도서정보변경 | 6.프로그램 종료 |");
			System.out.println("=========================================================================");
			System.out.print("목록 선택 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("도서등록");
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("저자 : ");
				String writer = sc.nextLine();
				System.out.print("가격 : ");
				int price = Integer.parseInt(sc.nextLine());
				System.out.print("책 번호 : ");
				String bnum = sc.nextLine();
				
				Book book = new Book(title, writer, price, bnum);
				dao = new BookDao();
				cnt = dao.insert(book);
				if(cnt == 1) {
					System.out.println("추가 성공");
				}else {
					System.out.println("추가 실패");
				}
				break;
				
			case 2:
				System.out.println("도서 조회(조건)");
				System.out.print("도서 제목을 입력하세요 > ");
				title = sc.nextLine();
				Book book2 = new Book(title);
				dao = new BookDao();
				dao.select(book2);
				break;
			case 3:
				System.out.println("도서 조회(전체)");
				dao = new BookDao();
				dao.selectAll();
				break;
			case 4:
				System.out.println("도서삭제");
				System.out.print("도서 번호를 입력하세요 >");
				bnum = sc.nextLine();
				Book book3 = new Book(bnum);
				dao = new BookDao();
				cnt = dao.delect(book3);
				if(cnt == 1) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
				break;
			case 5:
				System.out.println("도서정보 변경");
				System.out.print("도서 제목을 입력하세요 : ");
				title = sc.nextLine();
				System.out.println("변경할 가격과 책번호를 입력하세요");
				System.out.println("변경할 가격 : ");
				price = Integer.parseInt(sc.nextLine());
				System.out.println("변경할 책번호 : ");
				bnum = sc.nextLine();
				Book book4 = new Book(title);
				dao = new BookDao();
				cnt = dao.delect(book4);
				if(cnt == 1) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
				break;
			case 6:
				run = false;
				sc.close();
				break;
			default:
			}
		}

	}

}
