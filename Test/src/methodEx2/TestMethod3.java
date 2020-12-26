package methodEx2;

public class TestMethod3 {
	
	public void sum (int a, int b) {
		System.out.println(a + " 과 " + b + "의 합은 "+ (a+b) + "입니다.");
	} // return 값이 없는 메서드
	
	public static void main(String[] args) {
		
		TestMethod3 myTest = new TestMethod3();
		myTest.sum(3, 4);
	}

}
