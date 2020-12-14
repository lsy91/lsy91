package switchEx;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("첫번째 수: " + a);
		
		System.out.println("두번째 수를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("두번째 수: " + b);
		
		System.out.println("사용할 연산자는?" );
		String c = sc.next();
		System.out.println(a + c + b + "=");
		
		
		switch (c) {
		case "+" : System.out.println("결과값: " + (a+b));
		break;
		
		case "-" : System.out.println("결과값: " + (a-b));
		break;
		
		case "*" : System.out.println("결과값: " + (a*b));
		break;
		
		case "/" : System.out.printf("결과값: %.2f", (float)(a/b));
		break;
		
		case "%" : System.out.println("결과값: " + (a%b));
		break;
		}

	}

}
