package forEx;

import java.util.Random;

public class ForEx4 {

	public static void main(String[] args) {
		
		int p[] = new int[30]; // 30명의 사람
		int sequence[] = new int[30]; // 30개의 번호
		
		Random r = new Random();
		
		for(int i=0; i<p.length; i++) {
			sequence[i] = r.nextInt(30)+1; // 1~30
			for(int j=0; j<i; j++) {
				if(sequence[i]==sequence[j]) { // 지금까지 뽑힌 번호와 중복된 번호가 뽑히면
					i--; // 다시 뽑아라
				}
			} // for
		} // for
		
		for(int i=0; i<p.length; i++) {
			p[i] = i+1;
			System.out.println(p[i]+"번 학생의 발표순서는 "+sequence[i]);
		}
	}

}
