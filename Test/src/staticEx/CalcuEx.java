package staticEx;

public class CalcuEx {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calcu.pi;
		int result2 = Calcu.plus(10,5);
		int result3 = Calcu.minus(10,5);
		
		System.out.println("result1 :"+result1); // 314.159
		System.out.println("result2 :"+result2); // 15
		System.out.println("result3 :"+result3); // 5

	}

}
