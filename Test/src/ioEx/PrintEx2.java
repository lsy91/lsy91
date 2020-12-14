package ioEx;

public class PrintEx2 {

	public static void main(String[] args) {
		
		int pop1, pop2, pop3;
		
		pop1 = 1000;
		pop2 = 900;
		pop3 = 800;
		
		int sum = pop1 + pop2 + pop3;
		double avg = sum / 3;
		
		System.out.println("코드 출력");
		System.out.println(80);
		System.out.println(pop1);
		System.out.println(pop2);
		System.out.println(pop3);
		System.out.printf("%1$d %2$d %3$d\n", pop1,pop2,pop3);
		System.out.printf("%3$d %2$d %1$d\n", pop1,pop2,pop3);
		
//		   main 메소드가 있는 클래스
//		   main 메소드가 없는 클래스는 라이브러리 클래스
//		   string 포맷 conversion(표현 할 데이터의 타입), 인자순서 : $
//		   conversion : s는 문자열 d는 정수 f는 실수
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.printf("%.2f",avg);
		
		  
		 

	}

}
