package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class No34 {
	
	static int index = 0;
	
	public static void main(String[] args) {
		
		String[] strings = {
				"abce","abcd","cdx"
		};
		
		int n = 1;
		
		index = n;
		
		String[] result = solution3(strings,n);
		
		System.out.println(Arrays.toString(result));
	}
	
	// 최초풀이.
	
	public static String[] solution(String[] strings, int n) {
		
		String[] answer = new String[strings.length];
		
		// key는 char, value는 같은 캐릭터를 가지고 있는 index 번호이다.
		Map<Character,ArrayList<Integer>> box = new HashMap<Character,ArrayList<Integer>>();
		
		int keySize = 0;
		
		for(int i=0; i<strings.length; i++) {
			
			char c = strings[i].toCharArray()[n];
			if(box.get(c) == null) {
				box.put(c, new ArrayList<Integer>());
				keySize++;
			}
			
			box.get(c).add(i);
		}
		
		Iterator itr = box.keySet().iterator();
		
		char[] standardChar = new char[keySize];
		
		for(int r=0; r<keySize; r++) {
			standardChar[r] = (char)itr.next();
		}
		
		Arrays.sort(standardChar);
		
		int index = 0;
		
		for(int i=0; i<standardChar.length; i++) {
			
			ArrayList<Integer> data = box.get(standardChar[i]);
			
			String[] temp = new String[data.size()];
			
			for(int j=0; j<data.size(); j++) {
				temp[j] = strings[data.get(j)];
			}
			
			Arrays.sort(temp);
			
			for(int k=0; k<temp.length; k++) {
				answer[index] = temp[k];
				index++;
			}
		}
		return answer;
	}
	
	// comparator를 사용한 풀이
	public static String[] solution2(String[] strings, int n) {
		
		String[] answer = new String[strings.length];
		
		Arrays.sort(strings, new Comparator<String>() {
		
				@Override
				public int compare(String o1, String o2) {
					if( o1.charAt(n) > o2.charAt(n)) return 1;
					else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
					else if (o1.charAt(n) < o2.charAt(n)) return -1;
					
					return 0;
				}
		});
		
		answer = strings;
		
		return answer;
	}
	
	public static String[] solution3(String[] strings, int n) {
		
		String[] answer = new String[strings.length];
		
		for(int i=0; i<strings.length; i++) {
			strings[i] = String.valueOf(strings[i].toCharArray()[n] + strings[i]);
		}
		
		Arrays.sort(strings);
		
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].substring(1, strings[i].length());
		}
		
		answer = strings;
		
		return answer;
	}
}
