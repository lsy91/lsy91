package polymorphismEx2;

class Robot {

}

class DanceRobot extends Robot {

	void dance() {
		System.out.println("춤을 춥니다.");
	}
} // DanceRobot

class SingRobot extends Robot {

	void sing() {
		System.out.println("노래를 합니다.");
	}
} // SingRobot

class DrawRobot extends Robot {

	void draw() {
		System.out.println("그림을 그립니다.");
	}
} // DrawRobot

public class Ex09_polymorphism {

	public static void main(String[] args) {

		DanceRobot dc = new DanceRobot();
		dc.dance();

		SingRobot sr = new SingRobot();
		sr.sing();

		Robot dc2 = new DanceRobot(); // 상속관계일 경우 부모타입으로 자식객체를 관리할 수 있다.
//		dc2.dance(); // 부모클래스에 dance 메서드가 없어서 자식 메서드를 쓸 수 없다.
		Robot sr2 = new SingRobot();
		Robot dr2 = new DrawRobot();

		Robot arr[] = { new DanceRobot(), // 자식클래스가 부모타입으로 업캐스팅 되었을 때, 같은 타입끼리는 배열로 관리할 수 있다.
				new SingRobot(), new DanceRobot() };

//		arr[0].dance();

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		} // for

	} // main

	static void action(Robot r) {
		// Robot r = (Robot)new DanceRobot();
		// Robot r = (Robot)new SingRobot();
		// Robot r = (Robot)new DrawRobot();

//		r.dance();
		if (r instanceof DanceRobot) { // true
			DanceRobot dr = (DanceRobot) r; // 강제형변환
			dr.dance(); // 강제형변환만으로는 이 메서드를 쓸 수 없다. 왜냐하면 for문으로 돌린 배열이라 SingRobot 타입이나 DrawRobot 타입 차례에
						// 이 메서드는 쓸 수 없기 때문.
						// 그래서 이렇게 if문을 이용해서 메서드 사용가능 범위를 확정해 주어야 한다.
		} else if (r instanceof SingRobot) { // instanceof => r을 SingRobot 타입으로 다운캐스팅할 수 있는지 여부 알아보는 메서드
			SingRobot sr = (SingRobot) r;
			sr.sing();
		} else if (r instanceof SingRobot) {
			DrawRobot dw = (DrawRobot) r;
			dw.draw();
		}
	}

} // class