package ioEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_11_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Scanner sc = new Scanner(System.in);
		// Scanner(InputStream source)
		
		Scanner sc = new Scanner(new File("scan.txt"));
		// Scanner(File source)
		sc.useDelimiter(",");
		
		int sum=0, num, cnt=0;
		while(sc.hasNextInt()) {
			num = sc.nextInt();
			sum += num;
			cnt++;
		}
		System.out.println("cnt:"+cnt);
		System.out.println("sum:"+sum);
		System.out.println("avg:"+(double)sum/cnt); // 55.0/10
		System.out.printf("avg2:%.2f",(double)sum/cnt);
	}

}
