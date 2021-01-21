package ioEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_10_wordcount {

	public static void main(String[] args) throws IOException { // IOException이 FileNotFoundException의 부모기 때문에 대신 예외처리가 가능
		
		BufferedReader br = new BufferedReader(new FileReader("lyrics.txt"));
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		String line; // 변수는 코딩하는 중간중간 만드는 습관 들이기
		int count;
		
		while(true) {
			if((line = br.readLine()) != null) {
				String tokens[] = line.split(" "); // 한줄 한줄 읽을 때마다 배열의 크기가 달라진다
				
				for(int i=0; i<tokens.length; i++) {
					if(hm.containsKey(tokens[i])) { // 해당 키값이 있는지 확인
						count = hm.get(tokens[i]); // 있다면 해당 키 값의 밸류값을
						hm.put(tokens[i], count+1); // 해쉬맵에 추가
						// hm.put(tokens[i], hm.get(tokens[i])+1); // 위에 두 줄 합친거
					}
					else {
						hm.put(tokens[i], 1); // 단어를 만날때마다 개수를 1로 초기화하여 해쉬맵에 추가
					}
				} // for
			} // if
			
			else {
				break;
			}
		} // while
		
		System.out.println(hm);
		
		Set<String> keys = hm.keySet(); // 키값만 불러오는 메서드
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+":"+hm.get(key));
		}
	}
}

//lyrics 파일에서 데이터를 읽어서
//단어별 빈도수 출력

//1.파일에서 읽어오기 위해서 파일과의 연결다리 형성
//2.한줄 읽기를 반복 (for, while)
//3.공백 기준 잘라내기 => 단어별 구분
//4.단어와 빈도수를 쌍처리 => HashMap
//5.HashMap에 없는 단어는 무조건 value 1로 설정
//HashMap에 있는 단어는 기존 단어의 value+1로 설정
