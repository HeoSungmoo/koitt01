<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
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

<div id="header">
		
		<div id="snbBox">
			<h1><a href="${pageContext.request.contextPath}"><img src="images/txt/logo.gif" alt="JARDIN SHOP" /></a></h1>
			<div id="quickmenu">
				<div id="mnaviOpen"><img src="images/btn/btn_mnavi.gif" width="33" height="31" alt="메뉴열기" /></div>
				<div id="mnaviClose"><img src="images/btn/btn_mnavi_close.gif" width="44" height="43" alt="메뉴닫기" /></div>
				<ul>

					<li><a href="event">EVENT</a></li>


					<li><a href="list">List</a></li>

					<li><a href="list">EVENT</a></li>

					

					<li><a href="notice">CUSTOMER</a></li>
					<li><a href="expr">COMMUNITY</a></li>
				</ul>
			</div>
			<div id="snb">
				<ul>
					<li><a href="login">LOGIN</a></li>
					<li><a href="step01">JOIN</a></li>
					<li><a href="orderCheck">MY PAGE</a></li>
					<li><a href="#">CART</a></li>
				</ul>

				<div id="search">
					<input type="text" class="searchType" />
					<input type="image" src="images/btn/btn_main_search.gif" width="23" height="20" alt="검색하기" />
				</div>
			</div>
		</div>
	</div>

</div>
</div>
   
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
				<li><a href="#">HOME1</a></li>
				<li>원두커피</li>
				<li class="last">원두</li>
			</ol>
		</div>
					
		<!-- maxcontents -->
		
		<div id="maxcontents">

			<div class="banner"><img src="productUpload/${banner.image }" alt="원두커피, 원두커피 전문 기업 쟈뎅의 Coffee Master의 심혈을 기울인 엄선된 원두 선별, 일반 원두커피부터 간편하게 즐기는 원두커피백, POD까지 다양하게 구성되어 있습니다." class="web" /><img src="images/img/product_banner01_m.jpg" alt="원두커피, 원두커피 전문 기업 쟈뎅의 Coffee Master의 심혈을 기울인 엄선된 원두 선별, 일반 원두커피부터 간편하게 즐기는 원두커피백, POD까지 다양하게 구성되어 있습니다." class="mobile" /></div>
	
			<h2 class="brand">${banner.category1 }<span>더 신선한 커피, 더 맛있는 커피</span></h2>

			<div class="brandTab">
				<ul>

			
					<li><a href="#" class="hover">드립커피백</a></li>
					<li><a href="#">오리지널 커피백</a></li>
					<li><a href="#">마일드 커피백</a></li>
					<li><a href="#">카페모리</a></li>
					<li><a href="#">카페포드</a></li>
					<li><a href="#">카페리얼</a></li>
					<li><a href="#">워터커피</a></li>
					<li><a href="${pageContext.request.contextPath}/product/원두/클래스">클래스</a></li>

				</ul>
			</div>
			<div class="brandList">
		
		<ul>
					<!-- 반복 -->

		
					 	<c:forEach var="productList" items="${product }">
					<li>
						<a href="${pageContext.request.contextPath}/detail?product_no=${productList.product_no }">
							<div class="img"><img src="productUpload/${productList.thumbnail }" alt="제품이미지" /></div>
							<div class="name">${productList.title }</div>
							<div class="price">${productList.price }</div>
						</a>
					</li>
						</c:forEach> 
		</ul>
		
		
		
			</div>
	
	
	
			<!-- quickmenu -->
			<div id="quick">
				<div class="cart"><a href="#">장바구니</a></div>
				<div class="wish">
					<p class="title">위시 리스트</p>
					
					<div class="list">
						<ul>	
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
							<li><a href="#"><img src="images/img/sample_wish.gif" alt="" /></a>
						</ul>
					</div>

					<div class="total">
						<a href="#none" class="wishLeft"><img src="images/btn/wish_left.gif" alt="" /></a>
						 <span class="page">1</span> / <span class="sum">3</span>
						<a href="#none" class="wishRight"><img src="images/btn/wish_right.gif" alt="" /></a>
					</div>

				</div>

				<div class="top"><a href="#">TOP&nbsp;&nbsp;<img src="images/ico/ico_top.gif" alt="" /></a></div>
			</div>
			<script type="text/javascript">
			$(function(){
				
				$(window).scroll(function(){
					var tg = $("div#quick");
					var xg = $("div#maxcontents");
					var limit = xg.height()- 165;
					var tmp = $(window).scrollTop();

					if (tmp > limit) {
						tg.css({"position" : "absolute","right" : "-150px","bottom" : "208px","top" : "auto"});
					}
					else {
						tg.css({"position" : "fixed","top" : "208px" , "margin-left" : "940px","right" : "auto"});
					}
				});

			});
			</script>
			<!-- //quickmenu -->

		</div>
		<!-- //maxcontents -->

	</div>
	<!-- //container -->

			<% if(request.getParameter("category2") == null) {%>
					<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="category?curPage=1&search=${sv.search}&category1=${category1}" class="n"><img src="${pageContext.request.contextPath}/images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${pDto.getPrev_page()}">
						
           				 <a href="category?curPage=${pDto.getStart_page()-1}&search=${sv.search}&category1=${category1}" class="pre"><img src="${pageContext.request.contextPath}/images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${pDto.getStart_page()}" end="${pDto.getEnd_page()}" step="1" var="index">
            				<c:if test="${pDto.getCurPage() eq index}">
               				<a  href="category?curPage=${index}&search=${sv.search}&category1=${category1}" style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${pDto.getCurPage() ne index}">
              				 <a href="category?curPage=${index}&search=${sv.search}&category1=${category1}">${index}</a>
              			
           	
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${pDto.getNext_page()}">
            				<a href="category?curPage=${pDto.getEnd_page()+1}&search=${sv.search}&category1=${category1}" class="next"><img src="${pageContext.request.contextPath}/images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="category?curPage=${pDto.getPage_cnt()}&search=${sv.search}&category1=${category1}" class="n"><img src="${pageContext.request.contextPath}/images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>
				<%} else{%>
						<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="category?curPage=1&search=${sv.search}&category1=${category1}&category2=${category2}" class="n"><img src="${pageContext.request.contextPath}/images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${pDto.getPrev_page()}">
						
           				 <a href="category?curPage=${pDto.getStart_page()-1}&search=${sv.search}&category1=${category1}&category2=${category2}" class="pre"><img src="${pageContext.request.contextPath}/images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${pDto.getStart_page()}" end="${pDto.getEnd_page()}" step="1" var="index">
            				<c:if test="${pDto.getCurPage() eq index}">
               				<a  href="category?curPage=${index}&search=${sv.search}&category1=${category1}&category2=${category2} " style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${pDto.getCurPage() ne index}">
              				 <a href="category?curPage=${index}&search=${sv.search}&category1=${category1}&category2=${category2}">${index}</a>
              			
           	
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${pDto.getNext_page()}">
            				<a href="category?curPage=${pDto.getEnd_page()+1}&search=${sv.search}&category1=${category1}&category2=${category2}" class="next"><img src="${pageContext.request.contextPath}/images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="category?curPage=${pDto.getPage_cnt()}&search=${sv.search}&category1=${category1}&category2=${category2}" class="n"><img src="${pageContext.request.contextPath}/images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>
				
				
				
				<%} %>


	
	<footer>
      <%@ include file="../include/footer.jsp"  %>
   </footer>



</div>
</div>
</body>
</html>