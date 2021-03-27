package greedy;

public class No2 {

	public static void main(String[] args) {
		String number = "JEROEN";

		int answer = solution2(number);

		System.out.println(answer);
	}

	public static int solution(String name) {
		
		int answer = 0;
		
		char[] names = name.toCharArray();
		
		//위,아래로 알파벳을 움직여주는 경우. 명확하다.
		for (int i=0; i<names.length; i++) {
			if(names[i] < 79) // A~M까지
				answer += names[i] % 65;
		 else  // N~Z
			answer += 91-names[i];
		}
	

	// 좌->우 끝까지 조이스틱을 이동한 경우.
	int min = name.length() -1;

	// 좌,우 움직이는 경우
	if(name.contains("A"))
	{

		int moveCnt = 1;

		// 뒤부터 세는 경우, 1번째부터 'A'가 아닌게 나올때까지는 무조건 움직여 주어야 한다.
		for (int i = 1; i < names.length; i++) {
			if (names[i] != 'A') {
				moveCnt = names.length - i;
				break;
			}
		}

		System.out.println(" 뒤부터 : " + moveCnt);

		if (min > moveCnt)
			min = moveCnt;
		int i = 0;

		while (i < names.length) {

			int endIndex = 0;

			if (names[i] == 'A') {

				endIndex = i + 1;

				while (endIndex < names.length && names[endIndex] == 'A') {
					endIndex++;
				}

				// 연속된 A의 끝이 마지막 까지 이어진 경우라면
				if (endIndex == names.length) {
					moveCnt = i - 1;
				} else {
					moveCnt = 1 + (i - 1) * 2 + names.length - 1 - endIndex;
				}

				if (moveCnt < min) {
					min = moveCnt;

					i = endIndex + 1;
				} else {
					i++;
				}
			}
			
			System.out.println("돌아와서:" + moveCnt);
			
			if(min > moveCnt) min = moveCnt;
			}
		}
		return answer + min;
	}
	
	public  static int solution2(String name) {
		int answer = 0;
		
		//위,아래로 알파벳을 움직여주는 경우. 명확하다.
		for( char c : name.toCharArray()) {
			if(c<78) answer += c % 65;
			else answer += 91-c;
		}
		
		//좌,우의 최소는 문자열 시작부터 끝까지 가는 경우이다.
		int min = name.length()-1;
		
		//A가 연속되는 경우에는 뒤로 돌아갔을 때 최솟값을 구해주어서 비교해준다.
		for(int i=0; i<name.length(); i++) {
			int index = i;
			
			if(name.charAt(index) == 'A') {
				while( index < name.length() && name.charAt(index) == 'A') {
					index++;
				}
				
				// 종료시점의 index는 연속된 A가 끝나는 지점이다.
				
				// ((i-1)*2 는 A가 가기전까지 갔다가, 다시 Back하는 수를 세준 것이다.
				// 연속된 A가 끝나는 index까지 뒤에서 세야함으로 (전체길이 - index)를 해준다.
				int moveCnt = ((i-1)*2) + name.length() - index;
				min = Math.min(min, moveCnt);
			}
		}
		System.out.println(" 좌,우 이동거리 : " + min);
		return answer + min;
		
		
	}
}
