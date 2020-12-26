package methodEx2;

public class TestMethod21 {

	int a;

	public int vartest(int a) {
		int result = a + 2;
		return result;
	}

	public static void main(String[] args) {
		
		int a = 1;
		TestMethod21 myTest = new TestMethod21();
		a = myTest.vartest(a);
		
		System.out.println(a);

	}
}
