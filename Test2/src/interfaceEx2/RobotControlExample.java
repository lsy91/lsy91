package interfaceEx2;

public class RobotControlExample {

	public static void main(String[] args) {
		
		Sunguard sg = new Sunguard();
		
		RobotControl rc = sg;
		Attackable att = sg;
		
		sg.turnOn();
		sg.change();
		sg.setMove(true);
		sg.setMove(false);
		RobotControl.changeBattery();
		sg.setMove(true);
		sg.step();
		sg.attackable();
		sg.attack();
		sg.turnOff();
		
//		시스템을 가동합니다.
//		변신 완료
//		움직입니다.
//		멈춥니다.
//		건전지를 교환합니다.
//		움직입니다.
//		1보 후퇴합니다.
//		공격 준비 완료
//		미사일 발사
//		시스템을 정지합니다.
	}

}
