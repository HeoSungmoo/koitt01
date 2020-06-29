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
				<li><a href="#">CUSTOMER</a></li>
				<li class="last">이용안내</li>
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
			</div><script type="text/javascript">initSubmenu(4,0);</script>


			<!-- contents -->
			<div id="contents">
				<div id="customer">
					<h2><strong>이용안내</strong><span></span></h2>
					<textarea rows="30" cols=92%">
				
제1조 (목적)
본 약관은 주식회사"(주) 쟈뎅"(이하 "회사")이 운영하는 웹사이트(이하 "사이트")에서 제공하는 인터넷 관련 서비스(이하 "서비스")를 이용함에 있어 사이트와 이용자간의 권리, 의무 및 책임사항 및 절차 등을 규정함을 목적으로 합니다.

제 2조 (정의)
"서비스"란 ㈜쟈뎅이 재화·용역을 이용자에게 제공하기 위하여 컴퓨터 등 정보통신설비를 이용하여 재화·용역을 거래할 수 있도록 설정한 가상의 영업장 또는 회사가 운영하는 웹사이트를 말하며, 통합된 하나의 회원 계정(ID 및 비밀번호)을 이용하여 서비스를 제공받을 수 있는 아래의 사이트를 의미합니다. 아울러 사이트를 운영하는 사업자의 의미로도 사용합니다.
(주)쟈뎅: www.jardin.co.kr
쇼핑몰: www.jardinshop.co.kr
"이용자"란 "(주)쟈뎅"에 접속하여 이 약관에 따라 "(주)쟈뎅"이 제공하는 서비스를 받는 회원 및 비회원을 말합니다.
"회원"이라 함은 "(주)쟈뎅"에 개인정보를 제공하여 회원등록을 한 자로서, "(주)쟈뎅"의 정보를 지속적으로 제공받으며, "(주)쟈뎅"이 제공하는 서비스를 계속적으로 이용할 수 있는 자를 말합니다.
"비회원"이라 함은 회원에 가입하지 않고 "(주)쟈뎅"이 제공하는 서비스를 제한적으로 이용하는 자를 말합니다.
제 3조 (약관의 명시와 개정)
"(주)쟈뎅"은 이 약관의 내용과 상호, 영업소 소재지, 대표자의 성명, 사업자 등록번호, 연락처(전화, 팩스, 전자우편주소 등)를 이용자가 알 수 있도록 "(주)쟈뎅"의 초기 서비스 화면(전면)에 게시합니다.
"(주)쟈뎅"은 약관의규제에관한법률, 전자거래기본법, 전자서명법, 정보통신망이용촉진등에관한법률, 방문판매등에관한 법률, 소비자보호법 등 관련법을 위배하지 않는 범위에서 이 약관을 개정할 수 있습니다.
"(주)쟈뎅"이 약관을 개정할 경우에는 적용일자 및 개정사유를 명시하여 현행약관과 함께 "(주)쟈뎅"의 초기화면에 그 적용일자 7일 이전부터 적용일자 전일까지 공지합니다.
"(주)쟈뎅"이 약관을 개정할 경우에는 그 개정약관은 그 적용일자 이후에 체결되는 계약에만 적용되고 그 이전에 이미 체결된 계약에 대해서는 개정전의 약관조항이 그대로 적용됩니다. 다만 이미 계약을 체결한 이용자가 개정약관 조항의 적용을 받기를 원하는 뜻을 상기 제3항에 의한 개정약관의 공지기간내에 "(주)쟈뎅"에 송신하여 "(주)쟈뎅"의 동의를 받은 경우에는 개정약관 조항이 적용됩니다.
이 약관에서 정하지 아니한 사항과 이 약관의 해석에 관하여는 정부가 제정한 전자거래소비자보호지침 및 관계법령 또는 상관례에 따릅니다.
제 4조 (서비스의 제공 및 변경)
"(주)쟈뎅"은 다음과 같은 업무를 수행합니다.

