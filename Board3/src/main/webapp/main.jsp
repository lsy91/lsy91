<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    main.jsp <br>
    
    <%
    	String viewPage = request.getContextPath() + "/list.bd";
    	response.sendRedirect(viewPage);
    %>