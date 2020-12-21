package simpleJdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {
	// JDBC 프로그래밍 단계
	// 0. jar화일 가져오기
	// D:\oracle\product\12.2.0\dbhome_1\jdbc\lib\ojdbc8.jar
	// 프로젝트 우클릭 - properties - javabuildpath - library - Add External JAR - 위의 경로
	// 프린터 사용 전에 드라이버 설치 같은거임
	
	public static void main(String[] args) {
		
		try {
			// 1. 오라클 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("드라이버 로드 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			// localhost : 내컴퓨터 , 1521 : 포트번호
			String user = "jspid";
			String pw = "jsppw";
			
			System.out.println("DB와의 연결을 시도합니다.");
			
			Connection conn = DriverManager.getConnection(url, user, pw);
			// 계정에 잘 접속됐다는 정보가 conn 변수 안에 들어온다
			// 접속 객체가 만들어졌다고도 얘기한다
			
			System.out.println("conn:" + conn);
			
			System.out.println("DB와의 연결 성공");
			
			
			
			
			
			
			
			
			
			System.out.println("DB와 연결끊기 시도합니다.");
			
			// 3. 연결끊기
			conn.close();
			System.out.println("DB와 연결 끊기 성공");
			
		} catch (ClassNotFoundException e) { // 드라이버 로드에 실패했을 때 (= 드라이버를 찾지 못할 때)
			System.out.println("드라이버 로딩 실패");
			
		} catch (SQLException e) { // 접속하지도 않았는데 연결 끊으라고 할 때, 연결 계정 정보가 없을 때
			System.out.println("SQLException 발생");
		} 
	}
}


