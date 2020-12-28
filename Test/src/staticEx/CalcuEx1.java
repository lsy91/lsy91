package staticEx;

public class CalcuEx1 {

	public static void main(String[] args) {
		
		Calcu1 myCalcu = new Calcu1();
		
		double result1 = 10 * 10 * myCalcu.pi;
		int result2 = myCalcu.plus(10,5);
		int result3 = myCalcu.minus(10,5);
		
		System.out.println("result1 :" + result1); // 314.159
		System.out.println("result2 :" + result2); // 15
		System.out.println("result3 :" + result3); // 5
	}

}
