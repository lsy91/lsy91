package commit;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
//		Object
//		  :
		ArrayList<String> list = new ArrayList<String>();
		list.size(); // 저장공간의 크기를 리턴
		int size = list.size();
		System.out.println("size: " + size); // 아직 아무 데이터도 입력하지 않았기 때문에 0
		
		list.add("태연"); // 0번째 리스트
		list.add("수영"); // 1번째 리스트
		list.add("윤아");      
		list.add("수영");		  	
		list.add("써니");
		
		size = list.size();
		System.out.println("size: " + size);
		System.out.println("list: " + list.toString());
		System.out.println("list: " + list);
		
		String get1 = list.get(1);
		System.out.println("get1:" + get1);
		
		list.add(1,"유리");
		System.out.println("list:" + list);
		
		list.remove("윤아");
		System.out.println("list:" + list);
		
		int pos1 = list.indexOf("수영");
		System.out.println("pos1:" + pos1);
		
		System.out.println(list.indexOf("효리")); // 리스트 안에 있으면 1, 없으면 -1
		
		System.out.println(list.contains("수영")); // 리스트 안에 있으면 true, 없으면 false
		
		list.set(1, "티파니"); // 1번째 리스트에 덮어쓰기
		System.out.println("list:" + list);

	}

}
