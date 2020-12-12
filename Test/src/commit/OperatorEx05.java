package commit;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		short a = 20, b = 10; float b1 = 3;
		
		int c1 = a+b;
		int c2 = a-b;
		int c3 = a*b;
		int c4 = a/b; //
		int c5 = a%b; // 나머지
		
		int c41 = a/b; 
		float c42 = a/b1; // a 업캐스팅
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println(c41);
		System.out.println(c42);
		
		System.out.println(c5);
	}

}
