package methodEx2;

public class TestMethod20 {
	
	public int vartest(int a) {
		a = a + 2;
		return a;
	}
	
	public static void main(String[] args) {
		
		int a = 1;
		
		TestMethod20 myTest = new TestMethod20();
		
		System.out.println(myTest.vartest(5)); // 7
		
		System.out.println(a); // 1
	}

}
