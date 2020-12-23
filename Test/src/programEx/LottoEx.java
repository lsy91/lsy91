package programEx;

import java.util.Random;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
		
		System.out.println(">> Lotto Program");
		while(true) {
			System.out.println("1 ~ 99 사이의 숫자 6개를 입력해 주세요");
			System.out.println(">");
			int arr[] = new int[6];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
				if(arr[i]>0 && arr[i]<=99) {					
					
				}else {
					System.out.println("다시 입력해 주세요");
					i--;
				}
				for(int j=0;j<i;j++) {
					if(arr[i] == arr[j]) {
						System.out.println("중복입니다.");
						i--;
					}
					if(arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.print("당신이 입력한 숫자는: ");
			for (int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			Random ram = new Random();
			int comarr[] = new int[6];
			for(int i=0;i<comarr.length;i++) {
				comarr[i] =ram.nextInt(99)+1;
				for(int j=0;j<i;j++) {
					if(comarr[i] == comarr[j]) {
						i--;
					}
				}
				for(int j=0;j<comarr.length;j++) {
					if(comarr[i] < comarr[j]) {
						int temp = comarr[i];
						comarr[i] = comarr[j];
						comarr[j] = temp;						
					}					
				}
			}
			System.out.print("로또 당첨 번호는 : ");
			for(int i=0;i<comarr.length;i++) {
				System.out.print(comarr[i]+" ");
			}
			System.out.println();
			int cont = 0;
			for(int i=0;i<6;i++) {
				for(int j=0;j<6;j++) {
					if(arr[i]==comarr[j]) {
						cont++;
					}
				}
			}
			 if (cont == 6) {
	             System.out.println("1등 !!!");
	         } else if (cont == 5) {
	             System.out.println("2등 !!!");
	         } else if (cont == 4) {
	             System.out.println("3등 !!!");
	         } else if (cont == 3) {
	             System.out.println("4등 !!!");
	         } else if (cont == 2) {
	             System.out.println("5등 !!!");
	         } else if (cont == 1) {
	             System.out.println("6등 !!!");
	         } else if (cont == 0) {
		             System.out.println("꼴등 !!!");
	         } else {
	             System.err.println("오류 !!!");
	         }		 
			 System.out.println("계속 진행하시겠습니까? y/n");
			 String yn = sc.next();
			 if(yn.equals("y") || yn.equals("Y")) {
				 System.out.println(">> 계속 진행하겠습니다.");
				 continue;
			 }else if(yn.equals("n") || yn.equals("N")) {
				 System.out.println("프로그램을 종료합니다.");
				 break;
			 }else {
				 System.out.println("다시 입력해주세요!!!");
				 yn = sc.next();
			 }
			 
			 sc.close();
		}
		
	}

}
