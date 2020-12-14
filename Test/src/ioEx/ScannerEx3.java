package ioEx;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름 입력\n -------- \n이름> ");
		String name = sc.next();
		
		sc.nextLine(); // 위의 sc.next() 입력 중 남은 엔터값을 받아주기 위한 메서드
		
		System.out.printf("\n주소 입력\n--------\n주소> ");
		String home = sc.nextLine();
		
		System.out.printf("\n점수 입력\n -------- \n점수> ");
		double score = sc.nextDouble();
		
		System.out.printf("\n결과 출력\n -------- \n이름: %s"
				+ "\n점수: %.2f\n주소: %s", name, score, home);
		
		sc.close();
		
	}

}
