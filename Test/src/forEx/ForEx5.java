package forEx;

public class ForEx5 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		for(int i=1; i<=100; i++) { // 1~100 의 정수 중에서
			if(i%3 != 0 && i%2 != 0) { // 3의 배수가 아니면서 2의 배수가 아닌 수
				b++; // 조건에 맞는 수는 몇 개?
				a += i; // 조건에 맞는 수의 합?
			}
		} // for
		System.out.println(b);
		System.out.println(a);

	}

}
