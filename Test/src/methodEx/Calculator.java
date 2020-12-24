package methodEx;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public float div(int a, int b) {
		return (float)a/(float)b;
	}
	
	public void printAdd(int a, int b) {
		System.out.println("result1: " + add(a,b));
	}
	
	public void printSub(int a, int b) {
		System.out.println(sub(a,b));
	}
	
	public void printMul(int a, int b) {
		System.out.println(mul(a,b));
	}
	
	public void printDiv(int a, int b) {
		System.out.println("result2: " + div(a,b));
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double add(double a, double b, double c) {
		return a+b+c;
	}
	
	public void disp(int a, int b, char c) {
		String x = new String();
		for(int i=0; i<a-b; i++) {
			x = x+c;
		}
		System.out.println(a-b+"\t"+x);
	}
	
	public void disp(char a, char b, int c) {
		String x = new String();
		for(int i=0; i<c; i++) {
			if(i%2 != 0) {
				x = x+a;
			}
			else {
				x = x+b;
			}
		}
		System.out.println(c+"\t"+x);
	}
	
	public double areaRectangle(double a) {
		return a*a;
	}
	
	public double areaRectangle(double a, double b) {
		return a*b;
	}
}
