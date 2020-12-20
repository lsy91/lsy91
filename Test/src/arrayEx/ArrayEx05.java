package arrayEx;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<arr2.length; i++) { // 더블타입 배열에 아무 값도 초기화 해주지 않아서 0.0
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i=0; i<arr2.length; i++) { // 배열값을 초기화
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		String arr3[] = new String[3];
		
		for(int i=0; i<arr2.length; i++) { // 배열값을 초기화하진 않았지만 인덱스가 0부터 1씩 커지는 원리를 이용해
			arr3[i] = i+1+"등"; // for문 안에서 연산을 통해 값 부여
			System.out.println("arr2["+i+"] : "+arr3[i]);
		}

	}

}
