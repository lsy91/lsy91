package classEx2;

public class Encap3 {
	
	public int a = 1;
	protected int b = 1;
	int c = 1;
	private int d =1;
	
	private int getA() {
		return a;
	}
	
	int getB() {
		return b;
	}
	
	protected int getC() {
		return c;
	}
	
	public int getD() {
		return d;
	}
}
