package level2;

public class No32 {
	
	static int cnt = 0;
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,59,19,14,14,10};
		
		String[] answer = solution2(n,arr1,arr2);
		
		for(String a : answer) {
			System.out.println(a);
		}
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] answer = new String[n];
		
		for(int i=0; i<arr1.length; i++) {
			
			int[] a1 = makeBinary(n,arr1[i]);
			int[] a2 = makeBinary(n,arr2[i]);
			
			String result = "";
			
			for(int j=0; j<n; j++) {
				if(a1[j] == 1 || a2[j] == 1) result += "#";
				else result += " ";
			}
			
			answer[i] = result;
		}
		
		return answer;
	}
	
	private static int[] makeBinary(int n, int num) {
		
		int[] box = new int[n];
		
		int j = n-1;
		
		while(j>=0) {
			box[j] = num%2;
			num/=2;
			j--;
			if(num == 1) box[j] = num;
		}
		
		return box;
	}
	
	public static String[] solution2 (int n, int[] arr1, int[] arr2) {
		
		String[] result = new String[n];
		
		for(int i=0; i<n; i++) {
			
			 String a = Integer.toBinaryString(arr1[i]);
			 String b = Integer.toBinaryString(arr2[i]);
			
			result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			System.out.println( a + "|" + b + "=" + (arr1[i] | arr2[i]));
		}
		
		for(int i=0; i<n; i++) {
			
			System.out.println(" 전 result["+i+"] : " + result[i]);
			
			// 길이를 n으로 지정
			// 크기가 6일 때 [11110] 이 [11110] 으로 바뀐다.
			
			result[i] = String.format("%" + n + "s", result[i]);
			System.out.println(" 후 result["+i+"] : " + result[i]);
			
			result[i] = result[i].replaceAll("1", "#");
			result[i] = result[i].replaceAll("0", " ");
		}
		
		return result;
	}
}
