package ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_06_InputStreamReader {

	public static void main(String[] args) {
		
		InputStream is = System.in; // 키보드 입력은 원래 1바이트 입력이지만
		
		InputStreamReader isr = new InputStreamReader(is); // 2바이트로 입력할 수 있게 하겠다.(한글 입력을 위해)
		
		BufferedReader br = new BufferedReader(isr); // BufferedReader를 통해 더 빨리 읽어내겠다.
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 위의 3단계 작업을 한줄로 표현한 것
		
		try { // 컴퓨터가 잡지 못하는 예외를 코더 재량으로 작성한 예외처리 코드 
			String str = br.readLine(); // Scanner랑 달리 공백 포함해서 1줄을 읽어올 수 있다.
			System.out.println("str:" + str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
