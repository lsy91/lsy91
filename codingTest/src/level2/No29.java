package level2;

import java.util.Arrays;

public class No29 {
	
	public static void main(String[] args) {
		
		int[] prices = {
				3,3,3,3,1
		};
		
		int[] answer = solution(prices);
		
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] prices) {
		
		int[] answer = new int[prices.length];
		
		for(int i=0; i<prices.length-1; i++) {
			
			int price = prices[i];
			
			int j = i;
			
			int cnt = 0;
			
			// 마지막 값은 무조건 0이기 때문에 초기 값 그대로 둔다.
			// price 값이 더 큰 경우에 빠져나온다 !
			// length -1 까지 보고 && 한칸 차이로 떨어지는 경우가 존재하기 때문에 j값은 i부터 시작.
			while( j < prices.length -1 && price <= prices[j]) {
				j++;
				cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static int[] solution2(int[] prices) {
		
		int[] answer = new int[prices.length];
		
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				answer[i] = j-i;
				if(prices[i] > prices[j]) break;
			}
		}
		
		return answer;
	}
}
