<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				<li><a href="#">CUSTOMER</a></li>
				<li class="last">FAQ</li>
			</ol>
		</div>
		
		<div id="outbox">		
			<div id="left">
				<div id="title2">CUSTOMER<span>고객센터</span></div>
				<ul>	
					<li><a href="notice" id="leftNavi1">NOTICE</a></li>
					<li><a href="bInquiryView" id="leftNavi2">1:1문의</a></li>
					<li><a href="faq" id="leftNavi3">FAQ</span></a></li>
					<li class="last"><a href="guide" id="leftNavi4">이용안내</a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(3,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="customer">
					<h2><strong>FAQ</strong><span>회원님들께서 자주 묻는 질문들을 모아 놓았습니다.</span></h2>
					
					<div class="faqTab">
						<ul>
							<li><a href="#" class="on">전체</a></li>
							<li class="dep"><a href="#">회원가입</a></li>
							<li><a href="#">상품</a></li>
							<li class="last"><a href="#">주문</a></li>
						</ul>						
					</div>	
					
					<!-- FAQ -->
					<div class="faqList">
						<ul>
							<!-- list -->
							<c:forEach var="faq" items="${faq }">
							<li>
								<a href="javascript:;" class="faqbtn">
									<div class="question">
										<div class="blet">Q</div>
										<div class="category">${faq.category }</div>
										<div class="title">주문 상품의 수량을 변경하고 싶어요.</div>
									</div>
								</a>

								<div class="faqanswer">
									<div class="faqbox">
										<div class="blet">A</div>
										<div class="text">
											<strong><u>소비자상담실(02-546-3881)</u></strong>로 연락 주시면 가능 여부에 관하여 답변드리고 있습니다. 연락 주시면 가능 여부에 관하여 답변드리고 있습니다. 연락 주시면 가능 여부에 관하여 답변드리고 있습니다. 연락 주시면 가능 여부에 관하여 답변드리고 있습니다. 연락 주시면 가능 여부에 관하여 답변드리고 있습니다. 연락 주시면 가능 여부에 관하여 답변드리고 있습니다. 
										</div>
									</div>
								</div>
							</li>
							</c:forEach>
							<!-- //list -->
						</ul>
					</div>
					<!-- //FAQ -->


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

					<div class="searchWrap">
						<div class="search">
							<ul>
								<li class="web"><img src="images/txt/txt_search.gif" alt="search" /></li>
								<li class="se">
									<select>
										<option value="" />제목</option>
									</select>
								</li>
								<li><input type="text" class="searchInput" /></li>
								<li class="web"><a href="#"><img src="images/btn/btn_search.gif" alt="검색" /></a></li>
								<li class="mobile"><a href="#"><img src="images/btn/btn_search_m.gif" alt="검색" /></a></li>
							</ul>
						</div>
					</div>

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