package operatorEx;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 10;
		
		boolean rt1 = (num1 == num2);
		boolean rt2 = (num1 != num2);
		boolean rt3 = (num1 <= num2);
		
		System.out.println(rt1);
		System.out.println(rt2);
		System.out.println(rt3);
		
		char char1 = 'a', char2 = 'b';
		boolean rt4 = (char1 > char2); // 해당 유니코드의 대소비교
		System.out.println(rt4);
	}

}
