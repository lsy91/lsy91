package forEx;

import java.util.Random;

public class ForEx6 {

	public static void main(String[] args) {
		
		int a = 0; // 변수 a 초기화 (지역변수로 선언하면 쓸데없긴 함)
		
		Random r = new Random();
		
		for(int i=0; i<6; i++) { // 6번 뽑는다
			a = r.nextInt(100); // 0~99 중 발생한 난수를
			System.out.print(a + " "); // 변수 a에 담는 작업을 6번 한 뒤 출력
		}

	}

}
