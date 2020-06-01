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

	<div id="header">
		
		<div id="snbBox">
			<h1><img src="../images/txt/logo.gif" alt="JARDIN SHOP" /></h1>
			<div id="quickmenu">
				<div id="mnaviOpen"><img src="../images/btn/btn_mnavi.gif" width="33" height="31" alt="메뉴열기" /></div>
				<div id="mnaviClose"><img src="../images/btn/btn_mnavi_close.gif" width="44" height="43" alt="메뉴닫기" /></div>
				<ul>
					<li><a href="#">EVENT</a></li>
					<li><a href="#">CUSTOMER</a></li>
					<li><a href="#">COMMUNITY</a></li>
				</ul>
			</div>
			<div id="snb">
				<ul>
					<li><a href="#">LOGIN</a></li>
					<li><a href="#">JOIN</a></li>
					<li><a href="#">MY PAGE</a></li>
					<li><a href="#">CART</a></li>
				</ul>

				<div id="search">
					<input type="text" class="searchType" />
					<input type="image" src="../images/btn/btn_main_search.gif" width="23" height="20" alt="검색하기" />
				</div>
			</div>
		</div>
	</div>


	<!-- GNB -->
	<div id="gnb">
		
		<div id="top">
			<ul>
				<li class="brand t1"><a href="#" id="topNavi1">JARDIN’s BRAND</a>
					<ul id="topSubm1">
						<li><a href="#">클래스</a></li>
						<li><a href="#">홈스타일 카페모리</a></li>
						<li><a href="#">드립커피백</a></li>
						<li><a href="#">카페리얼 커피</a></li>
						<li><a href="#">오리지널커피백</a></li>
						<li><a href="#">카페리얼 음료</a></li>
						<li><a href="#">마일드커피백</a></li>
						<li><a href="#">워터커피</a></li>
						<li><a href="#">카페포드</a></li>
						<li><a href="#">모히또파티</a></li>
						<li><a href="#">테이크아웃 카페모리</a></li>
						<li><a href="#">포타제</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi2">원두</a>
					<ul id="topSubm2">
						<li><a href="#">클래스</a></li>
						<li><a href="#">로스터리샵</a></li>
						<li><a href="#">커피휘엘</a></li>
						<li><a href="#">산지별 생두</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi3">원두커피백</a>
					<ul id="topSubm3">
						<li><a href="#">드립커피 로스트</a></li>
						<li><a href="#">오리지널커피백</a></li>
						<li><a href="#">마일드커피백</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi4">인스턴트</a>
					<ul id="topSubm4">
						<li><a href="#">까페모리</a></li>
						<li><a href="#">홈스타일카페모리</a></li>
						<li><a href="#">포타제</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi5">음료</a>
					<ul id="topSubm5">
						<li><a href="#">까페리얼</a></li>
						<li><a href="#">워터커피</a></li>
						<li><a href="#">모히또</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi6">커피용품</a>
					<ul id="topSubm6">
						<li><a href="#">종이컵</a></li>
						<li><a href="#">커피필터</a></li>
						<li><a href="#">머신 등</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi7">선물세트</a></li>
				<li class="t2"><a href="#" id="topNavi8">대량구매</a></li>
			</ul>
		</div>

		<script type="text/javascript">initTopMenu();</script>
	</div>
	<!-- //GNB -->

	<!-- container -->
	<div id="container">

		<div id="location">
			<ol>
				<li><a href="#">HOME</a></li>
				<li><a href="#">MY PAGE</a></li>
				<li class="last">주문/배송 조회</li>
			</ol>
		</div>
		
		<div id="outbox">		
			<div id="left">
				<div id="title">MY PAGE<span>마이페이지</span></div>
				<ul>	
					<li><a href="#" id="leftNavi1">주문/배송 조회</a></li>
					<li><a href="#" id="leftNavi2">반품/배송 현황</a></li>
					<li><a href="#" id="leftNavi3">장바구니</a></li>
					<li><a href="#" id="leftNavi4">위시리스트</a></li>
					<li><a href="#" id="leftNavi5">나의 쿠폰</a></li>
					<li><a href="#" id="leftNavi6">나의 포인트</a></li>
					<li><a href="#" id="leftNavi7">1:1문의</a></li>
					<li><a href="#" id="leftNavi8">회원정보 수정</a></li>
					<li class="last"><a href="#" id="leftNavi9">회원 탈퇴</a></li>
				</ul>			
			</div><script type="text/javascript">initSubmenu(1,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="mypage">
					<h2><strong>주문/배송 조회</strong><span>회원님이 구매하신 주문내역 및 배송정보를 확인하실 수 있습니다.</span></h2>
					
					<div class="myInfo">
						<ul>
							<li class="info"><strong>가나다</strong> 님의 정보를 한눈에 확인하세요.</li>
							<li>보유 쿠폰<br/><span class="num">199</span> <span class="unit">장</span></li>
							<li class="point">내 포인트<br/><span class="num">100,000</span> <span class="unit">P</span></li>
							<li class="last">진행중인 주문<br/><span class="num">199</span> <span class="unit">건</span></li>
						</ul>
					</div>

					<h3>주문/배송 조회</h3>
					<div class="checkDiv">
						<table summary="기간별, 상태별, 단어검색별로 주문/배송 조회를 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>주문/배송 조회</caption>
							<colgroup>
							<col width="22%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>기간별 검색</span></th>
									<td>
										<ul class="pta">
											<li><input type="text" class="w84" /></li>
											<li><span class="mvalign">&nbsp;~&nbsp;</span></li>
											<li class="r10"><input type="text" class="w84" /></li>
											<li class="rcl4"><a href="#" class="daybtn">오늘</a></li>
											<li class="rc4"><a href="#" class="daybtn">1주일</a></li>
											<li class="rc4"><a href="#" class="daybtn">1개월</a></li>
											<li class="rc4"><a href="#" class="daybtn">6개월</a></li>
											<li class="rc4"><a href="#" class="daybtn">1년</a></li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>상태별 검색</span></th>
									<td>
										<select>
											<option value="">선택해주세요.</option>
										</select>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>단어 검색</span></th>
									<td>
										<ul class="pta">
											<li class="or10"><input type="text" class="w186" /></li>
											<li><a href="#" class="nbtnMini iw56">검색</a></li>
										</ul>
									</td>
								</tr>
							</tbody>
						</table>
					</div>


					<div class="orderDiv">
						<table summary="주문일자/주문번호, 상품명, 가격, 수량, 주문상태 순으로 조회를 하실수 있습니다." class="orderTable" border="1" cellspacing="0">
							<caption>주문게시판</caption>
							<colgroup>
							<col width="25%" class="tw28" />
							<col width="*" />
							<col width="15%" class="tnone" />
							<col width="8%" class="tnone" />
							<col width="18%" class="tw30" />
							</colgroup>
							<thead>
								<th scope="col">주문일자 <span>/ 주문번호</span></th>
								<th scope="col">상품명</th>
								<th scope="col" class="tnone">가격</th>
								<th scope="col" class="tnone">수량</th>
								<th scope="col">주문상태</th>
							</thead>
							<tbody>
								<tr>
									<td>
										<p class="day">2012-05-30</p>
										<p class="orderNum">201205301204-8057</p>
									</td>
									<td class="left">
										쟈뎅 오리지널 콜롬비아 페레이라 원두커피백 15p
									</td>
									<td class="tnone">999,999 원</td>
									<td class="tnone">1000개</td>
									<td>
										<span class="heavygray">배송완료</span>
										<ul class="state">	
											<li class="r5"><a href="return.html" class="obtnMini iw40">교환</a></li>
											<li><a href="return.html" class="nbtnMini iw40">반품</a></li>
											<li><a href="#" class="reviewbtn">리뷰작성</a></li>
											<li><a href="#" class="decidebtn">구매확정</a></li>
										</ul>										
									</td>
								</tr>

								<tr>
									<td>
										<p class="day">2012-05-30</p>
										<p class="orderNum">201205301204-8057</p>
									</td>
									<td class="left">
										쟈뎅 오리지널 콜롬비아 페레이라 원두커피백 15p
									</td>
									<td class="tnone">999,999 원</td>
									<td class="tnone">1000개</td>
									<td>
										<span class="lightgray">입금대기중</span>
										<ul class="state">
											<li><a href="#" class="nbtnMini iw83">취소</a></li>
										</ul>										
									</td>
								</tr>

								<tr>
									<td>
										<p class="day">2012-05-30</p>
										<p class="orderNum">201205301204-8057</p>
									</td>
									<td class="left">
										쟈뎅 오리지널 콜롬비아 페레이라 원두커피백 15p
									</td>
									<td class="tnone">999,999 원</td>
									<td class="tnone">1000개</td>
									<td>
										<span class="lightgray">입금완료</span>
										<ul class="state">
											<li><a href="#" class="nbtnMini iw83">취소</a></li>
										</ul>										
									</td>
								</tr>

								<tr>
									<td>
										<p class="day">2012-05-30</p>
										<p class="orderNum">201205301204-8057</p>
									</td>
									<td class="left">
										쟈뎅 오리지널 콜롬비아 페레이라 원두커피백 15p
									</td>
									<td class="tnone">999,999 원</td>
									<td class="tnone">1000개</td>
									<td>
										<span class="orange">배송중</span>									
									</td>
								</tr>

								<tr>
									<td>
										<p class="day">2012-05-30</p>
										<p class="orderNum">201205301204-8057</p>
									</td>
									<td class="left">
										쟈뎅 오리지널 콜롬비아 페레이라 원두커피백 15p
									</td>
									<td class="tnone">999,999 원</td>
									<td class="tnone">1000개</td>
									<td>
										<span class="orange">배송준비중</span>									
									</td>
								</tr>
							</tbody>
						</table>

						<div class="noData">
							등록된 상품이 없습니다.
						</div>
					</div>
					

					<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="#" class="n"><img src="../images/btn/btn_pre2.gif" alt="처음으로"/></a><a href="#" class="pre"><img src="../images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
						<strong>1</strong>
						<a href="#">2</a>
						<a href="#">3</a>
						<a href="#">4</a>
						<a href="#">5</a>
						<a href="#" class="next"><img src="../images/btn/btn_next1.gif" alt="뒤페이지로"/></a><a href="#" class="n"><img src="../images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>


					<div class="productTab">
						<ul>
							<li><a href="javascript:;" onclick="return false;" id="tab_today">오늘 본 상품 <span>(4)</span></a></li>
							<li class="last"><a href="javascript:;" onclick="return false;" id="tab_basket">장바구니 <span>(0)</span></a></li>
						</ul>						
					</div><script type="text/javascript">$(function(){$(".productTab ul li a:eq(0)").click();});</script>	


					<!-- Today Product -->
					<div class="tab_today disnone">
						
						<div class="productList">
							<ul>
								<!-- Product Yes -->
								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>

								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>

								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>

								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>
								<!-- //Product Yes -->

								<!-- Product No 
								<li class="noProduct">
									상품이 없습니다.
								</li>
								 -->
							</ul>
						</div>

						<div class="btnArea">
							<div class="bRight">
								<ul>
									<li><a href="#" class="nbtnbig">선택상품 삭제</a></li>
									<li><a href="#" class="sbtnMini">장바구니 추가</a></li>
								</ul>
							</div>
						</div>

					</div>
					<!-- //Today Product -->


					<!-- Shopping Basket -->
					<div class="tab_basket disnone">
						
						<div class="productList">
							<ul>
								<!-- Product Yes -->
								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 장바구니 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>

								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 장바구니 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>

								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 장바구니 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>

								<li>
									<span class="chk"><input type="checkbox" /></span>
									<span class="img"><img src="../images/img/sample_product.jpg" alt="상품" /></span>
									<span class="name"><a href="#">쟈뎅 장바구니 블루마운틴 블렌드 원두커피백 15P</a></span>
									<span class="price">4,330원</span>
								</li>
								<!-- //Product Yes -->

								<!-- Product No 
								<li class="noProduct">
									상품이 없습니다.
								</li>
								 -->
							</ul>
						</div>

						<div class="btnArea">
							<div class="bRight">
								<ul>
									<li><a href="#" class="nbtnbig">선택상품 삭제</a></li>
									<li><a href="#" class="sbtnMini">선택상품 주문</a></li>
								</ul>
							</div>
						</div>

					</div>
					<!-- //Shopping Basket -->


<script type="text/javascript" src="../js/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="../css/jquery.fancybox-1.3.4.css" />
<script type="text/javascript">
$(function(){
	function distance(){
		var winWidth = $(window).width();
		if(winWidth > 767){
			$(".productList ul li:nth-child(4n+4)").css("padding","0 0 0 0");
		}else{
			$(".productList ul li:nth-child(4n+4)").css("padding","0 10px");
		}
	}
	distance();
	$(window).resize(function(){distance();});


	// layer popup
	var winWidth = $(window).width();
	if(winWidth > 767){
		var layerCheck = 760;
	}else{
		var layerCheck = 320;
	}

	$(".iw40").fancybox({
		'autoDimensions'    : false,
		'showCloseButton'	: false,
		'width' : layerCheck,
		'padding' : 0,
		'type'			: 'iframe',
		'onComplete' : function() {
			$('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height
			$('#fancybox-content').height($(this).contents().find('body').height());
			});
		}
	});

});
</script>



				</div>
			</div>
			<!-- //contents -->


		</div>
	</div>
	<!-- //container -->




	<div id="footerWrap">
		<div id="footer">
			<div id="fnb">
				<ul>
					<li class="left"><a href="#">개인정보취급방침</a></li>
					<li><a href="#">이용약관</a></li>
					<li class="left"><a href="#">이메일무단수집거부</a></li>
					<li><a href="#">고객센터</a></li>
					<li class="left brand"><a href="#">쟈뎅 브랜드 사이트</a></li>
				</ul>
			</div>
			
			<div id="finfo">
				<div id="flogo"><img src="../images/txt/flogo.gif" alt="JARDIN THE COFFEE CREATOR, SINCE 1984" /></div>
				<address>
					<ul>
						<li>㈜쟈뎅</li>
						<li>대표자 윤영노</li>
						<li class="tnone">주소 서울시 강남구 논현동 4-21번지 영 빌딩</li>
						<li class="webnone">소비자상담실 02)546-3881</li>
						<li>사업자등록번호 211-81-24727</li>
						<li class="tnone">통신판매신고 제 강남 – 1160호</li>
						<li class="copy">COPYRIGHT © 2014 JARDIN <span>ALL RIGHTS RESERVED.</span></li>
					</ul>
				</address>

				<div id="inicis"><img src="../images/ico/ico_inicis.png" alt="이니시스 결제시스템" /></div>
			</div>
		</div>
	</div>



</div>
</div>
</body>
</html>