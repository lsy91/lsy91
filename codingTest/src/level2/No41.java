package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No41 {
	
	public static void main(String[] args) {
		
		String[] words = {
				"hello","one","even","never","now","world","draw"
		};
		
		int n = 2;
		
		int[] result = solution(n, words);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] solution(int n, String[] words) {
		
		int[] peoples = new int[n+1];
		
		int peopleIndex = 0;
		
		Map<String, Integer> duplicate = new HashMap<String,Integer>();
		
		char prevChar = words[0].charAt(0);
		
		for(int i=0; i<words.length; i++) {
			
			if(i % n == 0) peopleIndex = 0;
			
			peopleIndex++;
			peoples[peopleIndex]++;
			
			char nextChar = words[i].charAt(0);
			
			if(prevChar == nextChar && duplicate.get(words[i]) == null) {
				duplicate.put(words[i], i);
				prevChar = words[i].charAt(words[i].length()-1);
			}
			else {
				return new int[] {peopleIndex, peoples[peopleIndex]};
			}
		}
		
		return new int[] {0,0};
	}
	
	// Arrays.asList의 contains를 활용
	// java.util.ArrayList 클래스와는 다른 클래스이다.
	// java.util.Arrays.ArrayList 클래스는 set(), get(), contains() 메서드를 가지고 있지만 원소를 추가할 수 없어서 사이즈를 변경할 수 없다.
	
	private static int[] solution2(int n, String[] words) {
		
		String[] temp = new String[words.length];
		
		char prevChar = words[0].charAt(0);
		
		for(int i=0; i<words.length; i++) {
			
			char nextChar = words[i].charAt(0);
			
			if(prevChar != nextChar || Arrays.asList(temp).contains(words[i])) {
				return new int[] { (i%n)+1 , (i/n)+1 };
			}
			else {
				temp[i] = words[i];
				prevChar = words[i].charAt(words[i].length()-1);
			}
		}
		
		return new int[] {0,0};
	}
}
