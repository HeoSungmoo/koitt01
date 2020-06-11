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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/content.css?v=Y" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/top_navi.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/left_navi.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/idangerous.swiper-2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.anchor.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/memberInfo.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/respond.min.js"></script>
<![endif]-->
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
// 이메일 선택 
$(function(){	
	$(document).ready(function(){
		$('select[name=emailList]').change(function() {
			if($(this).val()=="1"){
				$('#orderMail2').val("");
				$("#orderMail2").attr("readonly", false);
			} else {
				$('#orderMail2').val($(this).val());
				$("#orderMail2").attr("readonly", true);
			}
		});


		$("#ordersame").click(function(){
			$("#recipientName").val($("#orderName").val());
			$("#recipientZip").val($("#orderZip").val());
			$("#recipientAddress").val($("#orderAddress").val());
			$("#recipientPhone").val($("#orderPhone").val());
			$("#recipientTel").val($("#orderTel").val());
		});
		
	});
});

  function sample6_execDaumPostcode() {
        new daum.Postcode({
             oncomplete: function(data) {
            	
            	 
            	 // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('orderZip').value = data.zonecode;
           		document.getElementById('orderAddress').value = addr;            
                // 커서를 상세주소 필드로 이동한다.
            } 
        }).open();
    }
</script>
</script>
</head>
<body>



