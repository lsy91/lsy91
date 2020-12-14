package stringEx;

public class StringEx02 {

	public static void main(String[] args) {
		
		String a = "Hello Java";
		
		System.out.println(a.indexOf("Java"));
		// 매개변수가 문자열에서 몇 번째부터 시작되는지 (공백은 신경안씀)
		System.out.println(a.replaceAll("Java", "World"));
		// , 앞의 문자나 문자열을 , 뒤의 문자나 문자열로 바꾸는 메서드 
		System.out.println(a.substring(0,4));
		// 문자열에서 0번째 문자부터 4번째 문자까지만 출력
		System.out.println(a.toUpperCase());
		// 대소문자 상관없이 싹 다 대문자로
		System.out.println(a.toLowerCase());
		// 대소문자 상관없이 싹 다 소문자로
	}

}
