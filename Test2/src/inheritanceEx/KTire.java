package inheritanceEx;

public class KTire extends Tire{
	
	public KTire(String location, int maxR) {
		super(location, maxR);
	}
	
	public boolean roll() {
		++accumR;
		
		if(accumR < maxR) {
			System.out.println(location + "KTire 수명: " 
							+ (maxR-accumR) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + "KTire 펑크***");
			return false;
		}
	}
}
