package methodEx2;

public class TestMethod1 {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		TestMethod1 myTest = new TestMethod1();
		
		int c = myTest.sum(2, 3);
		System.out.println(c);
	}

}
