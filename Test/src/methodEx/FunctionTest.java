package methodEx;

public class FunctionTest {
	
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		
		int s = addNum(n1,n2);
		System.out.println(s); // 40
	}
}
