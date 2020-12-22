package classEx;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car() {
			
			int a = 90;
			
			public int setSpeed() { // 메서드 오버라이딩
				speed = a;
				return speed;
			}
		};
		
		Car myCar2 = new Car("현대","제네시스");
		System.out.println("제작회사 :" + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색: " + myCar.color);
		System.out.println("최고속도: " +myCar.maxSpeed);
		System.out.println("Car speed 값: " + myCar.speed);
		System.out.println("현재속도: " + myCar.setSpeed());
		System.out.println(myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println(myCar2.company + " " + myCar2.model);

	}

}
