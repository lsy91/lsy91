package packageEx;

public class Bclass2 {
	
	public Bclass2() {
		Aclass2 a = new Aclass2();
		
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // Aclass2 클래스의 private 필드라서 빌려쓸 수 없음
		
		a.method1();
		a.method2();
//		a.method3(); // Aclass2 클래스의 private 메서드라서 빌려쓸 수 없음
	}
}
