package methodEx2;

public class TestMethodVar11 {
	
	int a;
	
	public void vartest (TestMethodVar11 test) {
		test.a++;
	}
	
	public static void main(String[] args) {
		
		TestMethodVar11 myTest = new TestMethodVar11();
		
		myTest.a = 1;
		myTest.vartest(myTest);
		System.out.println(myTest.a); // 2

	}

}