<!--익스레이어팝업-->
<div id="ieUser" style="display:none">
	<div class="iewrap">	
		<p class="img"><img src="${pageContext.request.contextPath}/images/ico/ico_alert.gif" alt="알림" /></p>
		<p class="txt">IE버전이 낮아 홈페이지 이용에 불편함이 있으므로 <strong>IE9이상이나 다른 브라우저</strong>를 이용해 주세요. </p>
		<ul>
			<li><a href="http://windows.microsoft.com/ko-kr/internet-explorer/download-ie" target="_blank"><img src="${pageContext.request.contextPath}/images/ico/ico_ie.gif" alt="IE 최신브라우저 다운" ></a></li>
			<li><a href="https://www.google.com/intl/ko/chrome/browser" target="_blank"><img src="${pageContext.request.contextPath}/images/ico/ico_chrome.gif" alt="IE 최신브라우저 다운" ></a></li>
			<li><a href="http://www.mozilla.org/ko/firefox/new" target="_blank"><img src="${pageContext.request.contextPath}/images/ico/ico_mozila.gif" alt="MOZILA 최신브라우저 다운" ></a></li>
			<li><a href="http://www.apple.com/safari" target="_blank"><img src="${pageContext.request.contextPath}/images/ico/ico_safari.gif" alt="SAFARI 최신브라우저 다운" ></a></li>
			<li><a href="http://www.opera.com/ko/o/ie-simple" target="_blank"><img src="${pageContext.request.contextPath}/images/ico/ico_opera.gif" alt="OPERA 최신브라우저 다운" ></a></li>		
		</ul>
		<p class="btn" onclick="msiehide();"><img src="${pageContext.request.contextPath}/images/ico/ico_close.gif" alt="닫기" /></p>
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
				<li class="last">주문/결제</li>
			</ol>
		</div>
		
		<div id="outbox">		
			
			<!-- maxcontents -->
			<div id="maxcontents">
				<div id="mypage">
					<h2><strong>주문/결제</strong></h2>
					
					<!-- 주문 상품 -->
					<h3 class="dep">주문 제품 확인</h3>
					<div class="orderDivNm">
						<table summary="주문 제품 확인 게시판으로 상품명, 가격, 수량, 합계순으로 조회 하실수 있습니다." class="orderTable" border="1" cellspacing="0">
							<caption>주문 제품 확인</caption>
							<colgroup>
							<col width="*" />
							<col width="16%" class="tnone" />
							<col width="14%" />
							<col width="16%" class="tw28"/>
							</colgroup>
							<thead>
								<th scope="col">상품명</th>
								<th scope="col" class="tnone">가격/포인트</th>
								<th scope="col">수량</th>
								<th scope="col">합계</th>
							</thead>
							<tbody>
								<c:set var="sum" value="0"/>
								<c:forEach var="list" items="${list}">
									<tr>
										<td class="left">
											<p class="img"><img src="${pageContext.request.contextPath}/images/img/${list.thumbnail}" alt="상품" width="66" height="66" /></p>
	
											<ul class="goods">
												<li>
													<a href="#">${list.title}</a>
												</li>
											</ul>
										</td>
										<td class="tnone">
											${list.price}
	
											<!-- 회원일 시 -->
											<br/><span class="pointscore">${list.point}</span>
											<!-- //회원일 시 -->
										</td>
										<td>${list.count} 개</td>
										<td>${list.count * list.price } 원</td>
										<c:set var= "sum" value="${sum + list.count*list.price}"/>

									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="poroductTotal">
						<ul>	
							<li>상품 합계금액 <strong><c:out value="${sum}"/></strong> 원</li>
							<li>+ 배송비 <strong>2,500</strong> 원</li>
							<li>= 총 합계 <strong><c:out value="${sum+2500}"/></strong> 원</li>
						</ul>
					</div>
					<!-- //주문 상품 -->
					

			<!-- 주문자 주소 입력 -->
					<h3 class="diviLeft">주문자 정보 입력</h3>
					<div class="diviRight">
						<ul>
							<li><a onclick=memberInfo('${memberInfo}')>회원정보반영</a></li>
						</ul>
					</div>

					<div class="checkDiv">
						<table summary="주문자 주소를 입력할 수 있는 란으로 이름, 주소, 이메일, 휴대폰 번호, 전화번호 순으로 입력 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>주문자 주소 입력</caption>
							<colgroup>
							<col width="22%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>이름</span></th>
									<td><input type="text" class="w134" id="orderName"/></td>
								</tr>

								<tr>
									<th scope="row"><span>주소</span></th>
									<td>
										<ul class="pta">
											<li>
												<input type="text" class="w134" id="orderZip" />&nbsp;
											</li>
											<li><a class="addressBtn" onclick = "sample6_execDaumPostcode()"><span>우편번호 찾기</span></a></li>
											<li class="pt5"><input type="text" class="addressType2" id="orderAddress"/></li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>이메일</span></th>
									<td>
										<ul class="pta">
											<li><input type="text" class="w134" id="orderMail1"/></li>
											<li><span class="valign">&nbsp;@&nbsp;</span></li>
											<li class="r10"><input type="text" class="w134" id="orderMail2"/></li>
											<li>
												<select id="emailList" name="emailList">
													<option value="1" selected="selected">직접입력</option>
													<option value="naver.com">naver.com</option>
													<option value="daum.net">daum.net</option>
													<option value="hanmail.net">hanmail.net</option>
													<option value="nate.com">nate.com</option>    
													<option value="yahoo.co.kr">yahoo.co.kr</option>    
													<option value="paran.com">paran.com</option>    
													<option value="empal.com">empal.com</option>    
													<option value="hotmail.com">hotmail.com</option>    
													<option value="korea.com">korea.com</option>    
													<option value="lycos.co.kr">lycos.co.kr</option>    
													<option value="dreamwiz.com">dreamwiz.com</option>    
													<option value="hanafos.com">hanafos.com</option>    
													<option value="chol.com">chol.com</option>    
													<option value="gmail.com">gmail.com</option>    
													<option value="empas.com">empas.com</option>
												</select>&nbsp;&nbsp;&nbsp;
											</li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>휴대폰 번호</span></th>
									<td>
										<ul class="pta">
											<li class="r10"><input type="text" class="hsmTel" maxlength="11" id="orderPhone" /></li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>전화번호</span></th>
									<td>
										<ul class="pta">
											<li><input type="text" class="hsmTel" maxlength="11" id="orderTel"/></li>
										</ul>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
			<!-- //주문자 주소 입력 -->


			<!-- 수취자 주소 입력 -->
					<h3 class="dep">
						수취자 정보 입력
						
						<label id="ordersame">주문자 정보와 동일</label>
					</h3>
					<div class="checkDiv">
						<table summary="수취자 주소를 입력할 수 있는 란으로 이름, 주소, 이메일, 휴대폰 번호, 전화번호 순으로 입력 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>수취자 정보 입력</caption>
							<colgroup>
							<col width="22%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>이름</span></th>
									<td><input type="text" class="w134" id="recipientName"/></td>
								</tr>

								<tr>
									<th scope="row"><span>주소</span></th>
									<td>
										<ul class="pta">
											<li>
												<input type="text" class="w134" id="recipientZip"/>&nbsp;
											</li>
											<li><a class="addressBtn"><span>우편번호 찾기</span></a></li>
											<li class="pt5"><input type="text" class="addressType2" id="recipientAddress"/></li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>휴대폰 번호</span></th>
									<td>
										<ul class="pta">
											<li class="r10"><input type="text" class="hsmTel" maxlength="11" id="recipientPhone"/></li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>전화번호</span></th>
									<td>
										<ul class="pta">
											<li><input type="text" class="hsmTel" maxlength="11" id="recipientTel"/></li>
										</ul>
									</td>
								</tr>
								<tr>
									<th scope="row"><span>배송시 <u>요구사항</u></span></th>
									<td><textarea class="demandtta"></textarea></td>
								</tr>
							</tbody>
						</table>
					</div>
			<!-- //수취자 주소 입력 -->


			<!-- 쿠폰 및 포인트 사용 -->
					<h3 class="dep">쿠폰 및 포인트 사용</h3>
					<div class="checkDiv">
						<table summary="쿠폰 및 포인트를 입력 또는 확인 할 수 있는 란으로 총 주문금액, 배송비, 쿠폰할인, 포인트 사용, 총 결제금액 순으로 입력 또는 확인 하실수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>쿠폰 및 포인트 사용</caption>
							<colgroup>
							<col width="22%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>총 주문금액</span></th>
									<td> 원</td>
								</tr>
								<tr>
									<th scope="row"><span>배송비</span></th>
									<td>2,500 원 (선불)</td>
								</tr>
								<tr>
									<th scope="row"><span>쿠폰 할인</span></th>
									<td>
										<ul class="pta">
											<li class="r10">
												<input type="text" class="w134" />&nbsp;&nbsp;
												<span class="valign"><strong>원</strong></span>
											</li>
											<li><a href="couponList.jpg" class="nbtn">쿠폰목록</a></li>
										</ul>
									</td>
								</tr>

								<!-- 회원 일시 -->
								<tr>
									<th scope="row"><span>포인트 사용</span></th>
									<td>
										<ul class="pta">
											<li class="r10">
												<input type="text" class="w134" />&nbsp;&nbsp;
												<span class="valign"><strong>Point</strong></span>
											</li>
											<li>
												<span class="valign">( 사용 가능 포인트 : </span>
												<span class="orange">${point}</span>
												<span class="valign"> Point)</span>
											</li>
										</ul>
									</td>
								</tr>
								<!-- //회원 일시 -->
								
								<tr>
									<th scope="row"><span>총 결제금액</span></th>
									<td>
										<ul class="pta">
											<li><span class="valign"><strong>1,133,810 원</strong> (총주문금액 1,132,310원 + 배송비 2500원 - 포인트 1,000 = 1,133,801원)</li>
										</ul>
									</td>
								</tr>

							</tbody>
						</table>
					</div>
			<!-- //쿠폰 및 포인트 사용 -->
			

			<!-- 총 주문금액 -->
					<div class="amount">

						<!-- 회원 일때 -->
						<h4 class="member">총 주문금액</h4>
						<!-- 회원 일때 -->
						<!-- 비회원 일때  <h4>총 주문금액</h4> //비회원 일때 -->

						<ul class="info">
							<li>
								<span class="title">상품 합계금액</span>
								<span class="won"><strong>1,132,310</strong> 원</span>
							</li>
							<li>
								<span class="title">배송비</span>
								<span class="won"><strong>2,500</strong> 원</span>
							</li>

							<!-- 회원 일때만 -->
							<li>
								<span class="title">포인트 할인</span>
								<span class="won"><strong>- 1,000</strong> P</span>
							</li>
							<li>
								<span class="title">쿠폰 할인</span>
								<span class="won"><strong>- 1,000</strong> 원</span>
							</li>
							<!-- //회원 일떄만 -->
						</ul>

						<ul class="total">
							<!-- 회원 일때만 -->
							<li class="mileage">(적립 포인트 <strong>11,324</strong> Point) </li>
							<!-- //회원 일때만 -->

							<li class="txt"><strong>결제 예정 금액</strong></li>
							<li class="money"><span>1,134,810</span> 원</li>
						</ul>
					</div>
			<!-- //총 주문금액 -->



			<!-- 결제수단 선택 -->
					<h3 class="dep">결제수단 선택</h3>
					<div class="checkDiv">
						<table summary="신용카드 결제, 실시간 계좌이체, 가상계좌, 가상계좌(에스크로), 무통장 입금 순으로 결제수단을 선택하실 수 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>결제수단 선택</caption>
							<colgroup>
							<col width="22%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>결제수단</span></th>
									<td>
										<ul class="pta">
											<li>
												<input type="radio" id="method01" name="method" checked="checked" /><label for="method01">신용카드 결제</label>
											</li>
											<li>
												<input type="radio" id="method02" name="method" /><label for="method02">실시간 계좌이체</label>
											</li>
											<li>
												<input type="radio" id="method03" name="method" /><label for="method03">가상계좌</label>
											</li>
											<li>
												<input type="radio" id="method04" name="method" /><label for="method04">가상계좌(에스크로)</label>
											</li>
											<li>
												<input type="radio" id="method05" name="method" /><label for="method05">무통장 입금</label>
											</li>
										</ul>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				<!-- //결제수단 선택 -->

					<div class="disnone method01"><!-- 신용카드 -->
						<p class="orderalert"><strong>[신용카드]</strong> 온라인상에서 소유하신 신용카드를 통해, 전자결제를 진행합니다.</p>
					</div>
					<div class="disnone method02"><!-- 실시간 계좌이체 -->
						<p class="orderalert"><strong>[실시간 계좌이체]</strong> 주민번호, 계좌 정보, 공인인증서를 통해 실시간 계좌이체를 진행합니다.</p>
					</div>
					<div class="disnone method03"><!-- 가상계좌 -->
						<p class="orderalert"><strong>[가상계좌]</strong> 원하시는 은행으로 가상계좌를 발급해 드리며, 발급된 계좌로 구매대금을 직접 송금합니다.</p>
					</div>
					<div class="disnone method04"><!-- 가상계좌 에스크로 -->
						<p class="orderalert"><strong>[가상계좌 에스크로]</strong> 원하시는 은행으로 가상계좌를 발급해 드리며, 발급된 계좌로 구매대금을 직접 송금합니다.(에스크로 안전결제)</p>
					</div>

					<div class="disnone method05"><!-- 무통장 입금 -->
						<p class="orderalert"><strong>[무통장 입금]</strong> 쇼핑몰의 대표 계좌로 구매대금을 직접 송금합니다.</p>

						<div class="checkDiv">
							<table summary="신용카드 결제, 실시간 계좌이체, 가상계좌, 가상계좌(에스크로), 무통장 입금 순으로 결제수단을 선택하실 수 있습니다." class="checkTable" border="1" cellspacing="0">
								<caption>결제수단 선택</caption>
								<colgroup>
								<col width="22%" class="tw30" />
								<col width="*" />
								</colgroup>
								<tbody>
									<tr>
										<th scope="row"><span>입금은행</span></th>
										<td>
											<select name="bank">
												<option value="" >선택하세요.</option>
											</select>
										</td>
									</tr>
									<tr>
										<th scope="row"><span>입금자 명</span></th>
										<td><input type="text" class="w134" /></td>
									</tr>
									<tr>
										<th scope="row"><span>영수증 신청</span></th>
										<td>
											<select name="receiptChk">
												<option value="none">신청안함</option>
												<option value="individual">개인소득공제</option>
												<option value="corporate">사업자 지출증빙</option>
											</select>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						
						<!-- 개인소득공제 -->
						<div class="receipt individual">
							<dl>
								<dt>발급방식</dt>
								<dd>
									<ul>
										<li><input type="radio" name="individual" id="phone" checked="checked" /><label for="phone">휴대폰</label></li>
										<li><input type="radio" name="individual" id="securitynumber" /><label for="securitynumber">주민등록번호</label></li>
										<li><input type="radio" name="individual" id="cashreceipts" /><label class="fn" for="cashreceipts">현금영수증카드</label></li>
									</ul>
								</dd>
							</dl>
							
							<ul class="inform phone"><!-- 휴대폰 -->
								<li class="title">이름</li>
								<li class="interval"><input type="text" class="w134" /></li>
								<li class="title cb">휴대폰</li>
								<li><input type="text" class="w134" /></li>
							</ul>

							<ul class="inform securitynumber"><!-- 주민등록번호 -->
								<li class="title">이름</li>
								<li class="interval"><input type="text" class="w134" /></li>
								<li class="title cb">주민등록번호</li>
								<li><input type="text" class="w134" /></li>
							</ul>

							<ul class="inform cashreceipts"><!-- 현금영수증카드 -->
								<li class="title">이름</li>
								<li class="interval"><input type="text" class="w134" /></li>
								<li class="title2 cb">현금영수증카드 번호</li>
								<li><input type="text" class="w134" /></li>
							</ul>

							<p class="txt">* 번호 입력시 하이픈(-)을 제외한 숫자만 입력하세요.</p>
						</div>
						<!-- //개인소득공제 -->

						<!-- 사업자 지출증빙 -->
						<div class="receipt corporate">
							<dl>
								<dt>발급방식</dt>
								<dd>
									<ul>
										<li><input type="radio" name="corporate" id="corporatenumber" checked="checked" /><label for="corporatenumber">사업자번호</label></li>
										<li><input type="radio" name="corporate" id="corporate_cash" /><label class="fn" for="corporate_cash">현금영수증카드</label></li>
									</ul>
								</dd>
							</dl>

							<ul class="inform corporatenumber"><!-- 사업자번호 -->
								<li class="title">이름</li>
								<li class="interval"><input type="text" class="w134" /></li>
								<li class="title2 cb">사업자등록 번호</li>
								<li><input type="text" class="w134" /></li>
							</ul>

							<ul class="inform corporate_cash"><!-- 현금영수증카드 -->
								<li class="title">이름</li>
								<li class="interval"><input type="text" class="w134" /></li>
								<li class="title2 cb">현금영수증카드 번호</li>
								<li><input type="text" class="w134" /></li>
							</ul>

							<p class="txt">* 번호 입력시 하이픈(-)을 제외한 숫자만 입력하세요.</p>
						</div>
						<!-- //사업자 지출증빙 -->

					</div>


						
				
					

					<!-- Btn Area -->
					<div class="btnArea">
						<div class="orderCenter">
							<ul>
								<li><a href="#" class="nbtnbig iw0140">뒤로가기</a></li>
								<li><a href="#" class="sbtnMini iw0140">주문 / 결제</a></li>								
							</ul>
						</div>
					</div>
					<!-- //Btn Area -->
				


				</div>
			</div>
			<!-- //maxcontents -->


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery.fancybox-1.3.4.css" />
<script type="text/javascript">
$(function(){

	// select, radio - display check

	// 1 Step Radio
	var firstchk = $("input:radio[name=method]:checked").attr("id");
	$("div." + firstchk).css("display","block");
	$("input:radio[name=method]").click(function(){
		var divchk = $(this).attr("id");		
		$(".disnone").css("display","none");
		$("div." + divchk).css("display","block");
	});
	
	// 2 Step 영수증 Select
	var firstselect = $("select[name=receiptChk] option:selected").attr("value");
	$("div." + firstselect).css("display","block");
	$("select[name=bank]").css("width","125px");
	$("select[name=receiptChk]").css("width","112px");
	$("select[name=receiptChk]").change(function() {
        $(".receipt").css("display","none");
        if($(this).val() == "none"){ $(".receipt").css("display","none"); }
        else if($(this).val() == "individual"){ $(".individual").css("display","block"); }
		else{ $(".corporate").css("display","block"); }

		var firstindi = $("input:radio[name=individual]:checked").attr("id");
		var firstcorp = $("input:radio[name=corporate]:checked").attr("id");
		$("ul." + firstindi).css("display","block");		
		$("ul." + firstcorp).css("display","block");
    });
	
	// 3-1 Step 발급방식 - 개인
	var firstindi = $("input:radio[name=individual]:checked").attr("id");
	$("ul." + firstindi).css("display","block");
	$("input:radio[name=individual]").click(function(){
		var divchk = $(this).attr("id");
		$(".inform").css("display","none");
		$("ul." + divchk).css("display","block");
	});

	// 3-2 Step 발급방식 - 사업자
	var firstcorp = $("input:radio[name=corporate]:checked").attr("id");
	$("ul." + firstcorp).css("display","block");
	$("input:radio[name=corporate]").click(function(){
		var divchk = $(this).attr("id");
		$(".inform").css("display","none");
		$("ul." + divchk).css("display","block");
	});





	// layer popup
	var winWidth = $(window).width();
	if(winWidth > 767){
		var layerCheck = 540;
		var couponCheck = 760;
	}else{
		var layerCheck = 320;
		var couponCheck = 320;
	}

	$(".nbtn").fancybox({
		'autoDimensions'    : false,
		'showCloseButton'	: false,
		'width' : couponCheck,
		'padding' : 0,
		'type'			: 'iframe',
		'onComplete' : function() {
			$('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height
			$('#fancybox-content').height($(this).contents().find('body').height());
			$('#fancybox-wrap').css('top','400px');
			$('html,body').animate({ scrollTop: 400 }, 500);
			});
		}
	});


});
</script>


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