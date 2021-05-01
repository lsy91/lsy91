package level2;

public class No27 {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		String answer = solution(n);
		
		System.out.println(answer);
	}
	
	public static String solution(int n) {
		
		String answer = "";
		
		String[] special = {"4","1","2"};
		
		while( n != 0) {
			int nmg = n % 3;
			answer = special[nmg] + answer;
			
			n /= 3;
			
			if(nmg == 0) n-=1;
		}
		
		return answer;
	}
}
