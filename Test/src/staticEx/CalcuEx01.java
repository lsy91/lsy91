package staticEx;

public class CalcuEx01 {

	public static void main(String[] args) {
		
		String r1 = "suyonglee";
		double r2 = Calcu01.in(2500000,  2300000);
		double r3 = Calcu01.out(2100000, 1400000);
		double r4 = r2 - r3;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
