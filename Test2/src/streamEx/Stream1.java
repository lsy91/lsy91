package streamEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stream1 {

	public static void main(String[] args) {
		
	
		try {
			FileWriter fw = new FileWriter("write.txt");
			fw.write("즐거운 자바수업~");
			fw.close();
			
			FileReader fr = new FileReader("write.txt");
			
			int i;
			while((i=fr.read()) != -1) {
				System.out.println((char)i);
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
