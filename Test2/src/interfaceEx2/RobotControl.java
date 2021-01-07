package interfaceEx2;

public interface RobotControl {
	
	void turnOn();
	void turnOff();
	void move();
	
	default void setMove(boolean move) {
		if(move) {
			System.out.println("움직입니다.");
		}
		else {
			System.out.println("멈춥니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
