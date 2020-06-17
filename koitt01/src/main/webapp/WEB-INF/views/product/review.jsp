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
		<div class="title">구매 후기 작성하기</div>
		<p class="close"><a onclick="parent.$.fancybox.close();" href="javascript:;"><img src="images/btn/btn_input_close.gif" alt="닫기" /></a></p>
		   
	<form action="review?product_no=${product_no}" method="post" name="review_form">
		<div class="checkDivMt">
			<table summary="분류, 구매여부, 평가, 제목, 상세 내용 순으로 포토 리뷰를 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
				<caption>구매 후기 작성</caption>
				<colgroup>
				<col width="19%" class="tw30" />
				<col width="*" />
				</colgroup>
				<tbody>
			
					<tr>
						<th scope="row"><span>분류</span></th>
						<td>
							<ul class="pta">
								<li>
									<select>
										<option value="원두">원두</option>
										<option value="원두커피백">원두커피백</option>
										<option value="인스턴트">인스턴트</option>
										<option value="음료">음료</option>
										<option value="커피용품">커피용품</option>
									</select>
								</li>
						
							</ul>
						</td>
					</tr>					
					<tr>
						<th scope="row"><span>구매여부</span></th>
						<td>
							<select>
								<option value="">구매했어요.</option>
								<option value="">먹어봤어요.</option>
							</select>
						</td>
					</tr>
					<tr>
						<th scope="row"><span>평가</span></th>
						<td>
							<ul class="pta">
								<li>
 									<input type="hidden" name="product_no" value="${product_no }">
 									
									<input type="radio" name="grade" value='5' id="starFive" checked="checked"/>
									<label for="starFive" class="star">
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
									</label>
								</li>

								<li>
									<input type="radio" name="grade" value='4' id="starFour" />
									<label for="starFour" class="star">
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
									</label>
								</li>

								<li>
									<input type="radio" name="grade" value='3' id="starThree" />
									<label for="starThree" class="star">
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
									</label>
								</li>

								<li>
									<input type="radio" name="grade" value='2' id="startwo" />
									<label for="startwo" class="star">
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
									</label>
								</li>

								<li>
									<input type="radio" name="grade" value='1' id="starOne" />
									<label for="starOne" class="star">
										<img src="images/ico/ico_star.gif" alt="별점" />
									</label>
								</li>
							</ul>
						</td>
					</tr>
					<tr>
						<th scope="row"><span>제목</span></th>
						<td>
						
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
		</form>
		</div>
		<!-- //Btn Area -->

	</div>

</div>


</div>
</body>
</html>