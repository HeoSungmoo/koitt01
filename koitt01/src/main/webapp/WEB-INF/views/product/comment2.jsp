<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<style>
		table{ width:1000px;}
		td { height:30px;}
		table tr td{border-coolapse:collapse; border:1px solid black;}
	
	</style>
	<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	function ex_checkAjax(){
		alert("성공");
		
		$.ajax({
			type:"post",
			url:"./ex_checkAjax",
			data:{cId:ex_checkForm.cId.value},
			success: function(data){
				alert("data 가져오기 성공");
				alert(data.cContnet);
				alert(data.result);
				$("#cContent").text(data.cContent);
				$("#result").text(data.result);
				
			},
			error:function(request,status,error){
				alert(error);
			}
			
		});
		
		
	}
	
	
	</script>
	

	</head>
	<body>
	
	<form action="" name="ex_checkForm">
		<table>
			<tr>
				<td>비밀번호입력/번호입력</td>
				<td>
				<td><input type="text" name="cId">
				<a href="#" onclick="ex_checkAjax()">확인</a>
				</td>
			</tr>
			<tr>
				<td>내용</td>
				<td id="cContent"></td>
			</tr>
			<tr>
				<td>결과</td>
				<td id="result"></td>
			</tr>
		
		
		</table>
	
	
	
	</form>
	
	
	
	
	
	</body>
</html>