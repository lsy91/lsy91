package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String dbid = "jspid";
	private String dbpw = "jsppw";
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private static BoardDao instance;

	private BoardDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbid, dbpw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}

	public ArrayList<BoardBean> getArticles(int start, int end) {

		ArrayList<BoardBean> lists = new ArrayList<BoardBean>();

		String sql = "select num,writer,email,subject,passwd,reg_date,readcount,ref,re_step,re_level,content,ip ";
		sql += "from (select rownum as rank, num, writer, email, subject, passwd, reg_date, readcount, ref, re_step, re_level, content, ip ";
		sql += "from (select num,writer,email,subject,passwd,reg_date,readcount,ref,re_step,re_level,content,ip ";
		sql += "from board ";
		sql += "order by ref desc, re_step asc )) ";
		sql += "where rank between ? and ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardBean article = new BoardBean();

				article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
				article.setEmail(rs.getString("email"));
				article.setSubject(rs.getString("subject"));
				article.setPasswd(rs.getString("passwd"));
				article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
				article.setRef(rs.getInt("ref"));
				article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
				article.setContent(rs.getString("content"));
				article.setIp(rs.getString("ip"));

				lists.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
	}

	public int getArticleCount() {
		int count = 0;
		String sql = "select count(*) as cnt from board";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					;
				rs.close();

				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
