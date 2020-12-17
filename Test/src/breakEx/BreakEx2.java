package breakEx;

public class BreakEx2 {

	public static void main(String[] args) {
		
		int i = 0, sum = 0;
		
		while(true) {
			i++;
			sum+=i;
			
			if(sum>2000) {
				System.out.println("수: "+i);
				System.out.println("합: "+sum);
				break; // 가장 가까운 반복문을 빠져나감 (for 든 while 이든)
			}
		}

	}

}
