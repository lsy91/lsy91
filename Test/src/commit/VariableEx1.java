package commit;

public class VariableEx1 {

	public static void main(String[] args) {
		
		int value = (int)10.5;
		byte value1 = 10;
		float value2 = 10.5f;
//		float value2 = (float)10.5; // 이렇게도 표현 가능
		double value3 = 10.5;
		
		int sum = value + 10;
		int mul = value * value1;
		int div = value / value1;
		int rem = value % value1;
		double rem1 = value / value3;
		
		byte a = 32;
		byte b = 127;
		byte c = (byte)(a+b); // 오버플로우
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c+"\n");
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		System.out.println(rem1);
	}

}
