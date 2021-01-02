package abstractEx;

public class Ferrari extends Car{
	
	public Ferrari(int speed, String model, String color) {
		super(speed, model, color);
	}
	
	public void turnOn() {
		System.out.println(this.model + "에 시동을 겁니다.");
	}
	public void seatBelt() {
		System.out.println("안전벨트를 맵니다.");
	}
	public void run() {
	}
	public void stop() {
		System.out.println(this.model + "가 멈춥니다.");
	}
	public void turnOff() {
		System.out.println(this.model + "의 시동을 끕니다.");
	}
	
}
