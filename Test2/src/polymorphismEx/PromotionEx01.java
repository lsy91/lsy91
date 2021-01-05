package polymorphismEx;

public class PromotionEx01 {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		System.out.println("B객체를 A타입으로 변환: " + b.a); //2 -> 1
		System.out.println("C객체를 A타입으로 변환: " + c.a); //3 -> 1
		System.out.println("D객체를 B타입으로 변환: " + d.b); //4 -> 2
		System.out.println("E객체를 C타입으로 변환: " + e.c); //5 -> 3
	}

}
