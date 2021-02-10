<%@page import="board.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="board.BoardDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!-- IPv4 형태로 출력하는 방법 :
    -Djava.net.preferIPv4Stack=true -->
    
    <style type="text/css">
    	body{
    		text-align : center;
    	}
    	
    	table{
    		margin : 0 auto;
    	}
    </style>
    
<%
	int pageSize = 10;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null) {
		pageNum = "1";
	}
	
	int currentPage = Integer.parseInt(pageNum);
	int startRow = (currentPage - 1) * pageSize + 1;
	int endRow = currentPage * pageSize;
	int number = 0;
	
	// new BoardDao();
	BoardDao dao = BoardDao.getInstance();
	
	int count = dao.getArticleCount();
	
	ArrayList<BoardBean> lists = dao.getArticles(startRow,endRow);
	
	number = count-(currentPage - 1) * pageSize;
%>

	<%-- <jsp:include page = "color.jsp"/> --%>
	
	<%@ include file="color.jsp" %>
	
	<link rel="stylesheet" type="text/css" href="style.css"/>
	
	<body bgcolor="<%=bodyback_c%>">
		<b>글목록(전체 글 : <%=count %>)</b>
		<table width="700">
			<tr>
				<td align="right" bgcolor="<%=value_c %>">
					<a href="writeForm.jsp">글쓰기</a>
				</td>
			</tr>
		</table>
		
		<table width="700" align="center">
			<tr align="center" bgcolor="<%=value_c %>">
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회</td>
				<td>IP</td>
			</tr>
			
			<%
				for(int i=0; i<lists.size(); i++) {
					BoardBean bean = lists.get(i);
			%>
				<tr>
					<td><%=number-- %></td>
					<td>
						<%
							int wid=0;
						if(bean.getRe_level() > 0) {
							wid = 20 * bean.getRe_level();
						%>
							<img src="images/level.gif" width="<%=wid %>" height="16">
							<img src="images/re.gif">
						<%
							}
						%>
						<a href="content.jsp?num=<%=bean.getNum() %>&pageNum=<%=currentPage %>"><%=bean.getSubject() %></a>
						
						<%
							if(bean.getReadcount() >= 10) {
						%>
							<img src="images/hot.gif">
						<%
							}
						%>
					</td>
					<td><%=bean.getWriter() %></td>
					<td><%=sdf.format(bean.getReg_date()) %></td> 
					<td><%=bean.getReadcount() %></td>
					<td><%=bean.getIp() %></td>
				</tr>
			<%
				}
			%>
		</table>
	<%
		if(count > 0) {
			int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
			
			int pageBlock = 10;
			
			int startPage = ((currentPage-1) / pageBlock * pageBlock) + 1;
			int endPage = startPage + pageBlock - 1;
			
			if(endPage > pageCount)
				endPage = pageCount;
			
			if(startPage > 10) {
	%>
		<a href="list.jsp?pageNum=<%=startPage - 10 %>">[이전]</a>
	<%
			}
			
			for(int i=startPage; i<=endPage; i++) {
	%>
		<a href="list.jsp?pageNum+<%=i %>">[<%=i %>]</a>
	<%
			}
			
			if(endPage < pageCount) {
	%>
		<a href="list.jsp?pageNum=<%=startPage + 10 %>">[다음]</a>
	<%
			}
		}
	%>
	</body>