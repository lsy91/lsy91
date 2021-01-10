package arrayEx;

import java.util.Scanner;

public class Ex03_array {

	public static void main(String[] args) {
		
		int a = 1, b = 2, c = 3, d = 4, e = 5;
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[] {1,2,3,4,5};
		int arr3[] = new int[5]; // 이후에 어떤 값을 넣을진 모르겠지만 방부터 잡아두겠다
		arr3[0] = 10;
		arr3[3] = 40;
		
		System.out.println(arr1); // 배열이 시작되는 주소
		System.out.println(arr1[0]);
//		System.out.println(arr1[5]); // ArrayIndexOutOfBoundsException
		
		System.out.println(arr1.length);
		
		int i;
		for(i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		for(i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]); // 10 0 0 40 0
		}
		
		// 확장 for문
		
		for(int temp : arr1) { // 무조건 0부터 시작 // 좌항의 자료형 타입에 주의
			System.out.println(temp);
		}
		
		System.out.println();
		
		int arr4[][] = {{1,2,3},
				        {4,5},
				        {6,7,8,9},
				        {10,11,12,13,14}
		};
		
		System.out.println(arr4[0][0]);
		System.out.println(arr4[1][1]);
		System.out.println(arr4); //0번째 방의 첫번째 주소값이 출력된다.
								  //배열의 주소를 담는 관리자도 주소값을 가지고 있다.
		
		System.out.println(arr4.length); // 4
		System.out.println(arr4[0].length); // 3
		System.out.println(arr4[1].length); // 2
		
		int j;
		for(i=0; i<arr4.length; i++) {
			for(j=0; j<arr4[i].length; j++) { // 각 행마다 갖고 있는 열의 개수가 다를 때 조건식을 이렇게 표현해준다.
				System.out.println(arr4[i][j] + " ");
			}
			System.out.println();
		} // for
		
		
		// 확장 for문을 이용한 2차원배열 표현
		for(int temp[] : arr4) {
			for(int x : temp) {
				System.out.println(x + " ");
			}
			System.out.println();
		}
		
		//2차원 배열 값 입력 후 출력
		int arr[][] = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.println("수 입력 : ");
				arr[i][j] = sc.nextInt(); // 배열 안에 값 입력
			}
		}
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + " "); // 입력한 값이 arr[i][j]에 저장되므로 for문을 한 번 더 돌려서 출력
			}
			System.out.println();
		}
		
		
	}

}
