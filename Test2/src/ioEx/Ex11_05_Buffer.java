package ioEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_Buffer {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("data.txt"); // 1차스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos,5); // 2차스트림
			// Buffer : 임시 기억장소
			// fos 연결다리를 타고 가서 데이터가 5개 모이면 콘솔에 옮기겠다.
			
			for(int i=1; i<=9; i++) {
				bos.write(i+48); // 아스키코드 값으로 따진다.
								 // '1' : 49, '2' : 50 ...
								 // bos에서 5개 임시저장으로 제한해놨기 때문( 그래서 콘솔창엔 1~5까지밖에 안 보인다.)
			}
				bos.flush(); // 버퍼에 남아있던 저장값들 콘솔에 다 내보내라
				
				FileInputStream fis = new FileInputStream("data.txt");
				BufferedInputStream bis = new BufferedInputStream(fis,5);
				
				int i;
				while( (i=bis.read()) != -1) {
					System.out.print((char)i + " ");
				}
				
				bos.close();
				bis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
