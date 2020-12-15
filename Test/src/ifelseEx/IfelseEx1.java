package ifelseEx;

import java.util.Scanner;

public class IfelseEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("정수 입력: ");
		a = sc.nextInt();
		
		if(a>5) {
			System.out.println("크다");
		}
		else {
			System.out.println("작다");
		}
		
		sc.close();

	}

}
