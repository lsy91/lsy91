<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>
<%@ include file="color.jsp" %>

    content.jsp <br>
    
    <b>글 내용 보기</b> <br>
    
    <style type="text/css">
    	body{
    		text-align : center;
    	}
    	
    	table{
    		margin : 0 auto;
    	}
    </style>
    
    <link rel="stylesheet" type="text/css" href="resources/style.css"/>
    
    <body bgcolor = "<%=bodyback_c%>">
    
    	<form:form commandName="BoardBean" method="post" action="content.bd">
    		
    		<table border="1" width="500" bgcolor="<%=bodyback_c %>">
    		
    			<tr height="30">
    				<td align="center" width="125" bgcolor="<%=value_c %>">글번호</td>
    				<td align="center" width="125">${board.num }</td>
    				<td align="center" width="125" bgcolor="<%=value_c %>">조회수</td>
    				<td align="center" width="125">${board.readcount }</td>
    			</tr>
    			
    			<tr height="30">
    				<td align="center" width="125" bgcolor="<%=value_c %>">작성자</td>
    				<td align="center" width="125">${board.writer }</td>
    				<td align="center" width="125" bgcolor="<%=value_c %>">작성일</td>
    				<td align="center" width="125">
    					<fmt:parseDate value="${board.regdate }" var="date" pattern="yyyy-MM-dd HH:mm"/>
    					<fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm"/>
    				</td>
    			</tr>
    			
    			<tr height="30">
    				<td align="center" width="125" bgcolor="<%=value_c %>">글제목</td>
    				<td align="center" width="375" colspan="3">${board.subject }</td>
    			</tr>
    			
    			<tr height="30">
    				<td align="center" width="125" bgcolor="<%=value_c %>">글내용</td>
    				<td align="center" width="375" colspan="3">${board.content }</td>
    			</tr>
    			
    			<tr height="30">
    				<td align="center" colspan="4" bgcolor="<%=value_c %>">
    					<input type="button" value="글수정" onClick="location.href='update.bd?num=${board.num}&pageNumber=${pageNumber}'">
    					<input type="button" value="글삭제" onClick="location.href='deleteForm.bd?num=${board.num}&pageNumber=${pageNumber}'">
    					<input type="button" value="답글쓰기" onClick="location.href='reply.bd?num=${board.num}&pageNumber=${pageNumber}'">
    					<input type="button" value="글목록" onClick="location.href='list.bd?pageNumber=${pageNumber}'">
    				</td>
    			</tr>
    			
    		</table>
    				
    	</form:form>
    </body>