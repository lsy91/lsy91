package arrayEx;

import java.util.Random;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int k=0; k<10; k++) {
			int m[] = new int[6]; // 6개의 정수를 저장하는 배열을 10종류 만든다.
			
			for(int i=0; i<m.length; i++) { // 6개의 정수를 뽑는다
				m[i] = r.nextInt(36)+1; // 1~35 난수발생
				for(int j=0; j<i; j++) {
					if(m[i]==m[j]) i--; // 중복된 수가 뽑히면 다시 뽑는다
				} // for3
			} // for2
			
			for(int i=0; i<m.length; i++) {
				System.out.print(m[i]+"\t"); // 중복 없이 6개의 숫자가 뽑혔다면 출력
			}
			System.out.println(); // 개행 후 배열 m의 길이만큼 최상위 for문을 돌아 재시행
		} // for1

	}

}
