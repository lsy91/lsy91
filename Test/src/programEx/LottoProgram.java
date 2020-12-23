package programEx;

import java.util.Arrays;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) {
		
		String s1 = "당신이 입력한 숫자는";
		String s2 = "로또 당첨 번호는";
		
		char end = 'y';
		int lottoArray[] = new int[6];
		int userArray[] = new int[6];
		
		Scanner userPut = new Scanner(System.in);
		
		Lotto lt = new Lotto();
		
		do {
			System.out.println(">> Lotto Program");
			System.out.println("1~99 사이의 숫자 6개를 입력해 주세요.");
			lt.random(lottoArray, 45);
			lt.random(userArray, userPut);
			
			Arrays.sort(lottoArray);
			Arrays.sort(userArray);
			
			lt.result(userArray, s1);
			System.out.println();
			lt.result(lottoArray, s2);
			lt.rank(lottoArray,  userArray);
			System.out.println("계속 진행하시곘습니까? y/n");
			end = userPut.next().charAt(0);
		} while(end=='y' || end=='Y');
		
		System.out.println("프로그램을 종료합니다.");

	}

}
