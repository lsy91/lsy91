package commit;

import java.util.Scanner;

public class DoWhileEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char end = 'Y';
		int a = 0, b = 0, c = 0, d = 0;
		
		do {
			for(int i=1; i<6; i++) {
				a = (int) (Math.random()*100) + 1;
				b = (int) (Math.random()*100) + 1;
				
				System.out.print("[" + i + "]번 문제:" + a + "+" + b + "=");
				c = sc.nextInt();
				
				if(a + b == c) {
					System.out.println("정답입니다!");
					d++;
				} else {
					System.out.println("오답입니다!");
				}
			} // for
			
			System.out.println("맞은 개수 :" + d);
			System.out.println("점수 : " + (d * 10));
			System.out.println("한번 더 하실건가요? (Y,N)");
			end = sc.next().charAt(0); // 0번째 오는 문자만 읽어냄. yes 또는 Yes 쳐도 반복되는 이유
			d = 0;
		} while ( end == 'Y' || end == 'y'); // 대문자 또는 소문자 y가 아닌 아무 문자나 와도 종료
		System.out.println("종료");
		sc.close();

	}

}
