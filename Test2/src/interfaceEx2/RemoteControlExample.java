package interfaceEx2;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		SmartTelevision stv = new SmartTelevision();
		
		RemoteControl rc = stv; // 자동 타입 변환
		Searchable searchable = stv; // 강제 타입 변환
		
		stv.turnOn();
		stv.setVolume(10);
		stv.setMute(true);
		stv.turnOff();
		stv.search("http://naver.com");
		
		
//		TV를 켭니다.
//		현재 TV 볼륨: 10
//		무음 처리합니다.
//		TV를 끕니다.
//		http://naver.com을 검색합니다.
	}

}
