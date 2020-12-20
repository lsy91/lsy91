package arrayEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer m[] = new Integer[5];
		
		System.out.println("5개의 정수를 입력하세요.");
		for(int i=0; i<m.length; i++) {
			System.out.print("정수:"+(i+1)+">");
			m[i] = sc.nextInt();
		}
		
		for(int a:m) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		Arrays.sort(m,Collections.reverseOrder()); // 내림차순 메서드
		for(int i=0; i<m.length; i++) {
			System.out.printf("m["+i+"] 등수 :"+m[i]+" \n");
		}
		
		sc.close();
		
		

	}

}
