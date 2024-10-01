package 이주현;

import java.util.Scanner;

public class bankApp {

	 public static void main(String[] args) {
		
		 boolean run = true;
		 Scanner sc = new Scanner(System.in); 
		 Account[] accounts = new Account[100];
		 Account ac = null;
		 
		 while(run) {			 
			 System.out.println("---------------------------------------------");
			 System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			 System.out.println("---------------------------------------------");
			 System.out.print("메뉴 선택 : ");
			 int num = Integer.parseInt(sc.nextLine());
			 
			 switch(num) {
			 case 1:
				 System.out.println("--------");
				 System.out.println("계좌생성");
				 System.out.println("--------");
				 System.out.print("계좌번호 : ");
				 String ano = sc.nextLine();
				 System.out.print("계좌주 : ");
				 String owner = sc.nextLine();
				 System.out.print("초기입금액 : ");
				 int balence = Integer.parseInt(sc.nextLine());
				 				 
				 ac = new Account(ano, owner, balence);
				 for(int i = 0; i < accounts.length; i++) {
					 if(accounts[i] == null) {
						 accounts[i] = ac;
						 System.out.println("결과 : 계좌가 생성되었습니다.");						 
						 break;
					 }
				 }
				 
				 break;
			 case 2:
				 System.out.println("--------");
				 System.out.println("계좌목록");
				 System.out.println("--------");
				 for(Account account : accounts) {
					 if(account != null) {						 
						 System.out.printf("%s %s %d \n", account.getAno(), account.getOwner(), account.getBalence());
					 }
				 }
				 break;
			 case 3:
				 System.out.println("--------");
				 System.out.println("예금");
				 System.out.println("--------");
				 System.out.println("계좌번호 : ");
				 ano = sc.nextLine();
				 System.out.println("예금액 : ");
				 balence = Integer.parseInt(sc.nextLine());
				 for (Account account : accounts){
					 if(account.equals(ano = sc.nextLine())){
						 System.out.println(ano = sc.nextLine() + "는 계좌가 존재합니다.");
					 }
				 }
				 
			 case 4:
				 System.out.println("--------");
				 System.out.println("출금");
				 System.out.println("--------");
				 System.out.println("계좌번호 : ");
				 ano = sc.nextLine();
				 System.out.println("출금액 : ");
				 balence = Integer.parseInt(sc.nextLine());
			 case 5:
				 run = false;
			 }
		 }
		 
		 sc.close();
	}
	
}
