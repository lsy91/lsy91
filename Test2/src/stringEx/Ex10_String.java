package stringEx;

public class Ex10_String {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("hello");
		
		boolean result1 = s1.equals(s2); // 문자열 비교 메서드 (대소문자 구분)
		System.out.println("result1:" + result1);
		
		System.out.println(s1 == s2); // 주소값 비교 메서드 (문자열이 같아도 무의미)
		
		boolean result2 = s1.equalsIgnoreCase(s2); // 대소문자 상관없이 비교
		System.out.println("result2:" + result2);
		
		int len = s1.length();
		System.out.println("len:" + len); // 문자열의 문자개수
		
		System.out.println(s1.toString()); // 원래는 Object 클래스의 기능으로 해당 문자열의 주소값을 리턴하는 메서드지만, 
										   // String 클래스가 Object 클래스를 상속받았기 때문에 변수의 값을 출력하게끔 오버라이딩함
										   // String 클래스의 toString() 메서드는 변수에 저장된 값을 출력하는 기능을 하기 때문
		
		
		String s3 = "apple,banana orange,melon#pear";
		String s[] = s3.split(","); // s3 의 값을 ,를 기준으로 쪼개라
		
		System.out.println(s.length);
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
			
		}

	}

}
