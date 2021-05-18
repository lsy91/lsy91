package level2;

public class No44 {
	
	public static void main(String[] args) {
		
		String s = "()(())";
		
		String result = solution(s);
		
		System.out.println("result : " + result);
	}
	
	public static String solution(String p) {
		
		if(p.equals("")) return "";
		
		if(check(p)) return p;
		
		String answer = "";
		
		int right = 0;
		int left = 0;
		int index = 0;
		
		for(char c : p.toCharArray()) {
			index++;
			
			if(c=='(') left++;
			else if(c==')') right++;
			
			if( right == left) {
				break;
			}
		}
		
		String u = p.substring(0,index);
		String v = p.substring(index,p.length());
		
		System.out.println("u : " + u + ", v : " + v);
		
		if(check(u)) {
			answer = u;
			answer += solution(v);
		}
		else {
			answer += "(";
			answer += solution(v);
			answer += ")";
			
			u = u.substring(1,u.length()-1);
			
			for(char c : u.toCharArray()) {
				if(c==')') {
					answer += "(";
				}
				else if (c=='(')
					answer += ")";
			}
		}
		
		return answer;
	}
	
	// 올바른지 아닌지 check
	private static boolean check(String p) {
		
		int cnt = 0;
		
		for(char c : p.toCharArray()) {
			if(c=='(') cnt++;
			else if (c==')') cnt--;
			
			if(cnt < 0) return false;
		}
		
		return true;
	}
}
