package classEx2;

public class Encap1 {
	
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public int getA() {
		return a; // private 필드지만 public 메서드로 제한을 풀어줘서 다른 클래스에서 메서드로는 사용할 수 있음
	}
}
