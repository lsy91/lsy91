package ioEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_08_Task {

	public static void main(String[] args) {
		//스트림이 몇개 필요한지 생각
		
		//1.단어입력 2.단어검색 3.종료 >> 1
		//단어/뜻 입력>> blue sky/파란 하늘  voca.txt
		//1.단어입력 2.단어검색 3.종료 >> 1
		//단어/뜻 입력>> hand/손  voca.txt
		//1.단어입력 2.단어검색 3.종료 >> 1
		//단어/뜻 입력>> desk/책상  voca.txt
		//1.단어입력 2.단어검색 3.종료 >> 2
		//검색 단어 입력 >> hand
		//단어>hand
		//단어의뜻>손
		//1.단어입력 2.단어검색 3.종료 >> 2
		//검색 단어 입력>>head
		//찾는 단어 없음
		//1.단어입력 2.단어검색 3.종료 >> 3
		//프로그램을 종료합니다.
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		try {
			FileOutputStream fos = new FileOutputStream("voca.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("1.단어입력  2.단어검색  3.종료  >>");
			
			FileWriter fw = new FileWriter("voca.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			while( (str=br.readLine()) != null) { // ctrl + z 누르면 입력값을 null로 인식함
				bw.write(str);
				// bw.write("\r\n"); // Enter 기능
				bw.newLine(); // Enter 쳐라 // 파일에 개행도 적용하라는 뜻
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
