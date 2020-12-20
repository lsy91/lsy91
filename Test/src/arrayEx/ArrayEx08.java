package arrayEx;

public class ArrayEx08 {

	public static void main(String[] args) {
		
		int englishScores[][] = new int[2][]; // 다차원배열의 또 다른 표현법
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
			} // 아무 값도 주지 않았기 때문에 값은 모두 기본값인 0
		}
		
		int javaScores[][] = {{95,80},{92,96,80}};
		
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);
			}
		}

	}

}
