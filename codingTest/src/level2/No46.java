package level2;

public class No46 {
	
	private static int[][] solution(int[][] arr1, int[][] arr2) {
		
		//행
		int row = arr1.length;
		//열
		int col = arr2[0].length;
		
		int[][] answer = new int[row][col];
		
		// 2차행렬의 곱셈은 앞배열의 열, 뒤 배열의 행이 같아야 함.
		if(arr1[0].length == arr2.length) {
			
			// a b c
			for (int i=0; i<row; i++) {
				
				// i의 대상으로 arr2의 k열만큼 수행이 되어야 함.
				for(int k=0; k<col; k++) {
					
					// k열 수행 될때마다 처리되어야하는 로직은?
					// 행 x 열 연산을 수행해주어야 한다.
					
					int value = 0;
					// arr1[i][0,1,2,...]
					for(int j=0; j<arr1[i].length; j++) {
						// *arr2[0,1,2][0]
						// arr1[i][j] * arr2[j][?]
						// j값은 동일하구만.
						value += arr1[i][j] * arr2[j][k];
						// answer 넣어주기
					}
					answer[i][k] = value;
				}
			}
		}
		
		return answer;
	}
}
