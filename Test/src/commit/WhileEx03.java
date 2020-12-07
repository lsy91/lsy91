package commit;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int a = (int)(Math.random()*10); // 컴퓨터가 0~9 사이의 정수 랜덤추출
		
		while(true) {
//			System.out.println(a); // 컴퓨터가 뽑은 0~9 사이의 랜덤한 수
			
			int b = 0;
			System.out.print("찍어봐(0~9): ");
			b = sc.nextInt(); // 유저 입력
			
			if(a<b && b<=9) { // 유저가 입력한 정수가 컴퓨터가 입력한 수보다 클 경우
				System.out.println("크다"); // 숫자를 줄여라
				x++; // 횟수 증가
			} else if (a>b && b>=0) { // 유저가 입력한 정수가 컴퓨터가 입력한 수보다 작을 경우
				System.out.println("작다"); // 숫자를 키워라
				x++; // 횟수 증가
			} else if (a == b) { // 유저가 입력한 정수와 컴퓨터가 임의추출한 수가 같을 경우
				System.out.println(x+"번만에 맞추었습니다");
				break; // while문 빠져나가기
			} else if(b<0 || b>9) { // 유저가 엉뚱한 숫자를 입력했을 경우
				System.out.println("0~9 사이의 숫자를 입력해주세요");
			}
		} // while
		 
		sc.close(); // 스캐너 종료

	}

}
