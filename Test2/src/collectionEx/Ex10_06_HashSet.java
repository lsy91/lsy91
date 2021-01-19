package collectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class Ex10_06_HashSet {

	public static void main(String[] args) {
		
		// List : 순서가 있다. 중복허용 한다.
		// Set : 순서가 없다. 중복허용 안 한다.
		
		HashSet<String> hs = new HashSet<String>(); // Set 인터페이스를 상속한다.
		// Set<String> hs = new HashSet<String>(); // 도 가능. 근데 Set 유틸을 import 해줘야한다.
		System.out.println(hs.size());
		
		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("aa");
		hs.add("dd");
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		// System.out.println(hs.get(1)); // 순서가 없기 때문에 에러
		
		Iterator<String> iter = hs.iterator();
		
		while(iter.hasNext()) { // true 아니면 false 값을 가지는 메서드다. iter.hasNext() 안에 값이 하나라도 저장돼 있으면 true 없으면 false
			System.out.println(iter.next()); // iter 객체 안의 값을 하나씩 출력한다.
		} // while
		
		System.out.println(hs.contains("bb")); // hs 해쉬셋 안에 해당 리터럴이 포함되어 있는지 확인 (T or F)
		
		System.out.println(hs.contains("xy"));
		
		
		
		// 1~10 사이 정수 난수발생
		// System.out.println(Math.random());
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		int i = 0;
		while(true) {
			i++;
			int num = (int)(Math.random()*10)+1; // Math.random은 클래스라서 유틸없이 사용가능
			hs2.add(num);
			// System.out.println(num);
			if(hs2.size() == 6) break;
		}
		
		System.out.println("i:" + i);
		System.out.println(hs2); // 원래 순서가 없지만 숫자는 정렬해서 출력해준다.
	}

}
