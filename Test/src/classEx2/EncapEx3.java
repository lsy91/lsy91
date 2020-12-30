package classEx2;

public class EncapEx3 {

	public static void main(String[] args) {
		
		Encap3 ec3 = new Encap3();
		
		System.out.println("a : " +ec3.a);
		System.out.println("b : " +ec3.b);
		System.out.println("c : " +ec3.c);
//		System.out.println("d : " +ec3.d) ; // private 필드라서 불가
		
		System.out.println();
		
//		System.out.println("a : " +ec3.getA()); // private 메소드라서 불가
		System.out.println("b : " +ec3.getB());
		System.out.println("c : " +ec3.getC());
		System.out.println("d : " +ec3.getD());
	}

}
