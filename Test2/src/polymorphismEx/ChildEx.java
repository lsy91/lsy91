package polymorphismEx;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1(); // Parent-method1()
		parent.method2(); // Child-method2() // 메서드 오버라이드로 값이 바뀜
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3(); // Child-method3()
	}

}
