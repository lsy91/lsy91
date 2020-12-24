package methodEx;

public class CalculatorEx {

	public static void main(String[] args) {
		
		int a=10, b=1;
		
		Calculator calculator = new Calculator();
		
		System.out.println("전원을 켭니다.");
		calculator.printAdd(a, b);
		
		a = 5;
		b = 2;
		
		calculator.printDiv(a, b);
		System.out.println("전원을 끕니다.");

	}

}
