package chap04;

public class Exam182 {

	public static void main(String[] args) {
		
		// 2번
		// 3번
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			System.out.println(num1 + "," + num2);
			if(num1 + num2 == 5) {
				break;
			}
		}
		
		// 4번
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if((4*i)+(5*j) == 60) {
					System.out.printf("(%d,%d) ", i, j);
				}
			}
		}
		System.out.println();
		
		// 5번
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("   *");
		System.out.println("  **");
		System.out.println(" ***");
		System.out.println("****");
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			for(int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
