package level2;

public class No33 {
	
	public static void main(String[] args) {
		
		int n = 1000000;
		
		int result = solution(n);
		
		System.out.println(result);
	}
	
	public static int solution(int n) {
		
		int answer = 0;
		
		int[] prime = new int[n+1];
		
		// 0이면 소수, 1이면 소수가 아니다.
		
		for(int i=2; i<=n; i++) {
			
			if(prime[i] == 1) continue;
			
			for( int j = i*2; j<=n; j+=i) {
				prime[j] = 1;
			}
			
			answer++;
		}
		
		return answer;
	}
}
