package ioEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ----------------------- 키보드와 연결하는 스트림
		
		String str;
		
		try {
			System.out.print("파일의 이름을 입력하세요->");
			String fileName = br.readLine(); // 경로 입력 // cf) c:\\sun\\abc.txt
			
			System.out.println("파일에 저장할 내용을 입력하세요.");
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)); // 위에 두 줄 합친거
			
			while( (str = br.readLine()) != null) { // ctrl + z 누르면 입력값을 null로 인식함
				bw.write(str);
				bw.write("\r\n"); // Enter 기능
				bw.newLine(); // Enter 쳐라 // 파일에 개행도 적용하라는 뜻
			}
			
			// --------------------------- 키보드에 입력한 내용을 파일에 내보내는 스트림
			
			System.out.println("여기까지 입력 끝");
			// bw.flush(); // 이 메서드를 써도 실행이 끝난다.
			bw.close(); // 입력할 값이 없으니까 닫아라
			br.close(); // 읽을 값이 없으니까 닫아라
			
			// FileReader fr = new FileReader(fileName);
			// BufferedReader br2 = new BufferedReader(fr);
			
			BufferedReader br2 = new BufferedReader(new FileReader(fileName));
			
			String str2;
			while((str2 = br2.readLine()) != null) { // ctrl + z를 입력할 때까지
				System.out.println(str2); // 파일의 내용을 콘솔창에 출력
			}
			
			br2.close();
			
			// -------------------------------- 키보드로 입력한 내용을 콘솔에 출력하는 스트림
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
