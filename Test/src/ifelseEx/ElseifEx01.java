package ifelseEx;

import java.util.Scanner;

public class ElseifEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c = 5;
		
		while(true) {
			
			if(c==0) {
				System.out.println("\n커피가 매진 되었습니다.");
				sc.close();
				break;
			}
			else {
				System.out.print("돈을 넣어주세요\n>");
				
				a = sc.nextInt();
				
				if(a<300) {
					System.out.println("금액이 부족합니다. 다시 입력해주세요.");
				}
				else if(a==300) {
					if(c<=5) {
						System.out.println("남은 커피의 양은 "+c+"개 입니다.");
					}
					c--;
					System.out.println("맛있는 커피를 드세요!!!");
				}
				else {
					b = a-300;
					c--;
					System.out.println("커피와 거스름돈" + b + "원을 받으세요.");
					System.out.println("맛있는 커피를 드세요!!!");
					System.out.println("남은 커피의 양은 "+c+"개 입니다.");
					
				}
			}
		}

	}

}
