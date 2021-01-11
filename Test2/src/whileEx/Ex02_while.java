package whileEx;

import java.util.Scanner;

public class Ex02_while {
	
	public static void main(String[] args) {
		
		int i = 1;
		int input;
		int sum = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		i = 1;
		while(true) {
			System.out.println(i);
			i++;
			if(i==10)
				break; // 가장 가까운 반복문을 빠져나간다
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("수 입력 : ");
			input = sc.nextInt();
			
			if(input<0)
				break; // false가 되는 순간(0이나 음수를 입력하는 순간)은 그 조건은 실행하지 않는다.
			
			sum += input; // false가 되기 전까지의 수들을 누적하여 합한다.
		}
		
		System.out.println("sum = " + sum);
	}
}
