<%@page import="java.sql.Timestamp"%>
<%@page import="board.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    writeProc.jsp <br>
    
    <%
    	request.setCharacterEncoding("UTF-8");
    %>
    
    <jsp:useBean id="bean" class="board.BoardBean"/>
    <jsp:setProperty property="*" name="bean"/>
    
    <%
    	BoardDao dao = BoardDao.getInstance();
    
    	bean.setReg_date(new Timestamp(System.currentTimeMillis()));
    	bean.setIp(request.getRemoteAddr());
    	
    	int cnt = dao.insertArticle(bean); 
    	
    	if(cnt > 0) {
    		response.sendRedirect("list.jsp");
    	}
    	else {
    		response.sendRedirect("writeForm.jsp");
    	}
    %>