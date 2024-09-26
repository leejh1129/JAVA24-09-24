package chap05;

public class Eaxm202_배열 {

	public static void main(String[] args) {
		
		// 배열을 생성
		// 배열을 이용하는 방법
		
		int [] scores = {83, 90, 87};
		
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[2] = " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.printf("평균 : %.6f", avg);
		

	}

}
