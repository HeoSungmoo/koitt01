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
<script type="text/javascript">
$(function() {

});
</script>
</head>
<body>
<div id="layerWrap">

<div class="inputWrap">
		
	<div class="inputBody">
		<div class="title">쿠폰 조회</div>
		<p class="close"><a onclick="parent.$.fancybox.close();" href="javascript:;"><img src="../images/btn/btn_input_close.gif" alt="닫기" /></a></p>

		<div id="member">
			<h3 class="dep">쿠폰 적용</h3>
			<div class="orderDivNm">
				<table summary="상품 게시판으로 주문하신 상품명, 수량, 판매가, 배송순으로 조회 하시고 쿠폰을 적용하실 수 있습니다." class="orderTable" border="1" cellspacing="0">
					<caption>상품 게시판</caption>
					<colgroup>
					<col width="*" />
					<col width="16%" />
					<col width="14%" class="tw30" />
					<col width="16%" class="pnone" />
					</colgroup>
					<thead>
						<th scope="col">상품명</th>
						<th scope="col">수량</th>
						<th scope="col">판매가</th>
						<th scope="col" class="pnone">배송비</th>
					</thead>
					<tbody>
						<tr>
							<td class="left">
								<p class="img"><img src="../images/img/sample_product.jpg" alt="상품" width="66" height="66" /></p>

								<ul class="goods">
									<li>
										<a href="#">쟈뎅 오리지널 콜롬비아 페레이라 원두커피백 15p</a>
									</li>
								</ul>
							</td>
							<td>1개</td>
							<td>14,400 원</td>
							<td class="pnone">0 원</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="popGraybox">
				<div class="choose">
					쿠폰선택&nbsp;&nbsp;
					<select>
						<option value="">쿠폰선택</option>
					</select>
				</div>

				<div class="result">
					<div class="point">* 옵션가와 배송비는 제외</div>
					<div class="discount">
						쿠폰 할인 금액 : <span>0</span> 원
					</div>
				</div>
			</div>

			<!-- 쿠폰할인 금액 합계 -->
			<div class="amount popamount">
				<ul class="coupon">
					<li>쿠폰 할인 금액 합계 : <span class="orange">0</span> 원</li>
				</ul>
			</div>
			<!-- //쿠폰할인 금액 합계 -->
			
			<!-- Btn Area -->
			<div class="btnArea">
				<div class="bCenter">
					<ul>								
						<li><a href="#" class="sbtnMini">확인</a></li>
						<li><a onclick="parent.$.fancybox.close();" href="javascript:;" class="nbtnbig">취소</a></li>
					</ul>
				</div>
			</div>
			<!-- //Btn Area -->

		</div>

	</div>

</div>


</div>
</body>
</html>