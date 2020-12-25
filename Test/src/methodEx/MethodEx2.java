package methodEx;

public class MethodEx2 {
	
	public void hap(int a, int b) {
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void gop(int a, int b) {
		int sum = 1;
		
		for(int i=a; i<=b; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		MethodEx2 me = new MethodEx2();
		me.hap(1, 10);
		me.gop(1, 10);
		
	}
}
