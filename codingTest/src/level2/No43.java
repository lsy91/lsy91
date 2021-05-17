package level2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class No43 {
	
	public int[] solution(String s) {
		
		int[] answer = {};
		
		s = s.substring(1, s.length()-1);
		s = s.replaceAll("\\}\\,\\{", "#");
		s = s.substring(1, s.length()-1);
		
		String[] arrS = s.split("#");
		
		// 이제 문자열 크기가 가장 작은 것부터 순서대로 LinkedHashSet에 넣어준다.
		// 문자열 크기가 가장 작은 대상을 기록한다.
		Map<Integer, Object> map = new TreeMap<>();
		
		for( int i=0; i<arrS.length; i++) {
			String[] tuple = arrS[i].split(",");
			map.put(tuple.length, tuple);
		}
		
		Iterator mapItr = map.keySet().iterator();
		
		Set<Integer> set = new LinkedHashSet<>();
		
		while(mapItr.hasNext()) {
			int key = (int)mapItr.next();
			String[] arr = (String[])map.get(key);
			
			for(String tuple : arr) {
				set.add(Integer.valueOf(tuple));
			}
		}
		
		answer = new int[set.size()];
		
		Iterator setItr = set.iterator();
		
		int index = 0;
		
		while(setItr.hasNext()) {
			answer[index] = (int) setItr.next();
			index++;
		}
		
		return answer;
	}
}
