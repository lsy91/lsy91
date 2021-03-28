package greedy;

public class No3 {
	
	public static void main(String[] args) {
		
		String dartResult = "1D2S3T*";
		
		int result = solution(dartResult);
		
		System.out.println(result);
	}
	
	public static int solution(String dartResult) {
		
		int answer = 0;
		
		// 숫자가 나올때가 던지기의 시작이다.
		// 0~9의 범위는 48~57이다.
		char[] dart = dartResult.toCharArray();
		
		// 다트 별 결과를 보관할 배열이다.
		int[] result = new int[3];
		int dartCnt = 0;
		
		String num = "";
		int intNum = 0;
		
		boolean check = false;
		
		for (int i=0; i<dartResult.length(); i++) {
			
			//숫자인 경우
			if(dart[i] >= 48 && dart[i] <= 57) {
				
				if(check) { // 이전에 계산한 값이 있다면 넣어주고 초기화.
					result[dartCnt] = intNum;
					dartCnt++;
					check = false;
					num = "";
					intNum = 0;
				}
				num += String.valueOf(dart[i]);
				intNum = Integer.valueOf(num);
				
				continue;
			}
			
			check = true;
			
			if(dart[i] == 'S') {
				intNum = (int)Math.pow(intNum, 1);
			}else if (dart[i] == 'D') {
				intNum = (int)Math.pow(intNum, 2);
			}else if (dart[i] == 'T') {
				intNum *= 2;
				if(dartCnt != 0) result[dartCnt-1] *= 2;
			}else if (dart[i] == '#') 
				intNum *= -1;
			
			if(dartCnt == 2)
				result[dartCnt] = intNum;
		}
		
		for(int score : result) {
			answer += score;
		}
		
		return answer;
	}
}
