<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>
<%@ include file="color.jsp" %>

deleteForm.jsp <br>

<style type="text/css">
	
	body{
		text-align : center;
	}
	
	table{
		margin : 0 auto;
	}
</style>

<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
<script src='<c:url value="/resources/js/jquery.js"/>' type="text/javascript"></script>
<script src='<c:url value="/resources/script.js"/>' type="text/javascript"></script>

<script type="text/javascript">

	function passwdCheck() {
		if(delForm.passwd.value == "") {
			alert("비밀번호를 입력하세요");
			delForm.passwd.focus();
			return false;
		}
	}
	
</script>

<body bgcolor="<%=bodyback_c %>">
	<b>글삭제</b> <br>
	
	<form name="delForm" action="deleteForm.bd" method="post">
		
		<table align="center" width="360">
			
			<tr height="30">
				<td align="center" bgcolor="<%=value_c %>">
					<b>비밀번호를 입력해 주세요.</b>
				</td>
			</tr>
			
			<tr height="30">
				<td align="center">
					비밀번호 : <input type="password" name="passwd" maxlength="10" value="">
					<input type="hidden" name="num" value="${board.num }">
					<input type="hidden" name="pageNumber" value="${pageNumber }">
				</td>
			</tr>
			
			<tr height="30">
				<td align="center" bgcolor="<%=value_c %>"> 
					<input type="submit" value="글삭제" onClick="return passwdCheck()">
					<input type="button" value="글목록" onClick="location.href='list.bd?pageNumber=${pageNumber}'"> 
				</td>
			</tr>
			
		</table>
	</form>
</body>
    