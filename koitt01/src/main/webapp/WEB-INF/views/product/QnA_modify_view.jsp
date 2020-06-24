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
		
	<div class="inputBody">
		<div class="title">질문과 답변 수정</div>
		<p class="close"><a onclick="parent.$.fancybox.close();" href="javascript:;"><img src="images/btn/btn_input_close.gif" alt="닫기" /></a></p>
		   
	<form action="qna_modify?product_no=${product_no}&qna_no=${qna_no}" method="post" name="review_form">
		<div class="checkDivMt">
			<table summary="분류, 구매여부, 평가, 제목, 상세 내용 순으로 포토 리뷰를 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
				<caption>구매 후기 작성</caption>
				<colgroup>
				<col width="19%" class="tw30" />
				<col width="*" />
				</colgroup>
				<tbody>
			
									
	
					<tr>
						
						<th scope="row"><span>제목</span></th>
						<td>
							<input type="hidden" name="product_no" value="${product_no }">
 							<input type="hidden" name="qna_no" value="${qna_no }">
							<input type="text" class="wlong" name="title" value="${qna_modify_view.title }">
							
						</td>
					</tr>
					<tr>
						<th scope="row"><span>내용</span></th>
						<td>
							<textarea class="tta" name="content">${qna_modify_view.content }</textarea>
							
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
		</form>
		</div>
		<!-- //Btn Area -->

	</div>

</div>


</div>
</body>
</html>