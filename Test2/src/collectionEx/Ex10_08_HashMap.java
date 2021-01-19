package collectionEx;

import java.util.HashMap;
import java.util.Scanner;

public class Ex10_08_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		
		// System.out.println(dic.containsValue("연필")); // containsValue 라고해서 value값이 꼭 Integer가 아니여도 된다.
		
		System.out.println(dic);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾는 단어는?(q입력시 종료)");
			String str = sc.next();
			
			if(str.equals("q")) break;
			
			// if(dic.get(str) == null) {
			if(dic.containsKey(str) == false) {
				System.out.println("잘못입력하셨음");
			}
			else {
				System.out.println("뜻:" + dic.get(str));
			}
		} // while
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
