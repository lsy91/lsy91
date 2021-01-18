package ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_03_FileCopy {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("from.txt"); // from.txt의 값을 읽어오는 클래스
			
			//new FileNotFoundException(); 예외처리하면 이 객체가 자동 생성됨
			
			FileOutputStream fos = new FileOutputStream("to.txt"); // to.txt에 값을 쓰는 클래스
			
			// false or default : 파일이 없으면 생성, 있으면 새로 생성
			// true : 파일이 없으면 새로 생성, 있으면 기존 내용에 from.txt 내용 추가
			// 경로를 찾지 못할 때 FileOutputStream 클래스에서 FileNotFoundException 에러가 발생한다
			
			int i;
			while(true) {
				i = fis.read();
				System.out.println((char)i);
				if(i == -1) break;// -1 : EOF(End of File 의 약자) 의 상수값 [코더 눈에는 안 보이지만 존재함]
				else { fos.write(i); }// i에는 파일 내용의 첫 문자가 아스키코드 값으로 들어가고 그 값부터 시작해서 문자열을 받는다.
			}
			
			fis.close(); // 예외처리가 필요하기 때문에 try 블럭 안에 작성해줘야 함
			fos.close(); // 안전한 프로그램 종료
			
			//FileNotFoundException e = new FileNotFoundException();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
