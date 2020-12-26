package methodEx2;

public class TestMethodVar22 {
	
	int a;
	
	public void vartest(TestMethodVar22 test) {
		test.a = a + 2; // test.a 가 객체로 전달되면서 myTest.a가 된다.
	}
	
	public static void main(String[] args) {
		
		TestMethodVar22 myTest = new TestMethodVar22();
		myTest.a = 1;
		myTest.vartest(myTest);
		
		System.out.println(myTest.a); // 3

	}

}