재화 또는 용역에 대한 정보 제공 및 구매계약의 체결
구매계약이 체결된 재화 또는 용역의 배송
기타 "(주)쟈뎅"이 정하는 업무
제 5조 (서비스의 중단)
"(주)쟈뎅"은 컴퓨터 등 정보통신설비의 보수점검·교체 및 고장, 통신의 두절 등의 사유가 발생한 경우에는 서비스의 제공을 일시적으로 중단할 수 있습니다.
제 1항에 의한 서비스 중단의 경우에는 "(주)쟈뎅"은 제 8조에 정한 방법으로 이용자에게 통지합니다.
"(주)쟈뎅"은 제 1항의 사유로 서비스의 제공이 일시적으로 중단됨으로 인하여 이용자 또는 제 3자가 입은 손해에 대하여 배상합니다. 단, "(주)쟈뎅"에 고의 또는 과실이 없는 경우에는 그러하지 아니합니다.
제 6조 (회원가입)
이용자는 "(주)쟈뎅"이 정한 가입 양식에 따라 회원정보를 기입한 후 이 약관에 동의한다는 의사표시를 함으로서 회원가입을 신청합니다.
"(주)쟈뎅"은 제 1항과 같이 회원으로 가입할 것을 신청한 이용자 중 다음 각호에 해당하지 않는 한 회원으로 등록합니다.
가입신청자가 이 약관 제7조제3항에 의하여 이전에 회원자격을 상실한 적이 있는 경우, 다만 제7조제3항에 의한 회원자격상실후 3년이 경과한 자로서 "(주)쟈뎅"의 회원재가입 승낙을 얻은 경우에는 예외로 한다.
등록내용에 허위, 기재누락, 오기가 있는 경우
기타 회원으로 등록하는 것이 "(주)쟈뎅"의 기술상 현저히 지장이 있다고 판단되는 경우
제 7조 (회원탈퇴 및 자격상실등)
회원은 "(주)쟈뎅"에 언제든지 탈퇴를 요청할 수 있으며, "(주)쟈뎅"은 즉시 회원탈퇴를 처리합니다.
회원이 다음 각 호의 사유에 해당하는 경우, "(주)쟈뎅"은 회원자격을 제한 및 정지시킬 수 있습니다.
가입 신청시에 허위 내용을 등록한 경우
"(주)쟈뎅"을 이용하여 구입한 재화·용역 등의 대금, 기타 "(주)쟈뎅" 이용에 관련하여 회원이 부담하는 채무를 기일에 지급하지 않는 경우
타인의 "(주)쟈뎅" 이용을 방해하거나 그 정보를 도용하는 등 전자거래질서를 위협하는 경우
"(주)쟈뎅"을 이용하여 법령과 이 약관이 금지하거나 공서양속에 반하는 행위를 하는 경우
제 8조 (회원에 대한 통지)
"(주)쟈뎅"이 회원에 대한 통지를 하는 경우, 회원이 "(주)쟈뎅"에 제출한 전자우편 주소 로 할 수 있습니다.
"(주)쟈뎅"은 불특정다수 회원에 대한 통지의 경우 1주일 이상 "(주)쟈뎅" 화면에 게시함으로써 개별 통지에 갈음할 수 있습니다.
제 9조 (회원에 대한 특전)
"(주)쟈뎅"에 회원으로 가입한 자는 상품 구입 금액의 3%를 포인트로 적립받을 수 있으며, 적립한 포인트는 구매 시 현금처럼 사용할 수 있습니다. (단, 일부 상품 제외)
"(주)쟈뎅"에 회원으로 가입한 자는 회원을 대상으로 실시하는 각종 이벤트 또는 할인혜택등을 제공받을 수 있으며, 이메일을 통해 다양한 유용한 정보 등을 제공받을 수 있습니다.
단, 상기 회원 특전은 "(주)쟈뎅"의 정책에 의거 변경될 수 있습니다.
제 10조 (구매신청)
"(주)쟈뎅" 이용자는 온라인 상에서 이하의 방법에 의하여 구매를 신청합니다.

재화(상품) 또는 용역의 선택
회원가입
배송정보 입력
결제방식의 선택
성명, 주소, 전화번호 입력
이 약관에 동의한다는 의사표시 (예, 마우스 클릭)
제 11조 (계약의 성립)
"(주)쟈뎅"은 제13조와 같은 구매신청에 대하여 다음 각 호에 해당하지 않는 한 승낙합니다.
신청 내용에 허위, 기재누락, 오기가 있는 경우
미성년자가 담배, 주류 등 청소년보호법에서 금지하는 재화 및 용역을 구매하는 경우
기타 구매신청에 승낙하는 것이 "(주)쟈뎅"의 기술상 현저히 지장이 있다고 판단하는 경우
"(주)쟈뎅"의 승낙이 제13조제1항의 수신확인통지형태로 이용자에게 도달한 시점에 계약이 성립한 것으로 봅니다.
제 12조 (지급방법)
"(주)쟈뎅"에서 구매한 재화 또는 용역에 대한 대금지급은 구매한 재화 또는 용역을 수령시에 직접 지급합니다.(후불제)

