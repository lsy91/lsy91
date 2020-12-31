package inheritanceEx2;

public class CellPhone {
	
	String model;
	String color;
	
	public void setOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void setKatalk() {
		System.out.println("카톡 카톡~");
	}
	
	public void sendMsg(String message) {
		System.out.println("나: " + message);
	}
	
	public void receiveMsg(String message) {
		System.out.println("친구: " + message);
	}
	
	public void endKatalk() {
		System.out.println("카톡 종료");
	}
}
