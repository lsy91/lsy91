<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    board_start.jsp <br>
    
    <%
    	String viewPage = request.getContextPath() + "/list.bd";
    	response.sendRedirect(viewPage);
    %>