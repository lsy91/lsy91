<%@page import="board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    deleteProc.jsp(num,passwd) => deleteProc.jsp <br>
    
    <%
    	int num = Integer.parseInt(request.getParameter("num"));
    	String passwd = request.getParameter("passwd");
    	int pageNum = Integer.parseInt(request.getParameter("pageNum"));
    	
    	BoardDao dao = BoardDao.getInstance();
    	
    	int cnt = dao.deleteArticle(num,passwd); 
    	
    	if(cnt > 0) {
    		
    		int recordCount = dao.getArticleCount();
    		int pageCount = recordCount / 10 + (recordCount % 10 == 0 ? 0 : 1);
    		
    		if(pageNum > pageCount) {
    			response.sendRedirect("list.jsp?pageNum="+(pageNum-1));
    		}
    		else {
    			response.sendRedirect("list.jsp?pageNum="+pageNum);
    		}
    	}
    	else {
    %>
    	<script type="text/javascript">
    		alert('비밀번호가 맞지 않습니다.');
    		history.go(-1);
    	</script>
    	
    	
    <%
    	}
    %>