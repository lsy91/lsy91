package inheritanceEx;

public class HTire01 extends Tire01 {

	public HTire01(String location, int maxRotation) {
		super(location, maxRotation);
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " HTire 펑크 ***");
			return false;
		}
	}
}
