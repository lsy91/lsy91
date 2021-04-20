<%@page import="java.sql.Timestamp"%>
<%@page import="board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    replyForm.jsp => replyProc.jsp <br>
    
    <%
    	request.setCharacterEncoding("UTF-8");
    	BoardDao dao = BoardDao.getInstance();
    %>
    
    <jsp:useBean id="bean" class="board.BoardBean"/>
    <jsp:setProperty property="*" name="bean"/>
    
    <%
    	bean.setReg_date(new Timestamp(System.currentTimeMillis()));
    	bean.setIp(request.getRemoteAddr());
    	
    	int cnt = dao.replyArticle(bean); 
    	
    	if(cnt > 0)
    		response.sendRedirect("list.jsp");
    	else {
    		response.sendRedirect("replyForm.jsp");
    	}
    %>