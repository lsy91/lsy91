package commit;

public class OperatorEx06 {

	public static void main(String[] args) {
		
		int x1 = 10000; int y1 = 10000;
		int z1 = x1 * y1;
		
		System.out.println(z1);
		
		int x2 = 1000000; int y2 = 1000000;
		int z2 = x2 * y2;
		
		System.out.println(z2); // 오버플로우
		
		long x3 = 1000000; long y3 = 1000000;
		long z3 = x3 * y3;
		
		System.out.println(z3);

	}

}
