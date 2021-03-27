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

		String sql = "select num, writer, email, subject, passwd, reg_date, readcount, ref, re_step, re_level, content, ip ";
		sql += "from (select rownum as rank, num, writer, email, subject, passwd, reg_date, readcount, ref, re_step, re_level, content, ip ";
		sql += "from (select num, writer, email, subject, passwd, reg_date, readcount, ref, re_step, re_level, content, ip ";
		sql += "from board ";
		sql += "order by ref desc, re_step asc )) ";
		sql += "where rank between ? and ? ";

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
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();

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
					rs.close();
				if (pstmt != null)
					pstmt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println(count);
		return count;
	}

	public int insertArticle(BoardBean bean) {
		int cnt = -1;
		String sql = "insert into board(num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip) "
				+ "values(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPasswd());
			pstmt.setTimestamp(5, bean.getReg_date());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			pstmt.setString(8, bean.getContent());
			pstmt.setString(9, bean.getIp());

			cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public BoardBean getArticle(int num) {
		BoardBean bean = null;
		
		String sql2 = "update board set readcount = readcount + 1 where num=?";
		String sql = "select * from board where num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				bean = new BoardBean();
				bean.setNum(rs.getInt("num"));
				bean.setWriter(rs.getString("writer"));
				bean.setEmail(rs.getString("email"));
				bean.setSubject(rs.getString("subject"));
				bean.setPasswd(rs.getString("passwd"));
				bean.setReg_date(rs.getTimestamp("reg_date"));
				bean.setReadcount(rs.getInt("readcount"));
				bean.setRef(rs.getInt("ref"));
				bean.setRe_step(rs.getInt("re_step"));
				bean.setRe_level(rs.getInt("re_level"));
				bean.setContent(rs.getString("content"));
				bean.setIp(rs.getString("ip"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
	
	public BoardBean updateGetArticle(int num) {
		
		BoardBean bean = null;
		String sql = "select * from board where num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				bean = new BoardBean();
				bean.setNum(rs.getInt("num"));
				bean.setWriter(rs.getString("writer"));
				bean.setEmail(rs.getString("email"));
				bean.setSubject(rs.getString("subject"));
				bean.setPasswd(rs.getString("passwd"));
				bean.setReg_date(rs.getTimestamp("reg_date"));
				bean.setReadcount(rs.getInt("readcount"));
				bean.setRef(rs.getInt("ref"));
				bean.setRe_step(rs.getInt("re_step"));
				bean.setRe_level(rs.getInt("re_level"));
				bean.setContent(rs.getString("content"));
				bean.setIp(rs.getString("ip"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bean;
	}
	
	public int updateArticle(BoardBean bean) {
		int cnt = -1;
		
		String sql2 = "select passwd from board where num=?";
		
		String sql = "update board set writer=?,email=?,subject=?,passwd=?,content=? where num=? ";
		
		String dbpw = null;
		
		try {
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, bean.getNum());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbpw = rs.getString("passwd");
				
				if(dbpw.equals(bean.getPasswd())) {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, bean.getWriter());
					pstmt.setString(2, bean.getEmail());
					pstmt.setString(3, bean.getSubject());
					pstmt.setString(4, bean.getPasswd());
					pstmt.setString(5, bean.getContent());
					pstmt.setInt(6, bean.getNum());
					
					cnt = pstmt.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public int deleteArticle(int num, String passwd) {
		String sql = "select passwd from board where num=?"; // passwd
		String sql2 = "delete from board where num=?";
		String dbpw;
		int cnt = -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dbpw = rs.getString("passwd");
				
				if(dbpw.equals(passwd)) {
					pstmt = conn.prepareStatement(sql2);
					pstmt.setInt(1, num);
					cnt = pstmt.executeUpdate();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public int replyArticle(BoardBean bean) {
		
		String sql = "update board set re_step = re_step + 1 where ref=? and re_step > ?";
		
		String sql2 = "insert into board(num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip) "
					+ "values(board_seq.nextval,?,?,?,?,?,?,?,?,?,?)";
		
		int cnt = -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getRef());
			pstmt.setInt(2, bean.getRe_step());
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPasswd());
			pstmt.setTimestamp(5, bean.getReg_date());
			pstmt.setInt(6, bean.getRef());
			
			int re_step = bean.getRe_step();
			re_step++;
			pstmt.setInt(7, re_step);
			
			int re_level = bean.getRe_level();
			re_level++;
			pstmt.setInt(8, re_level);
			
			pstmt.setString(9, bean.getContent());
			pstmt.setString(10, bean.getIp());
			
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
}
