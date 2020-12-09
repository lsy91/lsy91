package commit;

public class VariableEx4 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		short result = (short) (num1 + num2);
		System.out.println("형변환 : " + result); // int -> short 명시적 다운캐스팅
		
		float var1 = 10f;
		double var2 = var1;
		System.out.println("형변환 : " + var2); // float -> double 묵시적 업캐스팅
		
		double var3 = 10.5;
		int var4 = (int)var3;
		System.out.println("형변환 : "  + var4); // double -> int 명시적 다운캐스팅
	}

}
