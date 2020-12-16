package continueEx;

public class ContinueEx3 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(true) {
			i++;
			if(i>10) break; // while 루프 범위제한
			if(i%2==0 && i%3==0) continue; // 2와 3의 공배수가 아니면 조건 무시하고 다시 처음으로
			System.out.println(i);
		}
		
		for(int j = 0; j < 11; j++) {
			if(j%2==0 && j%3==0) continue; // 2와 3의 공배수가 아니면 출력 무시 다시 증감식으로
			System.out.println(j);
		}

	}

}
