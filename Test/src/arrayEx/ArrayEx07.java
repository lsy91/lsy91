package arrayEx;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m[] = new int[5];
		System.out.println("5개의 정수를 입력하세요.");
		
		for(int i=0; i<m.length; i++) {
			System.out.print("정수:"+(i+1)+">");
			m[i] = sc.nextInt(); // 5개 정수 입력
		}
		
		for(int a:m) { // 확장 for문을 이용한 입력된 정수의 출력
			System.out.print(a+" ");
		}
		System.out.println();
		
		int max = m[0]; // max 변수값 m배열의 첫번째 수로 초기화
		int min = m[0]; // min 변수값 m배열의 첫번째 수로 초기화
		for(int i=0; i<m.length; i++) {
			if(max < m[i]) max = m[i]; // m배열의 첫번째 수보다 큰 수가 나타나면 max변수에 m[i]값 할당
			if(min > m[i]) min = m[i]; // m배열의 첫번째 수보다 작은 수가 나타나면 min변수에 m[i]값 할당
		}
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
		sc.close();
		
		

	}

}
