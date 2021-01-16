package polymorphismEx2;

class Car {
	String color = "white";
	int door = 4;

	void drive() {
		System.out.println("drive~");
	} // dirve

	void stop() {
		System.out.println("stop!");
	} // stop

} // Car

class FireEngine extends Car {

	int door = 6;
	int wheel = 10;

	void drive() {
		System.out.println("FEdrive~");
	}

	void water() {
		System.out.println("water!!");
	}
}

public class Ex08_polymorphism {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
//		car = fe; // 부모 객체가 자식 객체에 접근   // 서로 다른 클래스라서 원래는 불가능하지만 상속관계라서 가능하다.
		car = (Car) fe; // 업캐스팅 (자식타입 -> 부모타입) // 자동형변환 => (Car) 생략 가능
		System.out.println(car.door);
		System.out.println(car.color);
//		System.out.println(car.wheel); // 부모 객체가 자식 클래스 메모리에 접근하더라도 자식 고유의 변수에는 접근할 수 없다.  

		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);

		car.drive(); // 부모 클래스 내에도 drive 메서드가 있고, 상속관계이기 떄문에 자식객체의 메서드를 쓸 수 있다. (부모가 자식 메서드를 쓰려면 조건이
						// 까다롭다.)
//		car.water(); // 하지만 조건이 충족되는 경우에 한해서 자식 변수와 달리 자식 메서드는 호출할 수 있다.

		fe.drive();
		fe.water();

		fe2 = (FireEngine) car; // 다운캐스팅(부모타입->자식타입) // 강제형변환
		fe2.water();
		fe2.drive();
	}

}