package numEx;

public class NumTask1 {

	public static void main(String[] args) {
		
		int i = 99;
		int j = 67;
		char a = 97;
		double x = 3.95;
		long y = 5;
		
		byte hap = (byte)(x+y);
		int gop = (int)(x*y);
		float div = (float)x/y;
		double rem = x%y;
		
		System.out.println((char)i); // c 유니코드 문자변환
		System.out.println((char)j); // C 유니코드 문자변환
		System.out.println((int)a); // 97 char타입 a -> int타입 숫자 97
		
		System.out.println(hap); // 3.95 중 3만 저장되어 3+5 = 8
		System.out.println(gop); // 19.75 중 int 타입으로 19만 저장 
		System.out.println(div); // 0.79 (int 타입의 두 수를 float타입으로 업캐스팅)
		System.out.println(rem); // 3.95 (x가 double 타입이기 때문에 y는 저절로 업캐스팅)
		

	}

}
