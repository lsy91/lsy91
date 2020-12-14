package operatorEx;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		byte b1 = 10;
		int b2 = ~b1; // ~ 연산자가 붙는 즉시 b1은 int로 업캐스팅
		int b3 = ~b1 + 1; // 1의 보수로 b1의 부호가 반대인 값을 얻는 방법
		
		System.out.println(b2);
		System.out.println(b3);

	}

}
