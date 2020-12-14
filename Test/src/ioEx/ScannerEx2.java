package ioEx;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요!");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println();
		
		System.out.println("결과 출력");
		System.out.println("-------");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
		
		System.out.print("두 수의 합은\n" + (num1 + num2) + " 입니다.\n");
		System.out.print("두 수의 곱은\n" + (num1 * num2) + " 입니다.\n");
		System.out.print("두 수를 나눈 몫은\n" 
						+ ((double)num1 / num2) + " 이고 "
						+ "나머지는 " + (num1 % num2) + "\n");
		System.out.println();
		
		System.out.printf("두 수의 합은? %d 입니다.", (num1 + num2));
										// 이런식으로도 표현 가능
		
		sc.close();

	}

}
