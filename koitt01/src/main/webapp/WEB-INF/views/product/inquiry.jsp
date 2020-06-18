<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> JARDIN SHOP </title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="JARDIN" />
<meta name="keywords" content="JARDIN" />
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scaleable=no" />
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet" type="text/css" href="css/content.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript">
$(function() {

});
</script>
</head>
<body>
<div id="layerWrap">

<div class="inputWrap">
			<form action="product_inquiry" method="post" name="input_form">

	<div class="inputBody">
		<div class="title">질문과 답변</div>
		<p class="close"><a onclick="parent.$.fancybox.close();" href="javascript:;"><img src="images/btn/btn_input_close.gif" alt="닫기" /></a></p>
		<div class="checkDivMt">
			<table summary="문의사항을 비밀번호, 제목, 내용 순으로 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
				<caption>질문과 답변</caption>
				<colgroup>
				<col width="19%" class="tw30" />
				<col width="*" />
				</colgroup>
				<tbody>
					<tr>
						<th scope="row"><span>제목</span></th>
						<td>
					
					<input type="hidden" name="product_no" value="${product_no }">
							<input type="text" class="wlong" name="title" />
						</td>
					</tr>
					<tr>
						<th scope="row"><span>내용</span></th>
						<td>
							<textarea class="tta" name="content"></textarea>
						</td>
					</tr>								
				</tbody>
			</table>
		</div>
			
		<!-- Btn Area -->
		<div class="btnArea">
			<div class="bCenter">
				<ul>								
					<li><input type="submit" class="sbtnMini" value="확인"></li>
					<li><a onclick="parent.$.fancybox.close();" href="javascript:;" class="nbtnbig">취소</a></li>
				</ul>
			</div>
		</div>
		
		<!-- //Btn Area -->

	</div>
</form>
</div>


</div>
</body>
</html>