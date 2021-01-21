package ioEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_08 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) { // 언제까지 반복할지 모를때
			System.out.print("1.단어입력  2.단어검색  3.종료  >>");
			num = sc.nextInt();
			String input, searchWord, line;
			boolean flag = false;
			
			switch(num ) {
			case 1:
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("단어/뜻 입력>>");
				input = br.readLine(); // 입력하고 엔터치는 순간 읽어들인다. // throws IOException
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\sun\\voca.txt",true)); // voca.txt와 이 자바파일과의 연결고리 // 폴더가 없으면 에러남 // 파일명만 쓰면 기본위치에 자동으로 만들어진다. // ,true를 해주는 이유는 1.단어입력으로 들어가서 데이터를 입력할때마다 데이터가 누적되지 않고 쓸때마다 초기화되기 때문
				
				bw.write(input); // input = br.readLine();로 콘솔에서 쓴 내용을 파일에 쓰겠다.
				bw.newLine(); // 개행을 추가해주지 않으면 파일에 데이터가 다닥다닥 붙어 나온다
				bw.flush(); // 버퍼클래스에 제한을 두지 않아서 8192개의 데이터가 들어오기 전까진 버퍼 클래스가 데이터를 파일로 내보내지 않으므로 제한없이 그냥 다 파일로 내보내도록 필요한 코딩
				
				break;
				
			case 2:
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // 검색할 단어 입력받을 준비
				
				System.out.print("검색 단어 입력>>");
				searchWord = br2.readLine();
				
				BufferedReader br3 = new BufferedReader(new FileReader("c:\\sun\\voca.txt")); // 입력한 단어를 파일에서 읽어와야 비교가 가능하기 때문
				
				while((line = br3.readLine()) != null) { // null을 만날때까지(데이터가 더 이상 없을때까지) 읽어들인다
					String tokens[] = line.split("/"); // split 메서드 쓰는 방법 숙지 // 배열에 저장된다
					// 모든 줄이 단어/단어뜻 형태이기 때문에 각 줄마다 단어 담긴 배열 1개, 단어의 뜻들이 담긴 배열 1개가 생겨 tokens[] 배열의 길이는 2가 된다
					
					if(tokens[0].equalsIgnoreCase(searchWord)) {
						System.out.println("단어>>" + tokens[0]);
						System.out.println("단어의 뜻>>" + tokens[1]);
						flag = true;
					}
				} // while
				
				if(flag == false) {
					System.out.println("찾는 단어 없음");
				}
				break;
				
			case 3:
				System.out.println("프로그램 종료합니다."); // 항상 프로그램을 종료하는 기능부터 코딩하는게 좋다.
				
				sc.close(); // 스캐너 클래스도 안정적으로 종료 (안 써도 큰 상관은 없지만 예기치 못한 버그발생 차단)
				
				System.exit(0); // 정상적으로 종료할때 // ()안에 1을 넣어도 크게 달라지는건 없음
			
			default :
				System.out.println("1~3 사이의 번호만 입력 가능");
			}
		}
	}

}
