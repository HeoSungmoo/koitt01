<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
	
	function idCheck(){
		// 부모창에 접근하려면 opener를 사용 해야함.
		var id  = document.getElementById("userId").value = opener.document.userInfo.id.value;
		
		// 시작은 영문으로 4~16자리 입력 영문 숫자 특수기호(_)만 사용 가능
		var idChk = /^[a-zA-Z][a-zA-Z0-9_]{3,15}$/g;

		if(!id){
			alert('아이디가 입력되지 않았습니다.');
			return false;
		}
		
		if(!(idChk.test(id))){
			alert('영문으로 시작하여 4~16자리 영문,숫자,특수기호만 사용 가능합니다.');
			return false;
		} else {
			alert('사용 가능한 아이디 입니다.');
		}
		
		
	}
	
	function pValue(){
		// 아이디 입력 하고 중복체크 누르면 아이디가 넘어옴
		document.getElementById("userId").value = opener.document.userInfo.id.value;
	}
	
	// 사용하기 클릭시 부모창으로 값 전달
	function sendCheckValue(){
		
		opener.document.userInfo.idDuplication.value = "idCheck";
		
		opener.document.userInfo.id.value  = document.getElementById("userId").value;
		
		window.close();
			
		}
	
	
	
</script>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body onload = "pValue()">
		<div>
			<b><font size = "4" color = "gray">아이디 중복체크</font></b>
			<hr size = "1" width = "460">
			<form>
				<input type = "text" name = "idInput" id = "userId" readonly>
				<input type = "button" value = "중복확인" onclick = "idCheck()">
			</form>
			
			<br>
			<input type = "button" value = "취소" onclick = "window.close()">
			<input type = "button" value = "사용하기" onclick = "sendCheckValue()">
		
		</div>	
	</body>
</html>