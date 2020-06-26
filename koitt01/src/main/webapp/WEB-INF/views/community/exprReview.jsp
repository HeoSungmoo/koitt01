<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<title> JARDIN SHOP </title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description" content="JARDIN SHOP" />
<meta name="keywords" content="JARDIN SHOP" />
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scaleable=no" />
<link rel="stylesheet" type="text/css" href="css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="css/content.css?v=Y" />
<script type="text/javascript" src="js/jquery.min.js"></script>
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
<div id="ieUser" style="display:none">
	<div class="iewrap">	
		<p class="img"><img src="images/ico/ico_alert.gif" alt="알림" /></p>
		<p class="txt">IE버전이 낮아 홈페이지 이용에 불편함이 있으므로 <strong>IE9이상이나 다른 브라우저</strong>를 이용해 주세요. </p>
		<ul>
			<li><a href="http://windows.microsoft.com/ko-kr/internet-explorer/download-ie" target="_blank"><img src="images/ico/ico_ie.gif" alt="IE 최신브라우저 다운" ></a></li>
			<li><a href="https://www.google.com/intl/ko/chrome/browser" target="_blank"><img src="images/ico/ico_chrome.gif" alt="IE 최신브라우저 다운" ></a></li>
			<li><a href="http://www.mozilla.org/ko/firefox/new" target="_blank"><img src="images/ico/ico_mozila.gif" alt="MOZILA 최신브라우저 다운" ></a></li>
			<li><a href="http://www.apple.com/safari" target="_blank"><img src="images/ico/ico_safari.gif" alt="SAFARI 최신브라우저 다운" ></a></li>
			<li><a href="http://www.opera.com/ko/o/ie-simple" target="_blank"><img src="images/ico/ico_opera.gif" alt="OPERA 최신브라우저 다운" ></a></li>		
		</ul>
		<p class="btn" onclick="msiehide();"><img src="images/ico/ico_close.gif" alt="닫기" /></p>
	</div>
</div>
<!--//익스레이어팝업-->
<!--IE 6,7,8 사용자에게 브라우저 업데이터 설명 Div 관련 스크립트-->
 <script type="text/javascript">

     var settimediv = 200000; //지속시간(1000= 1초)
     var msietimer;

     $(document).ready(function () {
         msiecheck();
     });

     var msiecheck = function () {
         var browser = navigator.userAgent.toLowerCase();
         if (browser.indexOf('msie 6') != -1 ||
                browser.indexOf('msie 7') != -1 ||
				 browser.indexOf('msie 8') != -1) {
             msieshow();			 
         }
         else {
             msiehide();
         }
     }

     var msieshow = function () {
        $("#ieUser").show();
        msietimer = setTimeout("msiehide()", settimediv);
     }

     var msiehide = function () {
		$("#ieUser").hide();
        clearTimeout(msietimer);
     }
</script>

