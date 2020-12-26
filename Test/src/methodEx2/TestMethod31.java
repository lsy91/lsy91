package methodEx2;

public class TestMethod31 {

	public int sum (int a, int b) {
		return a + b;
	} // return값(입력값)과 출력값이 모두 있는 경우
	
	public static void main(String[] args) {
		
		TestMethod31 myTest = new TestMethod31();
		
		int a = myTest.sum(3, 4);
		
		System.out.println(a);
	}

}
