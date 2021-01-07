package interfaceEx2;

public class Robot implements RobotControl, Attackable{
	
	public int move;
	
	public Robot(int move) {
		this.move = move;
	}
	
	public void change() {
		System.out.println("변신 완료");
	}
	
	public void turnOn() {
		System.out.println("시스템을 가동합니다.");
	}
	
	public void turnOff() {
		System.out.println("시스템을 정지합니다.");
	}
	
	public void move() {
		
	}

	public void attackable() {
		System.out.println("공격 준비 완료");
	}
}
