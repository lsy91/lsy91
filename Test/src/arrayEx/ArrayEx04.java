package arrayEx;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int scores[];
		scores = new int[] {83, 90, 87}; // 새로운 배열 표현법
		
		int sum1 = 0; // 데이터 총합 변수 초기화
		for(int i=0; i<3; i++) {
//			sum1 = sum1 + scores[i];
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

	}

}
