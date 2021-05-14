package level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class No40 {
	
	public int solution(String str1, String str2) {
		
		Map<String, Integer> wordRecord = new HashMap<String, Integer>();
		Map<String, Integer> wordRecord2 = new HashMap<String, Integer>();
		
		calc(str1, wordRecord);
		calc(str2, wordRecord2);
		
		if(wordRecord.isEmpty() && wordRecord2.isEmpty()) return 65536;
		
		int intersectionCnt = 0;
		int unionCnt = 0;
		
		Iterator itr = wordRecord.keySet().iterator();
		
		while(itr.hasNext()) {
			
			String key = (String)itr.next();
			
			int value1 = wordRecord.get(key);
			int value2 = wordRecord2.getOrDefault(key, 0);
			
			if(value2 == 0) {
				unionCnt += value1;
			}
			else {
				int big = value1 > value2 ? value1 : value2;
				int small = value1 <= value2 ? value1 : value2;
				int minus = big-small;
				
				if(minus == 0) {
					intersectionCnt += small;
					unionCnt += small;
				} 
				else {
					intersectionCnt += small;
					unionCnt += big;
				}
				
				wordRecord2.remove(key);
			}
		}
		
		Iterator itr2 = wordRecord2.keySet().iterator();
		
		while(itr2.hasNext()) {
			unionCnt += wordRecord2.get(itr2.next());
		}
		
		if(intersectionCnt == 0) return 0;
		
		double result = (double)intersectionCnt / (double)unionCnt;
		
		return (int)(result * 65536);
	}
	
	private void calc(String str, Map<String,Integer> records) {
		
		for(int i=0; i<str.length()-1; i++) {
			String word = str.substring(i, i+2).toLowerCase();
			boolean check = Pattern.matches("^[a-z]*$", word);
			
			if(check) {
				records.put(word, records.getOrDefault(word, 0) + 1);
			}
		}
	}
}
