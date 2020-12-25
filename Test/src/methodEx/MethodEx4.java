package methodEx;

public class MethodEx4 {
	
	public void hap(int a, int b) {
		System.out.println("합 :"+(a+b));
	}
	
	public void hap(double a, double b) {
		System.out.println("합 :"+(a+b));
		
	}
	
	public void hap(double a, int b, int c) {
		System.out.println("합 :"+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		MethodEx4 me = new MethodEx4();
		me.hap(5,2);
		me.hap(3,7);
		me.hap(10.5,4);
		me.hap(10.5,4);
		me.hap(10, 4);
		me.hap(10.5, 4, 5);

	}

}
