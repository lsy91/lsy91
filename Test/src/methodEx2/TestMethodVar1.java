package methodEx2;

public class TestMethodVar1 {
	
	public void vartest(int a) {
		a++;
	}
	public static void main(String[] args) {
		
		int a = 1;
		
		TestMethodVar1 myTest = new TestMethodVar1();
		myTest.vartest(a);
		
		System.out.println(a); // 1
	}

}
