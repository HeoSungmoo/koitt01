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
<script type="text/javascript" src="../js/jquery.min.../js"></script>
<script type="text/javascript" src="../js/top_navi.../js"></script>
<script type="text/javascript" src="../js/left_navi.../js"></script>
<script type="text/javascript" src="../js/main.../js"></script>
<script type="text/javascript" src="../js/common.../js"></script>
<script type="text/javascript" src="../js/jquery.easing.1.3.../js"></script>
<script type="text/javascript" src="../js/idangerous.swiper-2.1.min.../js"></script>
<script type="text/javascript" src="../js/jquery.anchor.../js"></script>
<script type="text/javascript" src="../js/html5.../js"></script>
<script type="text/javascript" src="../js/respond.min.../js"></script>

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
	<!-- //GNB -->

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
					<li class="last"><a href="enjoy" id="leftNavi3">ENJOY COFFEE</a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(1,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="mypage">
					<h2><strong>체험단</strong><span>쟈뎅샵에서 진행되는 무료체험 기회를 놓치지 마세요.</span></h2>
					
					<!-- 체험단 -->
					<div class="imgListType">
						<ul>
							<!-- List -->
							<c:set var="k" value="1"/> 
							<c:forEach var="expr" items="${expr}">
							
							
							<li>
								<div class="img"><img src="preuserUpload/${expr.thumbnail }" width="155" height="160" alt="" /></div>
							
								<div class="txt">
									<div class="subject">
									<jsp:useBean id="now" class="java.util.Date" />
									
									 <!-- 현재날짜 --> 
									<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" var="nowDate" /> 
									   
									<!-- 신청 시작날짜 !--> 
									<fmt:formatDate value="${expr.apply_start_date}" pattern="yyyy-MM-dd" var="startDate" /> 
										
									<!-- 신청 마감날짜 !-->
									<fmt:formatDate value="${expr.apply_end_date}" pattern="yyyy-MM-dd" var="endDate" />
							
									 
									<c:choose>
										<c:when test="${nowDate<endDate}">
										<a href="exprView?preuser_no=${expr.preuser_no}">${expr.title } <span class="ingbtn">진행중</span></a>
										</c:when>
										<c:when test="${now>endDate}">
										<a href="exprView?preuser_no=${expr.preuser_no}">${expr.title } <span class="ingbtn">종료</span></a>
										</c:when>
										</c:choose>
									</div>

<div id="star${k=k+1}" class="star">

</div>
<script>
    var innerHtml = "체험단 평점&nbsp;";
    for (var i = 0; i < 5; i++) {
        if (i < ${expr.grade}) {
            innerHtml += '<img src="images/ico/ico_star.gif"/>'
        } else {
            innerHtml += '<img src="images/ico/ico_star_off.gif"/>';
        }
    }
    var star = document.getElementById('star${k}');
    star.innerHTML = innerHtml;
</script>
									<div class="databox">
										<span class="tit">모집 인원</span><span class="cont">${expr.personnel}</span>
										<span class="tit">신청 기간</span><span><fmt:formatDate pattern="yyyy-MM-dd" value="${expr.apply_start_date}"/> ~ <fmt:formatDate pattern="yyyy-MM-dd" value="${expr.apply_end_date}"/></span>
										<span class="tit">체험단 발표</span><span class="cont"><fmt:formatDate pattern="yyyy-MM-dd" value="${expr.announcement_date}"/></span>
										<span class="tit">리뷰 등록기간</span><span><fmt:formatDate pattern="yyyy-MM-dd" value="${expr.review_start_date}"/> ~ <fmt:formatDate pattern="yyyy-MM-dd" value="${expr.review_end_date}"/></span>
									</div>
								</div>
							</li>
							</c:forEach>
							<!-- //List -->


							

						</ul>
					</div>


					<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="expr?curPage=1&option=${sv.option }&search=${sv.search}" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${pDto.getPrev_page()}">
						
           				 <a href="expr?curPage=${pDto.getStart_page()-1}&option=${sv.option }&search=${sv.search}" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${pDto.getStart_page()}" end="${pDto.getEnd_page()}" step="1" var="index">
            				<c:if test="${pDto.getCurPage() eq index}">
               				<a  href="expr?curPage=${index}&option=${sv.option }&search=${sv.search} " style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${pDto.getCurPage() ne index}">
              				 <a href="expr?curPage=${index}&option=${sv.option }&search=${sv.search}">${index}</a>
              			
           	
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${pDto.getNext_page()}">
            				<a href="expr?curPage=${pDto.getEnd_page()+1}&option=${sv.option }&search=${sv.search}" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="expr?curPage=${pDto.getPage_cnt()}&option=${sv.option }&search=${sv.search}" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>
				<form action="expr">
					<div class="searchWrap">
						<div class="search">
							<ul>
								<li class="web"><img src="images/txt/txt_search.gif" alt="search" /></li>
								<li class="se">
									<select name="option">
										<option value="total">전체</option>
										<option value="title">제목</option>
										<option value="content">내용</option>
									</select>
								</li>
								<li><input type="text" name="search" class="searchInput" /></li>
								<li class="web"><button id="exprBtn"><img src="images/btn/btn_search.gif" alt="검색" /></button></li>
								<li class="mobile"><button><img src="images/btn/btn_search_m.gif" alt="검색" /></button></li>
							</ul>
						</div>
					</div>
					</form>
					<!-- //체험단 -->


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