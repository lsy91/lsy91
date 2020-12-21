package simpleJdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		Connection conn = null; // 메인메서드 내에서 전역변수로 설정했기 때문에 null로 초기화
		PreparedStatement ps = null;
		ResultSet rs = null;

		// 1. 드라이버 로드
		try {
			Class.forName(driver); // 드라이버를 로드하는 메서드

			// 2. 계정 접속
			conn = DriverManager.getConnection(url, id, pw);
			// conn 변수 안에 DB 접속경로와, 접속계정 정보가 저장된다.
			System.out.println("접속 성공");

			String sql = "select * from simple order by num asc";
			ps = conn.prepareStatement(sql); // 위에 String 문자열 분석 좀 해바라 // 잘 실행하기 위해서
			// 3. 명령분석 : sql 변수 안의 문자열을 분석한 정보가 ps 변수 안에 들어간다
			System.out.println("명령분석");

			// prepareStatement() : sql 변수 안의 문자열을 분석하는 명령어
			// ps : sql문을 분석한 정보가 들어있다.

			// 4. 실행
			rs = ps.executeQuery(); // 괄호 안에 sql 쓰면 안 된다.
			while (rs.next()) { // rs 변수 안의 레코드를 한 줄씩 읽어들인다. boolean 타입이기 때문에 레코가 있으면 true, 없으면 false라는 뜻임
				int num = rs.getInt("num"); // "num" 대신 1을 써서 첫번째 칼럼값만 가져오기 가능
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num + "," + name + "," + addr);
			}

			// // 5. 접속끊기
			// conn.close();
			// System.out.println("연결 종료");

		} catch (ClassNotFoundException e) {
			// 드라이버 로드에 실패했을 때
			e.printStackTrace();
		} catch (SQLException e) {
			// DriverManager.getConnection() : 계정정보를 알 수 없을 때
			// conn.prepareStatement() : 테이블을 찾을 수 없을 때
			// ps.executeQuery() : 테이블은 있는데 실행할 레코드가 없을 때 (인서트된 값이 없을 때)
			// getInt : 테이블의 칼럼명과 다른 칼럼명을 가져오려고 할 때 or 다른 타입값을 가져오려고 할 때
			// getString : 테이블의 칼럼명과 다른 칼럼명을 가져오려고 할 때 or 다른 타입값을 가져오려고 할 때
			// conn.close() : 연결이 안 됐는데 연결을 끊으라고 할 때
			e.printStackTrace();
			
		} finally { // 안정적으로 프로그램을 종료하기 위한 장치

			if (rs != null) { // rs 변수를 사용하지도 않았는데 닫아라 라고 하면 안되니까
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			// 5. 접속끊기
			if (conn != null) {
				try {
					conn.close(); // finally 블럭 안에서 쓰려면 : 지역변수에서 전역변수로 설정, 예외처리, 변수 초기화
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("연결 종료");
			}
		}
	} // main

}
