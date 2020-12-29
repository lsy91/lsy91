package packageEx2;

import packageEx.Aclass2;

public class Cclass2 {
	
	public Cclass2() {
		
		Aclass2 a = new Aclass2();
		
		a.field1 = 1;
//		a.field2 = 1; // 다른 패키지 필드라서 (default)
//		a.field3 = 1; // private 필드라서
		
		a.method1();
//		a.method2(); // 다른 패키지 메서드라서 (default)
//		a.method3(); // private 메서드라서 에러
		
	}
}
