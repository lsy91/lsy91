package level1;

import java.util.Arrays;

public class No8 {
	
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		
		int[][] commands = {
				{2,5,3},{4,4,1},{1,7,3}
		};
		
		int[] result = solution2(array,commands);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			
			int[] command = commands[i];
			
			int length = command[1] - command[0] + 1;
			
			int start = command[0]-1;
			int end = command[1]-1;
			
			if (length == 1) {
				answer[i] = array[start];
				continue;
			}
			
			int k = 0;
			int[] temp = new int[length];
			
			for(int j=start; j<=end; j++) {
				temp[k] = array[j];
				k++;
			}
			
			Arrays.sort(temp);
			
			answer[i] = temp[--command[2]];
		}
		
		return answer;
	}
	
	public static int[] solution2(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			
			int[] command = commands[i];
			
			int start = command[0]-1;
			int end = command[1];
			int index = command[2]-1;
			
			int[] temp = Arrays.copyOfRange(array, start, end);
			
			Arrays.sort(temp);
			
			answer[i] = temp[index];
		}
		
		return answer;
	}
}
