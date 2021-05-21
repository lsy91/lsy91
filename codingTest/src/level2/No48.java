package level2;

public class No48 {
	
	public static int solution(int n) {
		
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			int sum = 0;
			
			int start = i;
			
			while(sum < n && start <= n) {
				sum += start;
				start++;
			}
			
			if(sum == n) answer++;
		}
		
		return answer;
	}
	
	public int solution2(int n) {
		
		int answer = 0;
		
		for(int i=1; i<=n; i+=2) {
			if(n % i == 0) {
				answer++;
			}
		}
		
		return answer;
	}
}
