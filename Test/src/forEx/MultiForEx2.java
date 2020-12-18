package forEx;

import java.util.Random;

public class MultiForEx2 {

	public static void main(String[] args) {
		
		Random r = new Random(); // 난수발생 random 클래스
		
		for(int i=0; i<10; i++) { // 10행
			for(int j=0; j<6; j++) { // 6열
				int a = r.nextInt(99); // 0~98 ()안의 수의 의미는 99개의 난수를 발생시킨다는 뜻
				System.out.print(a+"\t");
			}
			System.out.println();
		}

	}

}
