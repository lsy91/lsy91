package simpleJdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1. 드라이버 로드
			Class.forName(driver);

			// 2.접속
			conn = DriverManager.getConnection(url, id, pw);

			// 3. sql문 분석
//			int in_num = 6;
//			String in_name = "태연";
//			String in_addr = "강릉";
			
			Scanner sc = new Scanner(System.in);
			
			int in_num;
			String in_name;
			String in_addr;
			
			System.out.print("번호: ");
			in_num = sc.nextInt();
			
			System.out.print("이름: ");
			in_name = sc.next();
			
			System.out.print("주소: ");
			in_addr = sc.next();
			
			sc.close();
//			String sql = "insert into simple(num,name,addr) values(4,'choi','제주')"; // 자바코드에서 쓸때는 insert문 뒤에 ; 쓰면 안된다.
			
//			String sql = "insert into simple(num,name,addr) values("+ in_num +",'"+ in_name +"','"+ in_addr +"')";
			
			String sql = "insert into simple(num,name,addr) values(?,?,?)"; // ?:위치홀더
			
			ps = conn.prepareStatement(sql); // 명령 분석
			
			ps.setInt(1,in_num); // 1번 물음표(위치홀더) 자리에 in_num 변수 넣어라
			ps.setString(2,in_name); // 2번 물음표 자리에 in_name 변수 넣어라
			ps.setString(3,in_addr); // 3번 물음표 자리에 in_addr 변수 넣어라
			

			// 4. 실행
			int count = ps.executeUpdate(); // 실행이 성공한 개수 정보가 이 변수에 들어온다
			System.out.println("count:" + count);
			if (count == 0)
				System.out.println("삽입 실패");
			else
				System.out.println("삽입 성공");

//			conn.commit(); : 자바에서는 이거 안 써줘도 자동으로 커밋된다. 

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 자원반납
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
		}

	}

}