제 13조 (수신확인통지·구매신청 변경 및 취소)
수신확인통지를 받은 이용자는 의사표시의 불일치등이 있는 경우에는 수신확인 통지를 받은 후 구매신청 변경 및 취소를 요청할 수 있습니다. 이 때에 구매신청 변경 및 취소의 방법은 "(주)쟈뎅"이 배송전에 유선상으로 이용자에게 구매한 재화 또는 용역의 내용을 확인시에 이루어지며, 이용자는 이때에 "(주)쟈뎅"에 대하여 구매신청 변경 및 취소 요청을 할 수 있습니다.
"(주)쟈뎅"의 승낙이 제13조제1항의 수신확인통지형태로 이용자에게 도달한 시점에 계약이 성립한 것으로 봅니다.
"(주)쟈뎅"은 배송전 이용자의 구매신청 변경 및 취소 요청이 있는 때에는 지체없이 그 요청에 따라 처리합니다.
제 14조 (배송)
"(주)쟈뎅"은 이용자가 구매한 재화 또는 용역에 대해 배송수단, 수단별 배송비용 부담자, 수단별 배송기간 등을 명시합니다. 만약 "(주)쟈뎅"의 고의·과실로 약정 배송기간을 초과한 경우에는 그로 인한 이용자의 손해를 배상 합니다.

