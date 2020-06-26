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
<link rel="stylesheet" type="text/css" href="../css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="../css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="../css/content.css?v=Y" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/top_navi.js"></script>
<script type="text/javascript" src="../js/left_navi.js"></script>
<script type="text/javascript" src="../js/main.js"></script>
<script type="text/javascript" src="../js/common.js"></script>
<script type="text/javascript" src="../js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="../js/idangerous.swiper-2.1.min.js"></script>
<script type="text/javascript" src="../js/jquery.anchor.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="../js/html5.js"></script>
<script type="text/javascript" src="../js/respond.min.js"></script>
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
		<p class="img"><img src="../images/ico/ico_alert.gif" alt="알림" /></p>
		<p class="txt">IE버전이 낮아 홈페이지 이용에 불편함이 있으므로 <strong>IE9이상이나 다른 브라우저</strong>를 이용해 주세요. </p>
		<ul>
			<li><a href="http://windows.microsoft.com/ko-kr/internet-explorer/download-ie" target="_blank"><img src="../images/ico/ico_ie.gif" alt="IE 최신브라우저 다운" ></a></li>
			<li><a href="https://www.google.com/intl/ko/chrome/browser" target="_blank"><img src="../images/ico/ico_chrome.gif" alt="IE 최신브라우저 다운" ></a></li>
			<li><a href="http://www.mozilla.org/ko/firefox/new" target="_blank"><img src="../images/ico/ico_mozila.gif" alt="MOZILA 최신브라우저 다운" ></a></li>
			<li><a href="http://www.apple.com/safari" target="_blank"><img src="../images/ico/ico_safari.gif" alt="SAFARI 최신브라우저 다운" ></a></li>
			<li><a href="http://www.opera.com/ko/o/ie-simple" target="_blank"><img src="../images/ico/ico_opera.gif" alt="OPERA 최신브라우저 다운" ></a></li>		
		</ul>
		<p class="btn" onclick="msiehide();"><img src="../images/ico/ico_close.gif" alt="닫기" /></p>
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
					<li class="last"><a href="enjoy" id="leftNavi3">ENJOY COFFEE</a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(2,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="mypage">
					<h2><strong>사용 후기</strong><span>쟈뎅 제품을 구매하신 회원님들의 소중한 후기입니다.</span></h2>
					
					<div class="productTab normaltab">
						<ul>
							<li><a href="#" class="on">포토 구매후기</a></li>
							<li class="last"><a href="#">상품평</a></li>
						</ul>						
					</div>

					<div class="viewDivTab">
						<div class="viewHead">
							<div class="subject">
								<ul>
								
									<li>${epilogueView.title} </li>
								</ul>
							</div>
							<div class="day">
								<p class="txt">제품명<span>${epilogueView.productTitle} </span></p>
							</div>
							<div class="data">
								<ul>
									<li>작성자<span>${epilogueView.id}</span></li>
									<li class="tnone">등록일<span>${epilogueView.review_date}</span></li>
									<li class="tnone">조회수<span>${epilogueView.hit}</span></li>
									<li class="last">평점
										<span class="ty" id="star${k=k+1 }">
											</span>
											<script>
    var innerHtml = "체험단 평점&nbsp;";
    for (var i = 0; i < 5; i++) {
        if (i < ${epilogueView.grade}) {
            innerHtml += '<img src="images/ico/ico_star.gif"/>'
        } else {
            innerHtml += '<img src="images/ico/ico_star_off.gif"/>';
        }
    }
    var star = document.getElementById('star${k}');
    star.innerHTML = innerHtml;
</script>
									</li>
								</ul>
							</div>
						</div>

						<div class="viewContents">
							${epilogueView.content}
						</div>
					</div>

					<!-- 답변 -->
					<div class="answer">
						<div class="inbox">
							<div class="aname">
								<p>담당자 <span>[2014-03-04&nbsp;&nbsp;15:01:59]</span></p>
							</div>

							<div class="atxt">
								쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
						
							</div>
						</div>
					</div>
					<!-- //답변 -->


					<!-- 이전다음글 -->
					<div class="pnDiv web">
						<table summary="이전다음글을 선택하여 보실 수 있습니다." class="preNext" border="1" cellspacing="0">
							<caption>이전다음글</caption>
							<colgroup>
							<col width="100px" />
							<col width="*" />
							<col width="100px" />
							</colgroup>
							<tbody>
								<tr>
									<th class="pre">PREV</th>
									<td><a href="#">상품 재입고는 언제 되나요?</a></td>
									<td>&nbsp;</td>
								</tr>

								<tr>
									<th class="next">NEXT</th>
									<td>다음 글이 없습니다 .${epilogueView.thumbnail}</td>
									<td>&nbsp;</td>
								</tr>
							</tbody>
						</table>
					</div>
					<!-- //이전다음글 -->


					<!-- Btn Area -->
					<div class="btnArea">
						<div class="bRight">
							<ul>
								<li><a href="epilogueUpdate?review_no=${epilogueView.review_no}"class="nbtnbig mw">수정</a></li>
								<li><a href="epilogueDelete?review_no=${epilogueView.review_no}" class="nbtnbig mw">삭제</a></li>
								<li><a href="epilogue??curPage=${sv.curPage}&option=${sv.option}&search=${sv.search}" class="sbtnMini mw">목록</a></li>
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