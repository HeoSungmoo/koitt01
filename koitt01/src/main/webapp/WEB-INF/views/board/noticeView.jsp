<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
						<li><a href="#">CUSTOMER</a></li>
						<li class="last">NOTICE</li>
					</ol>
				</div>

				<div id="outbox">
					<div id="left">
						<div id="title2">
							CUSTOMER<span>고객센터</span>
						</div>
						<ul>
							<li><a href="notice" id="leftNavi1">NOTICE</a></li>
							<li><a href="bInquiryView" id="leftNavi2">1:1문의</a></li>
							<li><a href="faq" id="leftNavi3">FAQ</span></a></li>
							<li class="last"><a href="guide" id="leftNavi4">이용안내</a></li>
						</ul>
					</div>
					<script type="text/javascript">
						initSubmenu(1, 0);
					</script>


					<!-- contents -->
					<div id="contents">
						<div id="customer">
							<h2>
								<strong>NOTICE</strong><span>쟈뎅샵 소식을 전해드립니다.</span>
							</h2>

							<div class="viewDivMt">
								<div class="viewHead">
									<div class="subject">
										<ul>
											<li>${noticeView.title}</li>
										</ul>
									</div>
									<div class="day">
										<p class="txt">
											작성일<span><fmt:formatDate pattern="yyyy-MM-dd"
													value="${noticeView.upload_date}" /></span>
										</p>
									</div>
								</div>

								<div class="viewContents">${noticeView.content}</div>
							</div>


							<!-- 이전다음글 -->
							<div class="pnDiv web">
								<table summary="이전다음글을 선택하여 보실 수 있습니다." class="preNext"
									border="1" cellspacing="0">
									<caption>이전다음글</caption>
									<colgroup>
										<col width="100px" />
										<col width="*" />
									</colgroup>
									<tbody>
										<tr>
											<th class="pre">PREV</th>
											<c:choose>
												<c:when test="${noticeViewPre.title==null}">
													<td>
														<p>이전글이 없습니다.</p>
													</td>
												</c:when>
												<c:otherwise>

													<td><a href="noticeView?no=${noticeViewPre.no}">${noticeViewPre.title}</a>
													</td>
												</c:otherwise>
											</c:choose>
										</tr>

										<tr>
											<th class="next">NEXT</th>
											<c:choose>
												<c:when test="${noticeViewNext.title==null}">
													<td>
														<p>다음글이 없습니다.</p>
													</td>
												</c:when>
												<c:otherwise>
													<td><a href="noticeView?no=${noticeViewNext.no}">${noticeViewNext.title}</a>
													</td>
												</c:otherwise>
											</c:choose>
										</tr>
									</tbody>
								</table>
							</div>
							<!-- //이전다음글 -->


							<!-- Btn Area -->
							<div class="btnArea btline">
								<div class="bRight">
									<ul>
										<li><a
											href="notice?curPage=${sv.curPage}&option=${sv.option}&search=${sv.search}"
											class="sbtnMini mw">목록</a></li>
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
				<%@ include file="../include/footer.jsp"%>
			</footer>


		</div>
	</div>
</body>
</html>