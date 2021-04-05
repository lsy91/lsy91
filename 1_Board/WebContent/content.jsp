<%@page import="board.BoardBean"%>
<%@page import="board.BoardDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    content.jsp<br>
    <b>글 내용 보기</b> <br>
    
    <style type="text/css">
    	body{
    		text-align : center;
    	}
    	
    	table {
    		margin : 0 auto;
    	}
    </style>
    
    <link rel="stylesheet" type="text/css" href="style.css"/>
    
    <%@ include file="color.jsp" %>
    
    <%
    	int num = Integer.parseInt(request.getParameter("num"));
    	int pageNum = Integer.parseInt(request.getParameter("pageNum"));
    	
    	System.out.println("content.jsp num:" + num + ", pageNum: " + pageNum);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    	
    	BoardDao dao = BoardDao.getInstance();
    	BoardBean bean = dao.getArticle(num);
    	
    	int ref = bean.getRef();
    	int re_step = bean.getRe_step();
    	int re_level = bean.getRe_level();
    	
    	System.out.println("content.jsp " + num + "," + ref + "," + re_step + "," + re_level);
    %>
    
    <table border="1" width="500" bgcolor="<%=value_c%>">
    	<tr height="30">
    		<td align="center" width="125" bgcolor="<%=value_c %>">글번호</td>
    		<td align="center" width="125" bgcolor="<%=bean.getNum()%>"></td>
    		<td align="center" width="125" bgcolor="<%=value_c %>">조회수</td>
    		<td align="center" width="125" bgcolor="<%=bean.getReadcount() %>"></td>
    	</tr>
    	
    	<tr height="30">
    		<td align="center" width="125" bgcolor="<%=value_c %>">작성자</td>
    		<td align="center" width="125" bgcolor="<%=bean.getWriter()%>"></td>
    		<td align="center" width="125" bgcolor="<%=value_c %>">작성일</td>
    		<td align="center" width="125" bgcolor="<%=sdf.format(bean.getReg_date())%>"></td>  
    	</tr>
    	
    	<tr height="30">
    		<td align="center" width="125" bgcolor="<%=value_c %>">글제목</td>
    		<td align="center" width="125" bgcolor="<%=bean.getSubject()%>"></td>
    	</tr>
    	
    	<tr height="30">
    		<td align="center" width="125" bgcolor="<%=value_c %>">글내용</td>
    		<td align="center" width="125" bgcolor="<%=bean.getContent()%>"></td>
    	</tr>
    	
    	<tr height="30">
    		<td align="center" colspan="4" bgcolor="<%=value_c %>">
    			<input type="button" value="글수정" onClick="location.href='updateForm.jsp?num=<%=bean.getNum() %>&pageNum=<%=pageNum %>'">
    			<input type="button" value="글삭제" onClick="location.href='deleteForm.jsp?num=<%=bean.getNum() %>&pageNum=<%=pageNum %>'">
    			<input type="button" value="답글쓰기" onClick="location.href='replyForm.jsp?ref=<%=ref %>&re_step=<%=re_step %>&re_level=<%=re_level %>'">
    			<input type="button" value="글목록" onClick="location.href='list.jsp?pageNum=<%=pageNum %>'">
    		
    		</td>
			
    	</tr>
    
    </table>