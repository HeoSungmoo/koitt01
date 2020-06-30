<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<c:forEach var="list" items="${list }">
<table>
	<tr>
		<th>글번호</th>
		<th>글제목</th>
		<th>글내용</th>
		<th>글쓴이</th>
		<th>파일업로드</th>
	</tr>


	<tr>
		<td>${list.b_num }</td>
		<td>${list.b_title }</td>
		<td>${list.b_content }</td>
		<td>${list.b_user }</td>
		<td>${list.b_file }</td>
	</tr>




</table>


</c:forEach>



</body>
</html>