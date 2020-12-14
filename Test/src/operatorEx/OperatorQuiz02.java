package operatorEx;

public class OperatorQuiz02 {

	public static void main(String[] args) {
		
//		double a = 10 / 0; // ArithmeticException
		double b = 100 / 0.0; // infinity
		double c = 100 % 0.0; // Nan
		
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
