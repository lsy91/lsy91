package methodEx3;

import java.util.Scanner;

public class InstanceMem {
	
	int a;
	int b;
	
	InstanceMem(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}

}
