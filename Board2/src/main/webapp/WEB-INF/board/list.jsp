<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp" %>
<%@ include file="color.jsp" %>

list.jsp <br>

<style type="text/css">
	body{
		text-align : center;
	}
	
	table{
		margin : 0 auto;
	}
</style>

<link rel="stylesheet" type="text/css" href="resources/style.css"/>

<body bgcolor="<%=bodyback_c%>">
	<b>글목록(전체 글 : ${pageInfo.totalCount})</b>
	
	<form action="list.bd" method="get" align="center">
		<select name="whatColumn">
			<option value="all">전체검색</option>
			<option value="writer">작성자</option>
			<option value="subject">제목</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
	
	<table width="700">
		<tr>
			<td align="right" bgcolor="<%=value_c %>">
				<a href="write.bd">글쓰기</a>
			</td>
		</tr>
	</table>
	
	<table width="700" align="center">
		<tr bgcolor="<%=value_c %>" align="center">
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회</td>
			<td>IP</td>
		</tr>
		
		<c:set var="totalCount" value="${pageInfo.totalCount }"></c:set>
		<c:forEach var="board" items="${lists }" varStatus="status">
			<c:set var="totalCount" value="${totalCount-1 }"></c:set>
			
			<tr>
				<td>
					${pageInfo.totalCount - ((pageInfo.pageNumber-1) * pageInfo.pageSize + status.index) }
				</td>
				
				<td>
					<c:if test="${board.relevel > 0 }">
						<c:set var="wid" value="${board.relevel * 20 }"/>
						<img src="resources/images/level.gif" width="${wid }" height="16">
						<img src="resources/images/re.gif">
					</c:if>
					
					<a href="content.bd?num=${board.num }&pageNumber=${pageInfo.pageNumber}">${board.subject }</a>
					
					<c:if test="${board.readcount >= 10 }">
						<img src="resources/images/hot.gif">
					</c:if>
				</td>
				
				<td>${board.writer }</td>
				
				<td>
					<fmt:parseDate value="${board.regdate }" var="date" pattern="yyyy-MM-dd HH:mm"/>
					<fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm"/>
				</td>
				
				<td>${board.readcount }</td>
				
				<td>${board.ip }</td>
				
			</tr>
		</c:forEach>
	</table>
	
	<center>
		${pageInfo.pagingHtml }
	</center>
</body>