<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>
<%@ include file="color.jsp"%>

updateForm.jsp <br>

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
	<b>글쓰기</b> <br>
	
	<form method="post" name="writeForm" action="update.bd">
		<input type="hidden" name="pageNumber" value="${pageNumber }">
		<input type="hidden" name="num" value="${board.num }">
		
		<table border="1" width="450" bgcolor="<%=bodyback_c %>">
			<tr>
				<td colspan="2" align="right" bgcolor="<%=value_c %>">
					<a href="list.bd">글목록</a>
				</td>
			</tr>
			
			<tr>
				<td width="100" bgcolor="<%=value_c %>" align="center">이름</td>
				<td width="350">
					<input type="text" name="writer" maxlength="10" value="${board.writer }">
				</td>
			</tr>
			
			<tr>
				<td width="100" bgcolor="<%=value_c %>" align="center">제목</td>
				<td width="350">
					<input type="text" name="subject" maxlength="20" value="${board.subject }">
				</td>
			</tr>
			
			<tr>
				<td width="100" bgcolor="<%=value_c %>" align="center">Email</td>
				<td width="350">
					<input type="text" name="email" maxlength="20" value="${board.email }">
				</td>
			</tr>
			
			<tr>
				<td width="100" bgcolor="<%=value_c %>" align="center">내용</td>
				<td width="350">
					<textarea name="content" id="ct" rows="15" cols="50">${board.writer }</textarea>
				</td>
			</tr>
			
			<tr>
				<td width="100" bgcolor="<%=value_c %>" align="center">비밀번호</td>
				<td width="350">
					<input type="password" name="passwd" maxlength="10">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" bgcolor="<%=value_c %>" align="center" height="30">
					<input type="submit" value="글수정" onClick="return writeSave()">
					<input type="reset" value="다시작성">
					<input type="button" value="목록보기" onClick="location.href='list.bd?pageNumber=${pageNumber}'">
				</td>
			</tr>
			
		</table>
	</form>
</body>