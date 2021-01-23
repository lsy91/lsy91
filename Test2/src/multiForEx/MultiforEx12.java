package multiForEx;

import java.util.Scanner;

public class MultiforEx12 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하시오(홀수, 양수)");
			n = sc.nextInt();
			
			if(n%2 == 0 || n<= 0) {
				System.out.println("홀수만 입력해주세요(양수입력해주세요)");
			}
			else {
				break;
			}
			
			sc.close();
		}
	}

}
