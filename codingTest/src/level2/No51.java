package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class No51 {
	
	public static void main(String[] args) {
		
		int stock = 3;
		int[] dates = {4,10,15};
		int[] supplies = {20,5,10};
		int k = 1;
		
		int answer = solution(stock, dates, supplies, k);
		
		System.out.println(answer);
	}
	
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		
		int answer = 0;
		
		int day = stock; // 최초 0이 되는 날짜다.
		
		int index = 0; // add한 supplie를 기록한다.
		
		PriorityQueue<Integer> amounts = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		// supplie를 할 수 있는 경우.
		while(day < k) {
			// supplie를 add할 수 있는 경우의 수를 구하기.
			while(index < dates.length && dates[index] <= day) {
				// 사용한 밀가루 보다 공급일이 작거나 같은 경우
				amounts.add(supplies[index]);
				index++;
			}
			
			day += amounts.poll();
			answer++;
		}
		
		return answer;
	}
}
