package collectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10_07_HashMap {

	public static void main(String[] args) {
		
		// Map : 키(key), 값(value)의 쌍으로 저장
		// 키 : 중복 x
		// 값 : 중복 o
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		// Map<String,Integer> hm = new Map<String,Integer>(); // Map 클래스 상속
		
		System.out.println(hm.size());
		
		hm.put("슬기", 20);
		hm.put("조이", 30);
		hm.put("웬디", 40);
		hm.put("아이유", 30);
		// hm.put("슬기", 40); // 키가 중복되어도 에러가 나는건 아니지만 뒤에 오는 키값으로 덮어씌워 진다.
		
		System.out.println(hm);
		System.out.println(hm.get("조이"));
		System.out.println(hm.get("윤아")); // 없으면 null
		
		if(hm.get("윤아") == null) {
			System.out.println("해당 키는 없음");
		}
		
		// System.out.println(hm.get(30)); // get() 괄호 안에는 key값만 쓴다
		
		System.out.println(hm.containsKey("조이"));
		System.out.println(hm.containsKey("윤아"));
		
		System.out.println(hm.containsValue(30));
		System.out.println(hm.containsValue(300));
		
		System.out.println();
		
		Set<String> ks = hm.keySet(); // 키 값만 불러와서 변수에 저장
		System.out.println("ks:" + ks);
		
//		웬디 : 40
//		슬기 : 20
//		조이 : 30
//		아이유 : 30
		
		Iterator<String> iter = ks.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name + ":" + hm.get(name));
		}
		
		System.out.println();
		
		hm.remove("슬기");
		System.out.println(hm);
	}

}
