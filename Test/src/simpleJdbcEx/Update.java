package simpleJdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1
			Class.forName(driver);

			// 2
			conn = DriverManager.getConnection(url, id, pw);

			int up_num = 3;
			String up_name = "정국";
			String up_addr = "목포";
			
			// 3
//			String sql = "update simple set name = '웬디', addr = '광주' where num = 7";
			
//			String sql = "update simple set name = '" +up_name+ "', addr = '"+ up_addr +"' where num = " +up_num;
			
			String sql = "update simple set name = ?, addr = ? where num = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1,up_name);
			ps.setString(2,up_addr);
			ps.setInt(3,up_num);
			
			System.out.println("sql문 분석");

			// 4
			int count = ps.executeUpdate();
			System.out.println("count:" + count);
			if (count == 0) {
				System.out.println("수정 실패");
			} else
				System.out.println("수정 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

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
