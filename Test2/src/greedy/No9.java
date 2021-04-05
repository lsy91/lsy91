package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No9 {

	public static void main(String[] args) {
		
		int[] answers = {1,3,2,4,2};
		
		int[] answer = solution(answers);
		
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] answers) {
		
		int[][] mathGiveUp = {
				{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}
		};
		
		int[] result = new int[4];
		
		for(int i=0; i<answers.length; i++) {
			
			int man1 = mathGiveUp[0][(i % mathGiveUp[0].length)];
			int man2 = mathGiveUp[1][(i % mathGiveUp[1].length)];
			int man3 = mathGiveUp[2][(i % mathGiveUp[2].length)];
			
			if(man1 == answers[i]) result[1] += 1;
			if(man2 == answers[i]) result[2] += 1;
			if(man3 == answers[i]) result[3] += 1;
		}
		
		Map<Integer, List<Integer>> m = new HashMap<Integer,List<Integer>>();
		
		for(int i=1; i<4; i++) {
			if(m.get(result[i]) == null) {
				m.put(result[i], new ArrayList<Integer>());
				m.get(result[i]).add(i);
			} else {
				m.get(result[i]).add(i);
			}
		}
		
		Arrays.sort(result);
		
		List<Integer> end = m.get(result[3]);
		
		int[] answer = new int[end.size()];
		
		for(int i=0; i<end.size(); i++) {
			answer[i] = end.get(i);
		}
		
		return answer;
	}
}
