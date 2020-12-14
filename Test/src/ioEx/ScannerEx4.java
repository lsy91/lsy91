package ioEx;

import java.util.Scanner;

public class ScannerEx4 {
	
	public interface Compare {
		int cp(int x, int y);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 입력");
		int num2 = sc.nextInt();
		
		Compare c = (x, y) -> (x >= y)? x : y; // 인터페이스 숫자 대소비교 메서드 문법인듯?
		double average = ((double) num1 + (double) num2) / 2;
		System.out.println();
		System.out.println("결과 출력");
		System.out.println("-------");
		System.out.println(num1 + ", " + num2);
		System.out.printf("두 수 중에 큰 숫자는 %d 입니다. \n", c.cp(num1,  num2));
		
		System.out.printf("두 수의 합은? %d 입니다.\n", num1 + num2);
		System.out.printf("두 수의 곱은? %d 입니다.\n", num1 * num2);
		System.out.printf("두 수를 나눈 몫과 나머지는?"
				 + ((double) num1 / num2) + " 이고 " + "나머지는 "
				 + (num1 % num2) + "입니다. \n");
		
		System.out.printf("두 수의 평균은? %.2f 입니다.", average);
		
		sc.close();
		

	}

}
