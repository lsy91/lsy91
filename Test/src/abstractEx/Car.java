package abstractEx;

public abstract class Car {
	
	public int speed;
	public String model;
	public String color;
	
	public Car(int speed, String model, String color) {
		this.speed = speed;
		this.model = model;
		this.color = color;
	}
	
	public void turnOn() {};
	
	public void turnOff() {};
	
	public void seatBelt() {};
	
	public void run(int speed) {
		System.out.println(speed + "km/h 속도로 달립니다.");
	}
	
	public void stop() {};
	
	
}
