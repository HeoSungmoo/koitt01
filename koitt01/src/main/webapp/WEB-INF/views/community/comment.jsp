<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
			</div><script type="text/javascript">initSubmenu(2,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="mypage">
					<h2><strong>사용 후기</strong><span>쟈뎅 제품을 구매하신 회원님들의 소중한 후기입니다.</span></h2>
					
					<div class="productTab normaltab">
						<ul>
							<li><a href="epilogue">포토 구매후기</a></li>
							<li class="last"><a href="comment" class="on">상품평</a></li>
						</ul>						
					</div>


					<!-- 상품평 -->
					<div class="orderDiv">
					<table summary="상품평 게시판으로 NO, 제품명, 제목, 작성자, 평점/등록일, 조회수 순으로 조회 하실수 있습니다." class="orderTable" border="1" cellspacing="0">
						<caption>주문 제품 확인</caption>
						<colgroup>
						<col width="8%" class="tnone" />
						<col width="15%" class="tw20" />
						<col width="*" />
						<col width="14%" class="tw20" />
						<col width="14%" class="tnone" />
						<col width="10%" class="tnone" />
						</colgroup>
						<thead>
							<th scope="col" class="tnone">NO.</th>
							<th scope="col">제품명</th>
							<th scope="col">제목</th>
							<th scope="col">작성자</th>
							<th scope="col" class="tnone">평점/등록일</th>
							<th scope="col" class="tnone">조회수</th>
						</thead>
						<tbody>
							<c:forEach var="comment" items="${eDto}">
							<tr>
								<td class="tnone">1</td>
								<td>${comment.productTitle}</td>
								<td class="left">
									<a href="commentView?review_no=${comment.review_no}&curPage=${sv.curPage}&option=${sv.option}&search=${sv.search}" >
										 ${comment.title}
										<img src="images/ico/ico_new.gif" alt="new" />
									</a>
								</td>
								<td>${comment.id}</td>
								<td class="tnone" id="star${k=k+1 }">
									
									

									<br/><fmt:formatDate pattern="yyyy-MM-dd" value="${comment.review_date}"/>
								</td>
								<td class="right tnone">${comment.hit}</td>
							</tr>
								<script>
    var innerHtml = "";
    for (var i = 0; i < 5; i++) {
        if (i < ${comment.grade}) {
            innerHtml += '<img src="images/ico/ico_star.gif"/>'
        } else {
            innerHtml += '<img src="images/ico/ico_star_off.gif"/>';
        }
    }
    var star = document.getElementById('star${k}');
    star.innerHTML = innerHtml;
</script>
							</c:forEach>
						</tbody>
					</table>
					</div>

					<div class="btnAreaList">
						<div class="bwright">
							<ul>
								<li><a href="epilogueInsert" class="sbtnMini">글쓰기</a></li>
							</ul>
						</div>

<!-- 페이징이동1 -->
						<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="comment?curPage=1&option=${sv.option}&search=${sv.search}" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${pDto.getPrev_page()}">
						
           				 <a href="comment?curPage=${pDto.getStart_page()-1}&option=${sv.option}&search=${search}" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${pDto.getStart_page()}" end="${pDto.getEnd_page()}" step="1" var="index">
            				<c:if test="${pDto.getCurPage() eq index}">
               				<a  href="comment?curPage=${index}&option=${sv.option}&search=${sv.search} " style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${pDto.getCurPage() ne index}">
              				 <a href="comment?curPage=${index}&option=${sv.option}&search=${sv.search}">${index}</a>
              			
              				
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${pDto.getNext_page()}">
            				<a href="comment?curPage=${pDto.getEnd_page()+1}&option=${sv.option}&search=${sv.search}" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="comment?curPage=${pDto.getPage_cnt()}&option=${sv.option}&search=${sv.search}" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>

					<form action="comment">
					<div class="searchWrap">
						<div class="search">
							<ul>
								<li class="web"><img src="images/txt/txt_search.gif" alt="search" /></li>
								<li class="se">
									<select name="option">
										<option value="total" >전체</option>
										<option value="title" >제목</option>
										<option value="content">내용</option>
									</select>
								</li>
								<li><input type="text" name="search" class="searchInput" /></li>
								<li class="web"><button><img src="images/btn/btn_search.gif" alt="검색" /></button></li>
								<li class="mobile"><a href="#"><img src="images/btn/btn_search_m.gif" alt="검색" /></a></li>
							</ul>
						</div>
					</div>
					</form>
					<!-- //상품평 -->

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