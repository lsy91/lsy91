<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>
<%@ include file="color.jsp" %>

writeForm.jsp <br>

<style type="text/css">
	body{
		text-align : center;
	}
	table{
		margin : 0 auto;
	}
</style>

<link href='<c:url value="/resources/style.css"/>' rel="stylesheet" type="text/css"/>
<script src='<c:url value="/resources/js/jquery.js"/>' type="text/javascript"></script>
<script src='<c:url value="/resources/script.js"/>' type="text/javascript"></script>

<body bgcolor="<%=bodyback_c%>">

	<b>글쓰기</b>
	
	<form name="writeform" method="post" action="write.bd">
		
		<table border="1" width="450" bgcolor="<%=bodyback_c %>">
			<tr>
				<td colspan="2" align="right" bgcolor="<%=value_c %>">
					<a href="list.bd">글목록</a>
				</td>
			</tr>
			
			<tr>
				<td width="100" align="center" bgcolor="<%=value_c %>">이름</td>
				<td width="350">
					<input type="text" name="writer" maxlength="20">				
				</td>
			</tr>
			
			<tr>
				<td width="100" align="center" bgcolor="<%=value_c %>">제목</td>
				<td width="350">
					<input type="text" name="subject" maxlength="50">				
				</td>
			</tr>
			
			<tr>
				<td width="100" align="center" bgcolor="<%=value_c %>">Email</td>
				<td width="350">
					<input type="text" name="email" maxlength="30">				
				</td>
			</tr>
			
			<tr>
				<td width="100" align="center" bgcolor="<%=value_c %>">내용</td>
				<td width="350">
					<textarea name="content" cols="50" rows="15"></textarea>			
				</td>
			</tr>
			
			<tr>
				<td width="100" align="center" bgcolor="<%=value_c %>">비밀번호</td>
				<td width="350">
					<input type="password" name="passwd" maxlength="10">				
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center" bgcolor="<%=value_c %>" height="30">
					<input type="submit" value="글쓰기" onClick="return writeSave()">
					<input type="reset" value="다시작성">
					<input type="button" value="목록보기" onClick="history.go(-1)">
				</td>
			</tr>
			
		</table>
	</form>
</body>