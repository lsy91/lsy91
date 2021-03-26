package greedy;

public class no1 {

	public int solution(int n, int[] lost, int[] reserve) {

		int answer = 0;
		int count = 0;
		int lostCount = 0;

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				// 여벌 체육복을 가져온 학생이 도난 당했을경우, 빌려줄수 없으므로
				// 예외 처리 (-1로 초기화)
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					lostCount++;
					break;
				}
			}
		}

		// 잃어버린애 기준 앞이나 뒤에 있으면 빌려주고 -1처리
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
					count++;
					reserve[j] = -1;
					break;
				}
			}
		}
		// answer은 전체 학생수에서 잃어버린 학생 수를 뺀다.

		answer = n - lost.length + lostCount + count;

		return answer;

	}
}
