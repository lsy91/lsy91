package interfaceEx2;

public class Sunguard extends Robot{
	
	private static int move;
	public int frontStep;
	public int backStep;
	
	public Sunguard() {
		super(move);
	}
	
	public boolean step() {
		++frontStep;
		if(frontStep > backStep) {
			System.out.println((frontStep-backStep) + "보 후퇴합니다.");
			return true;
		} else {
			System.out.println("싸웁니다.");
			return false;
		}
		
	}

	public void attack() {
		System.out.println("미사일 발사");
	}
	
}
