<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<jsp:useBean id="now" class="java.util.Date" />
									
									 <!-- 현재날짜 --> 
									<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" var="nowDate" /> 
									   
									<!-- 신청 시작날짜 !--> 
									<fmt:formatDate value="${exprView.apply_start_date}" pattern="yyyy-MM-dd" var="startDate" /> 
										
									<!-- 신청 마감날짜 !-->
									<fmt:formatDate value="${exprView.apply_end_date}" pattern="yyyy-MM-dd" var="endDate" />


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


					<!-- Tab -->
					<div class="productTab normaltab">
						<ul>
							<li><a href="exprView" class="on">체험단 신청</a></li>
							<li class="last"><a href="exprReview?preuser_no">체험 리뷰</a></li>
						</ul>						
					</div>
					<!-- //Tab -->

<form action="preUserApply?preuser_no=${expr.preuser_no }" name="preUserApply" method="post">
					<div class="checkDivTab">
						<table summary="분류, 별점, 제목, 상세 내용 순으로 상품평을 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>상품평 작성</caption>
							<colgroup>
							<col width="19%" class="tw30" />
							<col width="*" />
							</colgroup>
							<
							<tbody>
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
								<li><a href="preUserApply" class="sbtnMini"><button type="submit">신청하기</button></a></li>
								<li><a href="#" class="nbtnbig">취소</a></li>	
							</ul>
						</div>
					</div>
					</form>
					<!-- //Btn Area -->

					
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