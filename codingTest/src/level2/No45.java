package level2;

public class No45 {
	
	public static void main(String[] args) {
		
		String s = "ab a ";
		
		String answer = solution(s);
		
		System.out.println(answer);
	}
	
	public static String solution(String s) {
		
		// 1. " " 단위로 나눈다.
		String[] words = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		// 2. 첫글자가 숫자이면 대문자로 변경하지 않는다.
		// 3. 나머지는 첫글자만 대문자로 변경한다.
		for(int i=0; i<words.length; i++) {
			
			String word = words[i];
			
			if(word.equals("")) word="";
			else {
				word = word.toLowerCase();
				
				int ascii_num = word.charAt(0);
				
				// 영문자인 경우는 첫글자 대문자 + 나머지 소문자 하면 됌
				if((ascii_num >= 'a' && ascii_num <= 'z')) {
					word = String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length());
				}
			}
			
			sb.append(word);
			if(i != words.length-1) sb.append(" ");
		}
		
		if(s.charAt(s.length()-1)==' ') sb.append(" ");
		
		return sb.toString();
	}
	
	public static String solution2(String s) {
		
		String answer = "";
		
		String[] sS = s.toLowerCase().split("");
		
		// " "인 경우 true이다.
		boolean flag = true;
		
		for(String word : sS) {
			answer += flag ? word.toUpperCase() : word;
			flag = word.equals(" ") ? true : false;
		}
		
		return answer;
	}
}
