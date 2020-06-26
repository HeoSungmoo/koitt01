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
		<div class="title">댓글 수정</div>
		<p class="close"><a onclick="parent.$.fancybox.close();" href="javascript:;"><img src="images/btn/btn_input_close.gif" alt="닫기" /></a></p>

				<form action="eventCommentModify?event_no=${event_no}" method="post" name="ModifyForm"> 
		<div class="checkDivMt">
			<table summary="문의사항을 비밀번호, 제목, 내용 순으로 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
				<caption>댓글 수정</caption>
				<colgroup>
				<col width="19%" class="tw30" />
				<col width="*" />
				</colgroup>
				<tbody>
					
					
					<tr>
						<th scope="row"><span>내용</span></th>
						<td>
							<input type="hidden" name="comment_no" value="${eventCommentModifyView.comment_no }">
							<textarea class="tta" name="comment_content">${eventCommentModifyView.comment_content }</textarea>
						</td>
					</tr>	
			</table>
				</tbody>
		</div>
			
		<!-- Btn Area -->
		<div class="btnArea">
			<div class="bCenter">
				<ul>			
				<li><input type="submit" value="확인" class="sbtnMini"></li>			
				<li><a onclick="parent.$.fancybox.close();" href="javascript:;" class="nbtnbig">취소</a></li>
				</ul>
			</div>
		</div>
				</form>							
		<!-- //Btn Area -->

	</div>

</div>


</div>
</body>
</html>