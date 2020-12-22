package classEx;

public class Car {
	
	String company = "기아", model = "V80", color = "검정색";
	
	public int maxSpeed=250, speed=0;
	
	Car() { // 생성자
		
	}
	
	Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public int setSpeed() { // setter 메서드
		return this.speed = 0;
	}
}
