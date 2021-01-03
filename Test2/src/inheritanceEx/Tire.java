package inheritanceEx;

public class Tire {
	
	public int maxR;
	public int accumR;
	public String location;
	
	public Tire(String location, int maxR) {
		this.location = location;
		this.maxR = maxR;
	}
	
	public boolean roll() {
		++accumR;
		if(accumR<maxR) {
			System.out.println(location + " Tire 수명: "
									+ (maxR-accumR) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}
