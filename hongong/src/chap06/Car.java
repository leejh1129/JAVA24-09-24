package chap06;

public class Car {

	// 필드
	String company = "BMW";
	String model = "x6";
	String color = "검정";
	int maxSpeed = 400;
	int speed;
	int gas;
	
	// 생성자
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	//get 내부에서 외부로
	//set 외부에서 내부로
	
	int getSpeed() {
		return speed;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				return; // 메소드 종료
			}
		}
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run2() {
		for(int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}
	
	
}
