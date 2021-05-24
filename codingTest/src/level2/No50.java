package level2;

public class No50 {
	
	public int solution(int[][] board) {
		
		// 우측하단부터 만들려고 하는데, 길이가 1인 경우에도 검사도리 수 있도록 크기가 1 더 큰 배열을 새로 만든다.
		int[][] newBoard = new int[board.length+1][board[0].length+1];
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				newBoard[i+1][j+1] = board[i][j];
			}
		}
		
		int max = 0;
		
		// 모든 board를 확인한다.
		for(int i=1; i<newBoard.length; i++) {
			for(int j=1; j<newBoard[i].length; j++) {
				
				// 2x2 사각형의 우측하단을 기준으로 정사각형이 되는 경우에는 변의 길이를 기록해간ㄷ.
				
				// 우측하단이 기준인 이유는 마지막 좌표의 값을 구하기 전에는 나머지 board들은 계산이 끝나야 하기 때문이다.
				
				// 변의 길이는 2x2 정사각형을 구성하는 변들의 최솟값이다.
				if(newBoard[i][j] >= 1) {
					
					//좌측
					int left = newBoard[i-1][j];
					//상단
					int up = newBoard[i][j-1];
					//좌측상단(대각선)
					int leftDiagonal = newBoard[i-1][j-1];
					
					int min = Math.min(left, up);
					min = Math.min(min, leftDiagonal);
					
					newBoard[i][j] = min + 1;
					
					max = Math.max(max, min+1);
				}
			}
		}
		
		return (int)Math.pow(max, 2);
	}
}
