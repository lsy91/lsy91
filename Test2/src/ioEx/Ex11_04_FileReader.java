package ioEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_04_FileReader {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("write.txt"); // fw가 writer.txt 파일이랑 이어주는 다리역할
			
			fw.write("즐거운 자바수업~");
			fw.close(); // 연결다리 끊어짐
			
			FileReader fr = new FileReader("write.txt"); // FileNotFoundException
			// new FileNotFoundException() // IOException의 자식 클래스기 때문에 안 써줘도 예외처리 된다.
			
			int i;
			while( (i=fr.read()) != -1) {
				System.out.print((char)i); // FileReader 클래스는 FileOutputStream 클래스랑 다르게 한글이나 다른 언어도 가능하다.
			}
			
			fr.close();
			
			// IOException e = new FileNotFoundException() // 상속관계라서 IOException만 예외처리 해줘도 FileNotFoundException는 자동으로 예외처리 된다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
