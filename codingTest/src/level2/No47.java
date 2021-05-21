package level2;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class No47 {

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;

		// 캐시율이 0인 경우
		if (cacheSize == 0)
			return 5 * cities.length;
		
		Map<String, Integer> cacheBox = new LinkedHashMap<String, Integer>();
		List<String> cacheBox2 = new LinkedList<String>();
		
		for (int i=0; i<cities.length; i++) {
			
			String city = cities[i].toUpperCase();
			
			int time = 5;
			
			if(cacheBox.get(city) == null) {
				
				// cacheSize 보다 작으면 add는 필수
				if( cacheBox.size() < cacheSize) {
					cacheBox.put(city,1);
					cacheBox2.add(city);
				}
				else { // cacheSize의 경우에는 우선순위만 변경
					cacheBox.put(city, 1);
					cacheBox2.add(city);
					
					cacheBox.remove(cacheBox2.get(0));
					cacheBox2.remove(0);
				}
			}
			else { // cache에 있던 것을 또 접근해 주었을 때는 우선순위가 변경되어야 한다.
				time = 1;
				cacheBox2.remove(city); // object로 제거가능
				cacheBox2.add(city);
			}
			
			answer += time;
		}
		
		return answer;

	}

}
