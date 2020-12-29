package packageEx2;

import packageEx.BclassEx;

public class CclassEx {
	
	static String a;
	static String b;
	
	public static void main(String[] args) {
		
		System.out.println(BclassEx.a); // BclassEx가 AclassEx 클래스를 상속받았기 때문
		System.out.println(BclassEx.b); 
	}

}
