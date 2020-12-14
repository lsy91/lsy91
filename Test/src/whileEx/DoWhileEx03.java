package whileEx;

import java.util.Scanner;

public class DoWhileEx03 {

	public static void main(String[] args) {
		
		int a = 0 , b = 1 , c = 9 , d = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("단입력 :");
			a = sc.nextInt();
			if ( a < 2 || a > 9) {
				continue; // 2보다 작거나 9보다 큰 수를 입력하면 무시하고 다음 "단입력"반복을 이어간다
			}
			
			do {
				d = a * b;
				System.out.println(a + "*" + b + "=" + d);
				b++;
			} while (b <= c);
			break;
		} while (true);
		
		
		sc.close();

	}

}
