<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<title> JARDIN SHOP </title>
<meta charset="UTF-8" />
<script type="text/javascript" src="src="https://ajax.googleapis.com/ajax/libs></script>
<script type="text/javascript">

$(function(){
	json_test();
	
});
	function json_test(){
	$.ajax({
	type:'POST' ,        // get/post
	url : './dataList', //  controller json 데이터 링크주소
	data : { }, // 페이지로 매개변수 값을 넘겨줄때 사용
	contentType : "application/json;charset=utf-8", // 한글처리
	success : function(data){     // json데이터 return 데이터
		alert("데이터 성공적으로 가지고 왔습니다.");
	$('#dataTable').append(data.array[0],courseAreaName);
		
	},
	error:function(){
		alert("데이터 가지고 오기 실패");
	}
	
	});
	
}
	
	

</script>


</head>
<body>
<div>
	<table id="dataTable">
	<tr><td>정보</td><td>정보값</td></tr>
	<tr><td>cour</td><td>정보값</td></tr>
	
	
	</table>

</div>



</body>
</html>