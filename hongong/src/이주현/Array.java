package 이주현;

public class Array {

	public static void main(String[] args) {
		
		// 1.번
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			int ran = (int)(Math.random() * 100) + 1;
			nums[i] = ran;
		}

		int sum = 0;
		int max = 0;
		int min = 100;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			sum += nums[i];
			if(max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println();
		System.out.println("배열의 합계 : " + sum);
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최소값 : " + min);
		// 2.번
		int[][] su = {
				{1, 2, 3},
				{1, 2},
				{1},
				{1, 2, 3}
		}; 
		for(int i = 0; i < su.length; i++) {			
			for(int idx : su[i]) {
				System.out.print(idx + " ");
			}
			System.out.println();
		}
		// 3.번
		int[][] seat = new int[3][10];
		int cnt = 0;
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				int ran = (int)(Math.random() * 2);
				seat[i][j] = ran;
				System.out.print(seat[i][j] + " ");		
				if(ran == 1) {
					cnt++;
				}
			}
			System.out.println();
		}
		System.out.println("현재 관객 수 : " + cnt);
		// 4.번
		int[][] susu = new int [3][5];
		int avg = 0;
		int sum1 = 0;
		int cnt1 = 0;
		for(int i = 0; i < susu.length; i++) {
			for(int j = 0; j < susu[i].length; j++) {
				int ran = (int)(Math.random() * 51) + 50;
				susu[i][j] = ran;
				System.out.print(susu[i][j] + " ");
				sum = susu[i][i];
				cnt1++;
			}
			System.out.println();
//			avg = (double)sum1 / cnt1;
		}
		// 5.번
		// 6.번

	}

}
