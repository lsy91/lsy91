package inheritanceEx;

public class KTire01 extends Tire01{
	
	public KTire01(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KTire 수명: "
					+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location
					+ " KTire 펑크 ***");
			return false;
		}
	}
}
