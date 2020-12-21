package simpleJdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "jspid";
		String pw = "jsppw";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,id,pw);
			
			String sql = "delete from simple where num = 7";
			
			ps = conn.prepareStatement(sql);
			
			int count = ps.executeUpdate();
			System.out.println("count:"+count);
			if(count == 0) 
				System.out.println("삭제 실패");
			else
				System.out.println("삭제 성공");
				
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
