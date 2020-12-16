package continueEx;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			if(i%2 == 1) continue; // 조건을 수행하지 않고 증감식으로 돌아감
				System.out.println(i);
		}
		
		int i = 0;
		while(true) {
			i++;
			if(i>10) break;
			if(i%2 == 1) continue; // 조건을 수행하지 않고 while문 처음으로 돌아감
			System.out.println(i);
		}
	}

}
