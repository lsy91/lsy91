package inheritanceEx;

public class HTire extends Tire{

	public HTire(String location, int maxR) {
		super(location, maxR);
	}
	
	public boolean roll() {
		++accumR;
		
		if(accumR < maxR) {
			System.out.println(location + "HTire 수명: " + (maxR-accumR) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HTire 펑크***");
			return false;
		}
	}
}
