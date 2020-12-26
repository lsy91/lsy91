package methodEx2;

public class TestMethodObj {
	
	int a;
	
	public void vartest(TestMethodObj test) {
		test.a++;
	}
	
	public static void main(String[] args) {
		
		TestMethodObj myTest = new TestMethodObj();
		myTest.a = 1; 
		myTest.vartest(myTest);
		System.out.println(myTest.a); // 2
	}

}
