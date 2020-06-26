<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>JARDIN SHOP</title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="JARDIN SHOP" />
<meta name="keywords" content="JARDIN SHOP" />
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scaleable=no" />
<link rel="stylesheet" type="text/css" href="css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="css/content.css?v=Y" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="js/top_navi.js"></script>
<script type="text/javascript" src="js/left_navi.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/idangerous.swiper-2.1.min.js"></script>
<script type="text/javascript" src="js/jquery.anchor.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<script type="text/javascript" src="js/respond.min.js"></script>
<![endif]-->
<script type="text/javascript">
	$(document).ready(function() {

	});
</script>
</head>
<body>



	<!--익스레이어팝업-->
	<div id="ieUser" style="display: none">
		<div class="iewrap">
			<p class="img">
				<img src="images/ico/ico_alert.gif" alt="알림" />
			</p>
			<p class="txt">
				IE버전이 낮아 홈페이지 이용에 불편함이 있으므로 <strong>IE9이상이나 다른 브라우저</strong>를 이용해
				주세요.
			</p>
			<ul>
				<li><a
					href="http://windows.microsoft.com/ko-kr/internet-explorer/download-ie"
					target="_blank"><img src="images/ico/ico_ie.gif"
						alt="IE 최신브라우저 다운"></a></li>
				<li><a href="https://www.google.com/intl/ko/chrome/browser"
					target="_blank"><img src="images/ico/ico_chrome.gif"
						alt="IE 최신브라우저 다운"></a></li>
				<li><a href="http://www.mozilla.org/ko/firefox/new"
					target="_blank"><img src="images/ico/ico_mozila.gif"
						alt="MOZILA 최신브라우저 다운"></a></li>
				<li><a href="http://www.apple.com/safari" target="_blank"><img
						src="images/ico/ico_safari.gif" alt="SAFARI 최신브라우저 다운"></a></li>
				<li><a href="http://www.opera.com/ko/o/ie-simple"
					target="_blank"><img src="images/ico/ico_opera.gif"
						alt="OPERA 최신브라우저 다운"></a></li>
			</ul>
			<p class="btn" onclick="msiehide();">
				<img src="images/ico/ico_close.gif" alt="닫기" />
			</p>
		</div>
	</div>
	<!--//익스레이어팝업-->
	<!--IE 6,7,8 사용자에게 브라우저 업데이터 설명 Div 관련 스크립트-->
	<script type="text/javascript">
		var settimediv = 200000; //지속시간(1000= 1초)
		var msietimer;

		$(document).ready(function() {
			msiecheck();
		});

		var msiecheck = function() {
			var browser = navigator.userAgent.toLowerCase();
			if (browser.indexOf('msie 6') != -1
					|| browser.indexOf('msie 7') != -1
					|| browser.indexOf('msie 8') != -1) {
				msieshow();
			} else {
				msiehide();
			}
		}

		var msieshow = function() {
			$("#ieUser").show();
			msietimer = setTimeout("msiehide()", settimediv);
		}

		var msiehide = function() {
			$("#ieUser").hide();
			clearTimeout(msietimer);
		}
	</script>

	<div id="allwrap">
		<div id="wrap">

			<header>
				<%@ include file="../include/header.jsp"%>
			</header>

			<!-- container -->
			<div id="container">

				<div id="location">
					<ol>
						<li><a href="#">HOME</a></li>
						<li><a href="#">COMMUNITY</a></li>
						<li class="last">사용 후기</li>
					</ol>
				</div>

				<div id="outbox">
					<div id="left">
						<div id="title2">
							COMMUNITY<span>커뮤니티</span>
						</div>
						<ul>
							<li><a href="expr" id="leftNavi1">체험단</a></li>
							<li><a href="epilogue" id="leftNavi2">사용 후기</a></li>
							<li class="last"><a href="enjoy" id="leftNavi3">ENJOY
									COFFEE</a></li>
						</ul>
					</div>
					<script type="text/javascript">
						initSubmenu(2, 0);
					</script>

					<form action="epilogueWrite1" method="post"
						enctype="multipart/form-data">
						<!-- contents -->
						<div id="contents">
							<div id="mypage">
								<h2>
									<strong>사용 후기</strong><span>쟈뎅 제품을 구매하신 회원님들의 소중한 후기입니다.</span>
								</h2>

								<div class="productTab normaltab">
									<ul>
										<li><a href="epilogueInsert2">포토 구매후기</a></li>
										<li class="last"><a href="epilogueInsert" class="on">상품평</a></li>
									</ul>
								</div>

								<div class="checkDivTab">
									<table
										summary="분류, 구매여부, 작은이미지, 평가, 제목, 상세 내용 순으로 포토 구매후기를 작성 하실수 있습니다."
										class="checkTable" border="1" cellspacing="0">
										<caption>포토 구매후기 작성</caption>
										<colgroup>
											<col width="19%" class="tw30" />
											<col width="*" />
										</colgroup>
										<tbody>
											<tr>
												<th scope="row"><span>상품명</span></th>
												<td>
													<ul class="pta">
														<li class="pt5">
															<p>
																<select name="">
																	<c:forEach var="productCategory"
																		items="${productCategory}">
																		<option value="product_no">${productCategory.title}</option>
																	</c:forEach>
																</select>
															</p> <input type="hidden" name="review_no"
															value="${epilogueUpdate.review_no} ">
														</li>
													</ul>
												</td>
											</tr>
											<tr>
												<th scope="row"><span>평점</span></th>
												<td>
													<ul class="pta">
														<li><input type="radio" name="grade" id="starFive"
															value="5" checked="checked" /> <label for="starFive"
															class="star"> <img src="images/ico/ico_star.gif"
																alt="별점" /> <img src="images/ico/ico_star.gif" alt="별점" />
																<img src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" />
														</label></li>

														<li><input type="radio" name="grade" value="4"
															id="starFour" /> <label for="starFour" class="star">
																<img src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" />
														</label></li>

														<li><input type="radio" name="grade" value="3"
															id="starThree" /> <label for="starThree" class="star">
																<img src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" />
														</label></li>

														<li><input type="radio" name="grade" value="2"
															id="startwo" /> <label for="startwo" class="star">
																<img src="images/ico/ico_star.gif" alt="별점" /> <img
																src="images/ico/ico_star.gif" alt="별점" />
														</label></li>

														<li><input type="radio" name="grade" value="1"
															id="starOne" /> <label for="starOne" class="star">
																<img src="images/ico/ico_star.gif" alt="별점" />
														</label></li>
													</ul>
												</td>
											</tr>
											<tr>
												<th scope="row"><span>제목</span></th>
												<td><input type="text" name="title" class="wlong"
													value="${epilogueUpdate.title}" /></td>
											</tr>
											<tr>
												<th scope="row"><span>내용</span></th>
												<td><textarea name="content" class="tta">${epilogueUpdate.content}</textarea>
												</td>
											</tr>
										</tbody>
									</table>
								</div>

								<!-- Btn Area -->
								<div class="btnArea">
									<div class="bCenter">
										<ul>
											<li><a href="#" onclick='history.back(-1);return false;'
												class="nbtnbig">취소</a></li>
											<li><button class="sbtnMini">확인</button></li>
										</ul>
									</div>
								</div>
								<!-- //Btn Area -->

							</div>
						</div>
						<!-- //contents -->
					</form>

				</div>
			</div>
			<!-- //container -->



			<footer>
				<%@ include file="../include/footer.jsp"%>
			</footer>



		</div>
	</div>
</body>
</html>