package streamEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream2 {

	public static void main(String[] args) {
		
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream("data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			for(int i=1; i<=9; i++) {
				bos.write(i+48);
			}
			
			bos.flush();
			
			FileInputStream fis = new FileInputStream("data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis,5);
			
			int i;
			while((i=bis.read()) != -1) {
				System.out.println((char)i + " ");
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
