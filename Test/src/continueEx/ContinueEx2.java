package continueEx;

public class ContinueEx2 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(true) {
			i++;
			if(i>10) break;
			if(i%3 != 0) continue; // 3의 배수가 아니면 다시 while문 처음으로
			System.out.println(i);
		}

	}

}
