<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
   
   <div id="gnb">
		
		<div id="top">
			<ul>
				<li class="brand t1"><a href="#" id="topNavi1">JARDIN’s BRAND</a>
					<ul id="topSubm1">
						<li><a href="${pageContext.request.contextPath}/product/원두/클래스">클래스</a></li>
						<li><a href="${pageContext.request.contextPath}/product/인스턴트/홍스타일카페모리">홈스타일카페모리">홈스타일 카페모리</a></li>
						<li><a href="${pageContext.request.contextPath}/product/원두커피백/드립커피 로스트">드립커피백</a></li>
						<li><a href="${pageContext.request.contextPath}/product/인스턴트/까페모리">카페리얼 커피</a></li>
						<li><a href="${pageContext.request.contextPath}/product/원두커피백/오리지널 커피백">오리지널커피백</a></li>
						<li><a href="${pageContext.request.contextPath}/product/음료/까페리얼">카페리얼</a></li>
						<li><a href="${pageContext.request.contextPath}/product/원두커피백/마일드커피백">마일드커피백</a></li>
						<li><a href="${pageContext.request.contextPath}/product/음료/워터커피">워터커피</a></li>
						
					</ul>
				</li>
				<li class="t2"><a href="category?category1=원두" id="topNavi2">원두</a>
					<ul id="topSubm2">
						<li><a href="category?category1=원두">전체</a></li>
						<li><a href="category?category1=원두&category2=클래스">클래스</a></li>
						<li><a href="category?category1=원두&category2=로스터리샵">로스터리샵</a></li>
						<li><a href="category?category1=원두&category2=커피휘엘">커피휘엘</a></li>
						<li><a href="category?category1=원두&category2=산지별 생두">산지별 생두</a></li>
					</ul>
				</li>
				<li class="t1"><a href="category?category1=원두커피백" id="topNavi3">원두커피백</a>
					<ul id="topSubm3">
						<li><a href="category?category1=원두커피백&category2=드립커피로스트">드립커피로스트</a></li>
						<li><a href="category?category1=원두커피백&category2=오리지널커피백">오리지널커피백</a></li>
						<li><a href="category?category1=원두커피백&category2=마일드커피백">마일드커피백</a></li>
					</ul>
				</li>
				<li class="t2"><a href="category?category1=인스턴트" id="topNavi4">인스턴트</a>
					<ul id="topSubm4">
						<li><a href="category?category1=인스턴트&category2=까페모리">까페모리</a></li>
						<li><a href="category?category1=인스턴트&category2=홍스타일카페모리">홈스타일카페모리</a></li>
						<li><a href="category?category1=인스턴트&category2=포타제">포타제</a></li>
					</ul>
				</li>
				<li class="t1"><a href="category?category1=음료" id="topNavi5">음료</a>
					<ul id="topSubm5">
						<li><a href="category?category1=음료&category2=까페리얼">까페리얼</a></li>
						<li><a href="category?category1=음료&category2=워터커피">워터커피</a></li>
						<li><a href="category?category1=음료&category2=모히또">모히또</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi6">커피용품</a>
					<ul id="topSubm6">
						<li><a href="${pageContext.request.contextPath}/product/커피용품/종이컵">종이컵</a></li>
						<li><a href="${pageContext.request.contextPath}/product/커피용품/커피필터">커피필터</a></li>
						<li><a href="${pageContext.request.contextPath}/product/커피용품/머신 등">머신 등</a></li>
					</ul>
				</li>
				<li class="t1"><a href="${pageContext.request.contextPath}/product/선물세트" id="topNavi7">선물세트</a></li>
				<li class="t2"><a href="${pageContext.request.contextPath}/product/대량구매" id="topNavi8">대량구매</a></li>
			</ul>
		</div>

		<script type="text/javascript">initTopMenu();</script>
	</div>

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
									<li>카페모리 홍차라떼, 드립커피백 체험단 모집 <span class="ingbtn">진행중</span><span class="finishbtn">종료</span></li>
								</ul>
							</div>
							<div class="day">
								<p class="txt">리뷰 등록기간<span>2014-05-06 ~ 2014-06-30</span></p>
								<p class="appraisal">
									체험단 평점
									<span>
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star.gif" alt="별점" />
										<img src="images/ico/ico_star_off.gif" alt="별점" />
									</span>
								</p>
							</div>
							<div class="data">
								<ul>
									<li>모집 인원<span>15명</span></li>
									<li class="dep">신청기간<span>2014-04-01 ~ 2014-04-25</span></li>
									<li class="dep">체험단 발표<span>2014-04-30</span></li>
								</ul>
							</div>
						</div>

						<div class="viewContents">
							안녕하세요.<br/>
							쟈뎅샵 회원분들을 대상으로 카페모리 홍차라떼, 드립커피백 체험단 모집합니다.<br/>
							쟈뎅의 대표 상품을 체험할 수 있는 기회를 놓치지 마세요!
						</div>
					</div>


					<!-- Tab -->
					<div class="productTab normaltab">
						<p>해단 체험단 신청 완료되었습니다  감사합니다!</p>
					</div>
					<!-- //Tab -->


					<div class="checkDivTab">
						<table summary="분류, 별점, 제목, 상세 내용 순으로 상품평을 작성 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>상품평 작성</caption>
							<colgroup>
							<col width="19%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
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
								<li><a href="preUserApply" class="sbtnMini">신청하기</a></li>
								<li><a href="#" class="nbtnbig">취소</a></li>	
							</ul>
						</div>
					</div>
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