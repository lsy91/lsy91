package classEx;

public class Car02 {
	String model;
	String color;
	int maxSpeed;

	Car02(String model) {
		super();
		this.model= model;
		System.out.println("모델: "+this.model);
	}

	Car02(int maxSpeed) {
		this.maxSpeed=maxSpeed;
		System.out.println("최고속도: " + this.maxSpeed);
	}

	Car02(String color, int maxSpeed) {
		this.color=color;
		this.maxSpeed=maxSpeed;
		System.out.println("색깔: " + this.color);
		System.out.println("최고속도: " + this.maxSpeed);
	}

	Car02(String model, String color) {
		this.model= model;
		this.color=color;

		System.out.println("모델: " + this.model);
		System.out.println("색깔: " + this.color);

	}

	Car02(String model, String color, int maxSpeed) {
		this.model= model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		System.out.println("모델: " + this.model);
		System.out.println("색깔: " + this.color);
		System.out.println("최고속도: " + this.maxSpeed);
	}
}

