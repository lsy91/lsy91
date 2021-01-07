package interfaceEx2;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		RemoteCon rc1 = new Television();
		rc1.turnOn();
		rc1.setVolume(10);
		rc1.setMute(true);
		rc1.turnOff();
		
		RemoteCon rc2 = new Audio();
		rc2.turnOn();
		rc2.setMute(false);
		rc2.turnOff();
		RemoteCon.changeBattery(); //정적 메서드 쓰는 방법 : 클래스로 직접 접근
	}
	
//	TV를 켭니다.
//	현재 TV 볼륨: 10
//	무음 처리합니다.
//	TV를 끕니다.
//	Audio를 켭니다.
//	무음 해제합니다.
//	Audio를 끕니다.
//	건전지를 교환합니다.
}