제 15조 (환급, 반품 및 교환)
"(주)쟈뎅"은 이용자가 구매 신청한 재화 또는 용역이 품절 등의 사유로 재화의 인도 또는 용역의 제공을 할 수 없을 때에는 지체 없이 그 사유를 이용자에게 통지하고, 사전에 재화 또는 용역의 대금을 받은 경우에는 대금을 받은 날부터 3일 이내에, 그렇지 않은 경우에는 그 사유 발생일로부터 3일이내에 계약해제 및 환급절차를 취합니다.
다음 각 호의 경우에는 "(주)쟈뎅"은 배송된 재화일지라도 재화를 반품 받은 다음 영업일 이내에 이용자의 요구에 따라 즉시 환급, 반품 및 교환 조치를 합니다. 다만 그 요구 기한은 배송된 날로부터 20일 이내로 합니다.
배송된 재화가 주문내용과 상이하거나 "(주)쟈뎅"이 제공한 정보와 상이할 경우
배송된 재화가 파손, 손상되었거나 오염되었을 경우
재화가 광고에 표시된 배송기간보다 늦게 배송된 경우
방문판매등에관한법률 제18조에 의하여 광고에 표시하여야 할 사항을 표시하지 아니한 상태에서 이용자의 청약이 이루어진 경우
제 16조 (개인 정보 보호)
"(주)쟈뎅"은 회원의 정보수집시 구매계약 및 기타 서비스의 제공에 필요한 최소한의 정보를 수집합니다. 다음 사항을 필수사항으로하며 그 외 사항은 선택사항으로 합니다.
개인식별 목적 :성명, 주민등록번호, 생년월일
개인정보 보호 목적 : 희망ID ,비밀번호
통지 및 배송 목적 : 주소, 이메일 주소, 전화번호, 이동통신 전화번호, 회사명, 대표자명, 업태, 업종, 사업자등록번호, 메일수신여부
"(주)쟈뎅"은 회원의 개인식별이 가능한 개인정보를 수집하는 때에는 반드시 당해 회원의 동의를 받습니다.
제공된 개인정보는 당해 이용자의 동의 없이 목적외의 이용이나 제3자에게 제공할 수 없으며, 이에 대한 모든 책임은 "(주)쟈뎅"이 부담합니다. 다만, 다음의 경우에는 예외로 합니다.
배송업무상 배송업체에게 배송에 필요한 최소한의 이용자의 정보(성명, 주소, 전화번호)를 알려주는 경우
통계작성, 학술연구 또는 시장조사를 위하여 필요한 경우로서 특정 개인을 식별할 수 없는 형태로 제공하는 경우
㈜쟈뎅의 각종 이벤트 행사시, 행사에 참여한 회원의 개인정보를 필요시에 해당 이벤트의 주최자에게 제공하는 경우
관계 법령에 의하여 수사상 목적으로 정해진 절차와 방법에 따라 관계기관의 요구가 있는 경우
다른 법률에 특별한 규정이 있는 경우
정보통신윤리위원회의 요청이 있는 경우
"(주)쟈뎅"이 제2항과 제3항에 의해 이용자의 동의를 받아야 하는 경우에는 개인정보관리 책임자의 신원(소속, 성명 및 전화번호 기타 연락처), 정보의 수집목적 및 이용목적, 제3자에 대한 정보제공 관련사항(제공받는자, 제공목적 및 제공할 정보의 내용)등 정보통신망이용촉진등에관한법률 제16조제3항이 규정한 사항을 미리 명시하거나 고지해야 하며 이용자는 언제든지 이 동의를 철회할 수 있습니다.
이용자는 언제든지 "(주)쟈뎅"이 가지고 있는 자신의 개인정보에 대해 열람 및 오류정정을 요구할 수 있으며 "(주)쟈뎅"은 이에 대해 지체 없이 필요한 조치를 취할 의무를 집니다. 이용자가 오류의 정정을 요구한 경우에는 "(주)쟈뎅"은 그 오류를 정정할 때까지 당해 개인정보를 이용하지 않습니다.
"(주)쟈뎅"은 개인정보 보호를 위하여 관리자를 한정하여 그 수를 최소화하며 신용카드, 은행계좌등을 포함한 이용자의 개인정보의 분실, 도난, 유출, 변조 등으로 인한 이용자의 손해에 대하여 모든 책임을 집니다.
"(주)쟈뎅" 또는 그로부터 개인정보를 제공받은 제3자는 개인정보의 수집목적 또는 제공 받은 목적을 달성한 때에는 당해 개인정보를 지체 없이 파기합니다.
제 17조 (㈜쟈뎅의 의무)
"(주)쟈뎅"은 법령과 이 약관이 금지하거나 공서양속에 반하는 행위를 하지 않으며 이 약관이 정하는 바에 따라 지속적이고, 안정적으로 재화·용역 및 기타 서비스를 제공하는데 최선을 다하여야 합니다.
"(주)쟈뎅"은 이용자가 안전하게 인터넷서비스를 이용할 수 있도록 이용자의 개인정보(신용정보 포함)보호를 위한 보안 시스템을 갖추어야 합니다.
"(주)쟈뎅"이 상품이나 용역에 대하여 표시·광고의공정화에관한법률 제3조 소정의 부당한 표시·광고행위를 함으로써 이용자가 손해를 입은 때에는 이를 배상할 책임을 집니다.
"(주)쟈뎅"은 수신거부를 명백히 한 이용자에게 원하지 않는 영리목적의 광고성 전자우편을 발송하지 않습니다.
제 18조 (회원의 ID 및 비밀번호에 대한 의무)
제16조의 경우를 제외한 ID와 비밀번호에관한 관리책임은 회원에게 있습니다.
회원은 자신의 ID 및 비밀번호를 제3자가 이용하게 해서는 안됩니다.
회원이 자신의 ID 및 비밀번호를 도난당하거나 제3자가 사용하고 있음을 인지한 경우에는 바로 "(주)쟈뎅"에 통보하고 "(주)쟈뎅"의 안내가 있는 경우에는 그에 따라야 합니다.
"(주)쟈뎅"은 회원이 상기 제1항, 제2항, 제3항을 위반하여 회원에게 발생한 손해에 대하여는 아무런 책임을 부담하지 않습니다.
제 19조 (이용자의 의무)
이용자는 다음 행위를 하여서는 안됩니다.

신청 또는 변경시 허위내용의 등록
"(주)쟈뎅"에 게시된 정보의 변경
"(주)쟈뎅"이 정한 정보 이외의 정보(컴퓨터 프로그램 등)의 송신 또는 게시
"(주)쟈뎅" 기타 제3자의 저작권 등 지적재산권에 대한 침해
"(주)쟈뎅" 기타 제3자의 명예를 손상시키거나 업무를 방해하는 행위
외설 또는 폭력적인 메시지·화상·음성 기타 공서양속에 반하는 정보를 "(주)쟈뎅"에 공개 또는 게시하는 행위
제 20 조 (게시물 관리)
"(주)쟈뎅"은 이용자가 등록하는 게시물의 내용이 다음 각 항에 해당한다고 판단되는 경우에 사전통지 없이 삭제할 수 있습니다.

