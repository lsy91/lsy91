<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    writeForm.jsp <br>
    
    <style type="text/css">
    	body {
    		text-align : center;
    	}
    	
    	table {
    		margin : 0 auto;
    	}
    </style>
    
    <link rel="stylesheet" type="text/css" href="style.css"/>
    
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="script.js"></script>
    
    <%@ include file="color.jsp"%>
    <body bgcolor="<%=bodyback_c%>">
    	<b>글쓰기</b> <br>
    	<form method="post" name="writeForm" action="writeProc.jsp">
    		<table border="1" width="450" bgcolor="<%=bodyback_c %>">
    			<tr>
    				<td colspan="2" align="right" bgcolor="<%=value_c%>">
    					<a href="list.jsp">글목록</a>
    				</td>
    			</tr>
    			
    			<tr>
    				<td width="100" bgcolor="<%=value_c %>" align="center">이름</td>
    				<td width="350">
    					<input type="text" name="writer" maxlength="10" value="홍길동">
    				</td>
    			</tr>
    			
    			<tr>
    				<td width="100" bgcolor="<%=value_c %>" align="center">제목</td>
    				<td width="350">
    					<input type="text" name="subject" maxlength="20" value="어떤글">
    				</td>
    			</tr>
    			
    			<tr>
    				<td width="100" bgcolor="<%=value_c %>" align="center">Email</td>
    				<td width="350">
    					<input type="text" name="email" maxlength="10" value="aa@xx.com">
    				</td>
    			</tr>
    			
    			<tr>
    				<td width="100" bgcolor="<%=value_c %>" align="center">내용</td>
    				<td width="350">
    					<textarea name="content" id="ct" rows="15" cols="50">내용입니다.</textarea>
    				</td>
    			</tr>
    			
    			<tr>
    				<td width="100" bgcolor="<%=value_c %>" align="center">비밀번호</td>
    				<td width="350">
    					<input type="password" name="passwd" maxlength="10" value="1234">
    				</td>
    			</tr>
    			
    			<tr>
    				<td colspan="2" bgcolor="<%=value_c %>" align="center" height="30">
    					<input type="submit" value="글쓰기" onClick="return writeSave()">
    					<input type="reset" value="다시 작성">
    					<input type="button" value="목록보기" onClick="location.href='list.jsp'">
    				</td>
    			</tr>
    		</table>
    	</form>
    </body>