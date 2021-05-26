package level2;

public class No52 {
	
	private static int targetNum;
	
	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,1,1};
		
		int target = 3;
		
		int answer = solution(numbers, target);
		
		System.out.println(answer);
	}
	
	public static int solution(int[] numbers, int target) {
		
		targetNum = target;
		
		int[] flag = new int[numbers.length];
		return powerSet(numbers, flag, 0);
	}
	
	private static int powerSet(int[] numbers, int[] flag, int index) {
		
		int cnt = 0;
		
		// 모든 원소를 가지고 +,- 할 수 있는 경우의 수를 구하면서 3인 경우만 + 해준다.
		
		if(index == flag.length) {
			int result = 0;
			
			for(int i=0; i<flag.length; i++) {
				if(flag[i] == 1) result -= numbers[i];
				else result += numbers[i];
			}
		}
		
		// 1이면 - 해준다.
		flag[index] = 1;
		cnt += powerSet(numbers, flag, index+1);
		
		// 0이면 + 해준다
		flag[index] = 0;
		cnt += powerSet(numbers, flag, index+1);
		
		return cnt;
	}
}
