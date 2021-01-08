package exceptionEx;

public class FinallyTest {
	
	public void shouldBeRun() {
		System.out.println("ok thanks.");
	}
	
	public static void main(String[] args) {
		
		FinallyTest test = new FinallyTest();
		
		int c;
		
		try {
			c = 4 / 0; //try 블럭 안의 조건이 불가능하면
		} catch (ArithmeticException e) {
			c = -1; // catch 안의 조건대로 실행
			System.out.println(c);
		} finally {
			test.shouldBeRun();
		}
		
//		-1
//		ok thanks.
	}
}
