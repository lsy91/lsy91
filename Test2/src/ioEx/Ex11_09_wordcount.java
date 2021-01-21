package ioEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ex11_09_wordcount {

	public static void main(String[] args) {
		
		// 한줄씩 읽어 내려가서
		// null 만날때까지
		// HashMap<키,값> 키 : 값
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("lyrics.txt"));
			
			String str;
			while((str = br.readLine()) != null) {
				String s[] = str.split(" ");
				
				//if(s[i].equals(s[j]))
				for(int i=0; i<s.length; i++) {
					for(int j=0; j<i; j++) {
						System.out.println(s[i] + ":");
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
