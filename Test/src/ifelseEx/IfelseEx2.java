package ifelseEx;

import java.util.Scanner;

public class IfelseEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
		if(a%2==0 & a%3==0) {
			System.out.println("공배수");
		}
		else {
			System.out.println("공배수가 아니다");
		}
		
		sc.close();

	}

}
