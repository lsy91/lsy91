package level2;

public class No49 {
	
	public static int solution(int n) {
		
		int nCnt = findOneCnt(n);
		
		for( int i = n+1; i<10000001; i++) {
			
			int nextCnt = findOneCnt(i);
			if(nCnt == nextCnt) return i;
		}
		
		return 0;
	}
	
	private static int findOneCnt(int n) {
		
		int nCnt = 0;
		
		String binaryN = Integer.toBinaryString(n);
		
		for(char c : binaryN.toCharArray()) {
			if(c == '1') {
				nCnt++;
			}
		}
		
		return nCnt;
	}
	
	public static int solution2(int n) {
		
		int nCnt = Integer.bitCount(n);
		
		for(int i = n+1; i<10000001; i++) {
			
			int nextCnt = Integer.bitCount(i);
			if(nCnt == nextCnt) return i;
		}
		
		return 0;
	}
}
