<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    content.jsp(num) => deleteForm.jsp <br>
    
    <style type="text/css">
    	body{
    		text-align : center;
    	}
    	
    	table{
    		margin : 0 auto;
    	}
    </style>
    
    <link rel="stylesheet" type="text/css" href="style.css"/>
    
    <%@ include file="color.jsp" %>
    
    <script type="text/javascript">
    	
    	function checkDelete() {
    		if(document.delForm.passwd.value == "") {
    			alert("비밀번호를 입력하세요");
    			delForm.passwd.focus();
    			return false;
    		}
    	}
    </script>
    
    <%
    	int num = Integer.parseInt(request.getParameter("num"));
    	int pageNum = Integer.parseInt(request.getParameter("pageNum"));
    %>
    
    <body bgcolor = "<%=bodyback_c%>">
    	<b>글삭제</b>
    	
    	<form name="delForm" action="deleteProc.jsp?pageNum=<%=pageNum %>" method="post" onSubmit="return checkDelte()">
    		
    		<table align="center" width="360">
    			<tr height="30">
    				<td align="center" bgcolor="<%=value_c %>">
    					<b>비밀번호를 입력해 주세요.</b>
    				</td>
    			</tr>
    			
    			<tr height="30">
    				<td align="center">
    					비밀번호 :
    					<input type="password" name="passwd" size="8" maxlength="12">
    					<input type="hidden" name="num" value="<%=num %>">
     				</td>
    			</tr>
    			
    			<tr height="30">
    				<td align="center" bgcolor="<%=value_c %>">
    					<input type="submit" value="글삭제">
    					<input type="button" value="글목록" onClick="location.href='list.jsp?pageNum=<%=pageNum %>'">
    				</td>
    			</tr>
    		</table>
    	</form>
    </body>