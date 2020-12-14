package stringEx;

public class StringEx01 {

	public static void main(String[] args) {
		
		String a = "Hello Java";
		String b = "Hello Java";
		String c = new String("Hello Java");
		String d = new String("Hello Java");
		String e = new String("Hello J");
		
		System.out.println(a.equals(b)); // 문자열이 같은지 체크
		System.out.println(a.equals(c)); 
		System.out.println(a==b); // 리터럴이 같으면 동일한 String 객체를 참조한다(자바특)
		System.out.println(a!=b); 
		System.out.println(a==c); // 리터럴은 같지만 번지가 다르다
		System.out.println(a!=c); 
		System.out.println(a==e); // 리터럴도 다르고 번지도 다르다
		System.out.println(a!=e);
		System.out.println(c==d); // 리터럴은 같지만 번지가 다르다
		System.out.println(c!=d); 
		System.out.println(c==e); // 리터럴도 다르고 번지도 다르다
		System.out.println(c!=e);
		
		// == 연산자는 리터럴보다 번지값을 우선순위로 체크하여 true/false를 산출하는듯

	}

}
