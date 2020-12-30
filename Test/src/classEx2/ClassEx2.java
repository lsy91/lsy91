package classEx2;

public class ClassEx2 {

	private String color;
	private int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public void speedUp(int su) {
		speed = speed + su;
	}
	public void speedDown(int sd) {
		speed = speed - sd;
	}
	
	public static void main(String[] args) {
		
		ClassEx2 car = new ClassEx2();
		car.setColor("빨간색");
		car.setSpeed(100);
		System.out.println("색상: " + car.getColor());
		System.out.println("속도: " + car.getSpeed());
		
		car.speedUp(10);
		System.out.println("속도: " + car.getSpeed());
		
		car.speedDown(20);
		System.out.println("속도: " + car.getSpeed());

	}

}
