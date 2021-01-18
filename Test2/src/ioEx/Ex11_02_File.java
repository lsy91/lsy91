package ioEx;

import java.io.File;
import java.io.IOException;

public class Ex11_02_File {

	public static void main(String[] args) {
		
		// 기본위치 C:\java_lsy\Day18_20201202
		File f1 = new File("A");
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f3,"ab.text"); // A\\ab.text
		
		if(f3.exists()) { // "A"라는 파일이 존재하는지 여부
			System.out.println("이미 존재함");
			f1.renameTo(f2);
		}
		
		else {
			f3.mkdir(); // make a directory 의 약자
			System.out.println("폴더 생성함");
			
			try {
				f4.createNewFile(); // 반드시 예외처리 해야함
				System.out.println("파일 생성함");
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} // else
		
		if(f3.exists()) { // f3 변수에 들어있는 파일 객체가 존재하면
			f3.delete(); // 지워라
		}
	}

}
