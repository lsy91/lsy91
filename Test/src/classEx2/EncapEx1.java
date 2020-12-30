package classEx2;

public class EncapEx1 {

	public static void main(String[] args) {
		
		Encap1 ec1 = new Encap1();
//		ec1.a = 1; // 필드로는 사용할 수 없음
//		System.out.println("a :" +ec1.a);
		
		System.out.println("b :" +ec1.b);
		System.out.println("c :" +ec1.c);
		System.out.println("d :" +ec1.d);
		System.out.println("a :" +ec1.getA());
	}

}
