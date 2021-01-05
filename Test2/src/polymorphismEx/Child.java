package polymorphismEx;

public class Child extends Parent{
	
	public String field2;
	
	public void method2() {
		System.out.println("Child-method2()"); // 메서드 오버라이드
	}
	
	public void method3() {
		System.out.println("Child-method3()"); // Child 클래스(자식클래스)의 메서드
	}
}
