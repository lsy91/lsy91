package inheritanceEx2;

public class MyCellPhone extends CellPhone{
	
	String channel;
	
	MyCellPhone(String model,String color, String channel) {
		this.model = model; // 자식클래스의 생성자로 부모클래스 CellPhone의 멤버변수를 호출
		this.color = color; // 자식클래스의 생성자로 부모클래스 Cellphone의 멤버변수를 호출
		this.channel = channel;
	}
	
	public void turnOnYt() {
		System.out.println("유튜브 " + channel + "를 시작합니다.");
	}
	
	public void changeChannelYt(String channel) {
		this.channel = channel;
		System.out.println("유튜브 " + channel + "으로 바꿉니다.");
	}
	
	public void turnOffYt() {
		System.out.println("유튜브 시청을 멈춥니다.");
	}
}
