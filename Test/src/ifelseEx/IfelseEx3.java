package ifelseEx;

import java.util.Scanner;

public class IfelseEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		a = sc.nextInt();
		
		if(90<=a || a<=100) {
			System.out.println("A");
		}
		
		sc.close();
	}

}
