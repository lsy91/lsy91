package arrayEx;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		int m[][] = {{10,20,30},{30,40,70,80},{50,60,90}}; // 다차원배열
		
		for(int i=0; i<m.length; i++) { // 이중 for문을 이용해서
			for(int j=0; j<m[i].length; j++) { // 다차원 배열값의 인덱스를 확인해보는 작업
				System.out.println("m["+i+"]["+j+"]="+m[i][j]);
			}
			System.out.println();
		}

	}

}