<div id="allwrap">
<div id="wrap">

		<header>
      <%@ include file="../include/header.jsp"  %>
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
				<div id="title2">COMMUNITY<span>커뮤니티</span></div>
				<ul>	
					<li><a href="expr" id="leftNavi1">체험단</a></li>
					<li><a href="epilogue" id="leftNavi2">사용 후기</a></li>
					<li class="last"><a href="#" id="leftNavi3">ENJOY COFFEE</a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(1,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="mypage">
					<h2><strong>체험단</strong><span>쟈뎅샵에서 진행되는 무료체험 기회를 놓치지 마세요.</span></h2>					
					<div class="viewDivMt">
						<div class="viewHead">
							<div class="subject">
								<ul>
									<li>${exprView.title }
									<c:choose>
										<c:when test="${nowDate<endDate}">
										 <span class="ingbtn">진행중</span>
										</c:when>
										<c:when test="${now>endDate}">
										<span class="ingbtn">종료</span>
										</c:when>
										</c:choose>
								
								</ul>
							</div>
							<div class="day">
								<p class="txt">리뷰 등록기간<span><fmt:formatDate pattern="yyyy-MM-dd" value="${exprView.review_start_date}"/> ~ <fmt:formatDate pattern="yyyy-MM-dd" value="${exprView.review_end_date}"/></span></p>
								<p id="star${k=k+1}" class="appraisal">
									</p>
<script>
    var innerHtml = "체험단 평점&nbsp;";
    for (var i = 0; i < 5; i++) {
        if (i < ${exprView.grade}) {
            innerHtml += '<img src="images/ico/ico_star.gif"/>'
        } else {
            innerHtml += '<img src="images/ico/ico_star_off.gif"/>';
        }
    }
    var star = document.getElementById('star${k}');
    star.innerHTML = innerHtml;
</script>
								
							</div>
							<div class="data">
								<ul>
									<li>모집 인원<span>${exprView.personnel}</span></li>
									<li class="dep">신청기간<span><fmt:formatDate pattern="yyyy-MM-dd" value="${exprView.apply_start_date}"/> ~ <fmt:formatDate pattern="yyyy-MM-dd" value="${exprView.apply_end_date}"/></span></li>
									<li class="dep">체험단 발표<span><fmt:formatDate pattern="yyyy-MM-dd" value="${exprView.announcement_date}"/></span></li>
								</ul>
							</div>
						</div>

						<div class="viewContents">
							${exprView.content}
						</div>
					</div>			


					<div class="productTab normaltab">
						<ul>
							<li><a href="exprView">체험단 신청</a></li>
							<li class="last"><a href="exprReview" class="on">체험 리뷰</a></li>
						</ul>						
					</div>


					<div class="checkDivTab">
						<table summary="분류, 별점, 제목, 상세 내용 순으로 상품평을 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>상품평 작성</caption>
							<colgroup>
							<col width="19%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>작은이미지</span></th>
									<td>
										<input type="file" class="fileType" />
									</td>
								</tr>
								<tr>
									<th scope="row"><span>평가</span></th>
									<td>
										<ul class="pta">
											<li>
												<input type="radio" name="appraisal" id="starFive" checked="checked"/>
												<label for="starFive" class="star">
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
												</label>
											</li>

											<li>
												<input type="radio" name="appraisal" id="starFour" />
												<label for="starFour" class="star">
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
												</label>
											</li>

											<li>
												<input type="radio" name="appraisal" id="starThree" />
												<label for="starThree" class="star">
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
												</label>
											</li>

											<li>
												<input type="radio" name="appraisal" id="startwo" />
												<label for="startwo" class="star">
													<img src="images/ico/ico_star.gif" alt="별점" />
													<img src="images/ico/ico_star.gif" alt="별점" />
												</label>
											</li>

											<li>
												<input type="radio" name="appraisal" id="starOne" />
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
										<input type="text" class="wlong" />
									</td>
								</tr>
								<tr>
									<th scope="row"><span>내용</span></th>
									<td>
										<textarea class="tta"></textarea>
									</td>
								</tr>								
							</tbody>
						</table>
					</div>

					<!-- Btn Area -->
					<div class="btnArea">
						<div class="bCenter">
							<ul>
								<li><a href="preUserReview" class="sbtnMini">리뷰작성</a></li>
								<li><a href="#" class="nbtnbig">취소</a></li>								
							</ul>
						</div>
					</div>
					<!-- //Btn Area -->


					<!-- 작성된 체험리뷰 -->
					<div class="imgListType exprbd">
						<ul>

							<!-- List / Contnent -->
							<li>
								<div class="img"><img src="images/img/sample_expr.jpg" width="155" height="160" alt="" /></div>
								<div class="txt">
									<div class="subject expr">
										<a href="javascript:;" class="reviewBtn">카페모리 홍차라떼, 드립커피백 체험단 리뷰 올립니다!!</a>
									</div>
									<div class="conf">
										소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.....
									</div>
									<div class="data">
										<p>작성자 <span>dlsif***</span></p>
										<p>댓글 <span>2</span></p>
										<p>조회수 <span>325</span></p>
										<p>등록일 <span>2014-03-24</span></p>
										<p>평점 
											<span class="ty">
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
											</span>
										</p>
									</div>
								</div>
								<div class="confhide">
									<div class="reviewContent">
										<div class="viewContents2">
											카페모리 홍차라떼, 드립커피백 후기<br/>
											처음 체험단에 신청해봤는데 당첨돼서 너무 좋았습니다.<br/>
											너무 맛있었어요. 향도 너무 좋고!!<br/>
											쟈뎅 드립커피백 추천드립니다!!
										</div>

										<!-- 답변 -->
										<div class="answer">
											<div class="inbox">
												<div class="aname">
													<p>담당자 <span>[2014-03-04&nbsp;&nbsp;15:01:59]</span></p>
												</div>

												<div class="atxt">
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
												</div>
											</div>
										</div>
										<!-- //답변 -->
									</div>
								</div>
							</li>
							<!-- //List / Contnent-->


							<li>
								<div class="img"><img src="images/img/sample_expr.jpg" width="155" height="160" alt="" /></div>
								<div class="txt">
									<div class="subject expr">
										<a href="javascript:;" class="reviewBtn">카페모리 홍차라떼, 드립커피백 체험단 리뷰 올립니다!!</a>
									</div>
									<div class="conf">
										소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.....
									</div>
									<div class="data">
										<p>작성자 <span>dlsif***</span></p>
										<p>댓글 <span>2</span></p>
										<p>조회수 <span>325</span></p>
										<p>등록일 <span>2014-03-24</span></p>
										<p>평점 
											<span class="ty">
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
											</span>
										</p>
									</div>
								</div>
								<div class="confhide">
									<div class="reviewContent">
										<div class="viewContents2">
											카페모리 홍차라떼, 드립커피백 후기<br/>
											처음 체험단에 신청해봤는데 당첨돼서 너무 좋았습니다.<br/>
											너무 맛있었어요. 향도 너무 좋고!!<br/>
											쟈뎅 드립커페백 추천드립니다!!
										</div>

										<!-- 답변 -->
										<div class="answer">
											<div class="inbox">
												<div class="aname">
													<p>담당자 <span>[2014-03-04&nbsp;&nbsp;15:01:59]</span></p>
												</div>

												<div class="atxt">
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
												</div>
											</div>
										</div>
										<!-- //답변 -->
									</div>
								</div>
							</li>

							<li>
								<div class="img"><img src="images/img/sample_expr.jpg" width="155" height="160" alt="" /></div>
								<div class="txt">
									<div class="subject expr">
										<a href="javascript:;" class="reviewBtn">카페모리 홍차라떼, 드립커피백 체험단 리뷰 올립니다!!</a>
									</div>
									<div class="conf">
										소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.....
									</div>
									<div class="data">
										<p>작성자 <span>dlsif***</span></p>
										<p>댓글 <span>2</span></p>
										<p>조회수 <span>325</span></p>
										<p>등록일 <span>2014-03-24</span></p>
										<p>평점 
											<span class="ty">
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
											</span>
										</p>
									</div>
								</div>
								<div class="confhide">
									<div class="reviewContent">
										<div class="viewContents2">
											카페모리 홍차라떼, 드립커피백 후기<br/>
											처음 체험단에 신청해봤는데 당첨돼서 너무 좋았습니다.<br/>
											너무 맛있었어요. 향도 너무 좋고!!<br/>
											쟈뎅 드립커페백 추천드립니다!!
										</div>

										<!-- 답변 -->
										<div class="answer">
											<div class="inbox">
												<div class="aname">
													<p>담당자 <span>[2014-03-04&nbsp;&nbsp;15:01:59]</span></p>
												</div>

												<div class="atxt">
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
												</div>
											</div>
										</div>
										<!-- //답변 -->
									</div>
								</div>
							</li>

							<li>
								<div class="img"><img src="images/img/sample_expr.jpg" width="155" height="160" alt="" /></div>
								<div class="txt">
									<div class="subject expr">
										<a href="javascript:;" class="reviewBtn">카페모리 홍차라떼, 드립커피백 체험단 리뷰 올립니다!!</a>
									</div>
									<div class="conf">
										소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.소문만큼 맛있었습니다.....
									</div>
									<div class="data">
										<p>작성자 <span>dlsif***</span></p>
										<p>댓글 <span>2</span></p>
										<p>조회수 <span>325</span></p>
										<p>등록일 <span>2014-03-24</span></p>
										<p>평점 
											<span class="ty">
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
											</span>
										</p>
									</div>
								</div>
								<div class="confhide">
									<div class="reviewContent">
										<div class="viewContents2">
											카페모리 홍차라떼, 드립커피백 후기<br/>
											처음 체험단에 신청해봤는데 당첨돼서 너무 좋았습니다.<br/>
											너무 맛있었어요. 향도 너무 좋고!!<br/>
											쟈뎅 드립커페백 추천드립니다!!
										</div>

										<!-- 답변 -->
										<div class="answer">
											<div class="inbox">
												<div class="aname">
													<p>담당자 <span>[2014-03-04&nbsp;&nbsp;15:01:59]</span></p>
												</div>

												<div class="atxt">
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
													쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
												</div>
											</div>
										</div>
										<!-- //답변 -->
									</div>
								</div>
							</li>

						</ul>
					</div>


					<div class="btnAreaList">

						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="#" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a><a href="#" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
						<strong>1</strong>
						<a href="#">2</a>
						<a href="#">3</a>
						<a href="#">4</a>
						<a href="#">5</a>
						<a href="#" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a><a href="#" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>
					<!-- //작성된 체험리뷰 -->

					
				</div>
			</div>
			<!-- //contents -->


		</div>
	</div>
	<!-- //container -->




	<footer>
      <%@ include file="../include/footer.jsp"  %>
   </footer>


</div>
</div>
</body>
</html>