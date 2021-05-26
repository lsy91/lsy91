package board.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("myBoard")
public class BoardDao {
	
	private String ns = "board.BoardBean.";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public int getTotalCount(Map<String, String> map) {
		int cnt = sqlSessionTemplate.selectOne(ns + "GetTotalCount" , map);
		return cnt;
	}

	public List<BoardBean> getDataList(Paging pageInfo, Map<String, String> map) {
		List<BoardBean> lists = new ArrayList<BoardBean>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		lists = sqlSessionTemplate.selectList(ns + "GetDataList", map, rowBounds);
		return lists;
	}

	public void writeBoard(BoardBean board) {
		sqlSessionTemplate.insert(ns + "WriteBoard", board);
	}

	public void upCount(int num) {
		sqlSessionTemplate.update(ns + "UpreadCount", num);
	}

	public BoardBean getData(int num) {
		BoardBean bbean = sqlSessionTemplate.selectOne(ns + "GetData", num);
		return bbean;
	}

	public int updateBoard(BoardBean board) {
		int cnt = sqlSessionTemplate.update(ns + "UpdateBoard" , board);
		return cnt;
	}

	public int deleteArticle(int num, String passwd) {
		BoardBean bbean = new BoardBean();
		bbean.setNum(num);
		bbean.setPasswd(passwd);
		int cnt = sqlSessionTemplate.delete(ns + "DeleteArticle" , bbean);
		return cnt;
	}

	public int getArticleCount() {
		int cnt2 = sqlSessionTemplate.selectOne(ns + "GetArticleCount");
		return cnt2;
	}

	public void insertReply(BoardBean board) {
		sqlSessionTemplate.update(ns + "UpdateRestep", board);
		
		int restep = board.getRestep();
		restep++;
		board.setRestep(restep);
		
		int relevel = board.getRelevel();
		relevel++;
		board.setRelevel(relevel);
		
		sqlSessionTemplate.insert(ns + "InsertReply", board);
	}

}
