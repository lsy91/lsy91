package classEx;

public class Car4 {
	
	String model;
	String color;
	int maxSpeed; // 필드



	Car4(String model) {
		this.model = model;
	}

	Car4(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; // 생성자
	}
	
}
