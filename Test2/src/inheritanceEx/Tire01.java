package inheritanceEx;

public class Tire01 {
	
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire01(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: "
								+ (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}
