package streamEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Stream3 {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		
		try {
			str = br.readLine();
			System.out.println("str:" + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
