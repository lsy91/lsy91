package ioEx;

public class PrintEx3 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int result = x + y;
		int r = x / y;
		int e = x % y;
		int s = x * y;
		int l = x - y;
		double u = x / y;
		
		System.out.println(result); // 3
		System.out.println(r); // 0
		System.out.println(e); // 1
		System.out.println(s); // 2
		System.out.println(l); // -1
		System.out.printf("%1$f", u); // 0.000000

	}

}