다른 이용자 또는 제3자를 비방하거나 중상모략으로 명예를 손상시키는 내용인 경우
공공질서 및 미풍양속에 위반되는 내용인 경우
범죄적 행위에 결부된다고 인정되는 내용일 경우
"(주)쟈뎅"의 저작권, 제 3 자의 저작권 등 기타 권리를 침해하는 내용인 경우
"(주)쟈뎅"에서 규정한 게시기간이나 용량을 초과한 경우
기타 관계법령에 위반된다고 판단되는 경우
제 21 조 (저작권의 귀속 및 이용제한)
"(주)쟈뎅"이 작성한 저작물에 대한 저작권 기타 지적재산권은 "(주)쟈뎅"에 귀속합니다.
이용자는 "(주)쟈뎅"을 이용함으로써 얻은 정보를 "(주)쟈뎅"의 사전 승낙없이 복제, 송신, 출판, 배포, 방송 기타 방법에 의하여 영리목적으로 이용하거나 제3자에게 이용하게 하여서는 안됩니다.
제 22조 (사이트의 연결)
"(주)쟈뎅"은 타 사이트에 하이퍼링크 (하이퍼링크의 대상에는 문자, 그림 및 동화상 등이 포함됨)방식 등에 의해 연결시킬 수 있습니다.
"(주)쟈뎅"은 이용자가 해당 연결사이트와 독자적으로 상품 또는 용역을 거래한 행위에 대해서는 아무런 책임을 부담하지 않습니다.
제 23조 (광고게재 등)
"(주)쟈뎅"은 회원에게 최상의 서비스를 원활하게 제공하기 위한 재정기반을 마련하기 위하여 상업용 광고를 화면에 게재하거나 이메일, 문자메세지(SMS) 또는 DM(서신) 등을 이용하여 개별 회원에게 보낼 수 있습니다. 단, 수신거부의 의사를 명백히 표시한 회원에 대해서는 더 이상 이메일, 문자메세지(SMS) 또는 DM(서신) 등을 발송하지 않습니다.
"(주)쟈뎅"은 본 서비스를 통한 광고주의 판촉활동에 이용자가 직접 참여함으로써 발생하는 손해에 대하여는 아무런 책임을 부담하지 않습니다.
제 24조 (면책)
"(주)쟈뎅"은 천재지변, 불가항력 기타 "(주)쟈뎅"의 합리적인 통제범위를 벗어난 사유로 인하여 서비스를 제공할 수 없는 경우에는 그에 대한 책임을 부담하지 않습니다.
"(주)쟈뎅"은 이용자의 귀책사유로 인하여 서비스를 제공할 수 없는 경우에는 그에 대한 책임을 부담하지 않습니다.
"(주)쟈뎅"은 이용자가 서비스를 이용함으로써 기대되는 수익을 얻지 못하거나 서비스를 통해 얻은 자료를 이용하여 발생한 손해에 대해서는 책임을 부담하지 않습니다.
이용자가 화면에 게재한 정보, 자료, 사실 등의 내용에 관한 신뢰도 또는 정확성에 대하여는 해당이용자가 책임을 부담하며, "(주)쟈뎅"은 내용의 부정확 또는 허위로 인해 이용자 또는 제3자에게 발생한 손해에 대하여는 아무런 책임을 부담하지 않습니다.
"(주)쟈뎅"은 서비스이용과 관련하여 이용자의 고의 또는 과실로 인하여 이용자 또는 제3자에게 발생한 손해에 대하여는 아무런 책임을 부담하지 않습니다.
제 25조 (분쟁해결)
"(주)쟈뎅"은 이용자가 제기하는 정당한 의견이나 불만을 반영하고 그 피해를 보상처리하기 위하여 피해보상처리기구를 설치·운영합니다.
"(주)쟈뎅"은 이용자로부터 제출되는 불만사항 및 의견을 우선적으로 처리합니다. 다만, 신속한 처리가 곤란한 경우에는 이용자에게 그 사유와 처리일정을 즉시 통보해 드립니다.
"(주)쟈뎅"과 이용자간에 발생한 분쟁은 전자거래기본법 제28조 및 동법 시행령 제15조에 의하여 설치된 전자거래분쟁조정위원회의 조정에 따를 수 있습니다.
제 26조 (재판권 및 준거법)
"(주)쟈뎅"과 이용자간에 발생한 전자거래 분쟁에 관한 소송은 민사소송법상의 관할법원에 제기합니다.
"(주)쟈뎅"과 이용자간에 제기된 전자거래 소송에는 대한민국법을 적용합니다.
부칙
본 약관은 2005년 5월 16일부터 시행합니다.
					</textarea>

					
				

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