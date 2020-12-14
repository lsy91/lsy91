package ioEx;

import java.util.Scanner;

public class ScannerEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		System.out.println(sc.next());
		// sc.next()를 변수에 넣은 뒤에 출력하는 두 번의 과정을 하나로 합쳤다고 보면 된다.
		
		sc.close();

	}

}
