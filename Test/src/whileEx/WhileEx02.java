package whileEx;

public class WhileEx02 {

	public static void main(String[] args) {
		
		int i = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		int x1 = 0;
		
		while(i<100) {
			i++;
			x += i;
			if(i%2 == 0) { // 100보다 작은 정수 중 2의 배수들의 합
				y += i;
			}
			else { // 100보다 작은 정수 중 2의 배수가 아닌 수들의 합
				z += i;
			}
			if(i%2 == 0 && i%3 == 0) { // 100보다 작은 정수 중 2의 배수이면서 3의 배수인 수들의 합
				x1 += i;
			}
			// x1 = x1 + ((i%2==0 && i%3 == 0)? i : 0);
			
		} // while
		System.out.println(y);
		System.out.println(z);
		System.out.println(x);
		System.out.println(x1);

	}

}
