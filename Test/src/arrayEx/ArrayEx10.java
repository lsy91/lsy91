package arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		int math[][] = new int[][] {{95,75,85},{75,95,100}}; // 다차원배열 표현법
		
		for(int i=0; i<math.length; i++) {
			for(int j=0; j<math[i].length; j++) {
				System.out.println("math["+(i+1)+"]["+(j+1)+"]="+math[i][j]);
			}
		}

	}

}
