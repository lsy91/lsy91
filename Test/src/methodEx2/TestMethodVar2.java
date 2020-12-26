package methodEx2;

public class TestMethodVar2 {
	
	public int vartest(int a) {
		a++;
		return a;
	}
	
	public static void main(String[] args) {
		int a = 1;
		
		TestMethodVar2 myTest = new TestMethodVar2();
		
		a = myTest.vartest(a);
		System.out.println(a); // 2

	}

}
