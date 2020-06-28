<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>


    
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/reset.css?v=Y" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/layout.css?v=Y" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/content.css?v=Y" />
<script type="text/javascript" src="${pageContext.request.contextPath}js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/top_navi.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/left_navi.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/main.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/idangerous.swiper-2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}js/jquery.anchor.js"></script>
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
				<li class="t2"><a href="#" id="topNavi2">원두</a>
					<ul id="topSubm2">
						<li><a href="category?category1=원두&category2=클래스">클래스</a></li>
						<li><a href="category?category1=원두&category2=로스터리샵">로스터리샵</a></li>
						<li><a href="category?category1=원두&category2=커피휘엘">커피휘엘</a></li>
						<li><a href="category?category1=원두&category2=산지별 생두">산지별 생두</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi3">원두커피백</a>
					<ul id="topSubm3">
						<li><a href="category?category1=원두커피백&category2=드립커피 로스트">드립커피 로스트</a></li>
						<li><a href="category?category1=원두커피백&category2=오리지널 커피백">오리지널커피백</a></li>
						<li><a href="category?category1=원두커피백&category2=마일드커피백">마일드커피백</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi4">인스턴트</a>
					<ul id="topSubm4">
						<li><a href="category?category1=인스턴트&category2=까페모리">까페모리</a></li>
						<li><a href="category?category1=인스턴트&category2=홍스타일카페모리">홈스타일카페모리</a></li>
						<li><a href="category?category1=인스턴트&category2=포타제">포타제</a></li>
					</ul>
				</li>
				<li class="t1"><a href="#" id="topNavi5">음료</a>
					<ul id="topSubm5">
						<li><a href="category?category1=음료&category2=까페리얼">까페리얼</a></li>
						<li><a href="category?category1=음료&category2=워터커피">워터커피</a></li>
						<li><a href="category?category1=음료&category2=모히또">모히또</a></li>
					</ul>
				</li>
				<li class="t2"><a href="#" id="topNavi6">커피용품</a>
					<ul id="topSubm6">
						<li><a href="category?category1=커피용품&category2=종이컵">종이컵</a></li>
						<li><a href="category?category1=커피용품&category2=커피필터">커피필터</a></li>
						<li><a href="category?category1=커피용품&category2=머신 등">머신 등</a></li>
					</ul>
				</li>
				<li class="t1"><a href="../product/선물세트" id="topNavi7">선물세트</a></li>
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
				<li>원두커피</li>
				<li class="last">원두</li>
			</ol>
		</div>
					
		<!-- maxcontents -->
		<div id="maxcontents">



		<!-- product -->
			<div id="pDetail">
				
				<!-- Slide -->
				<div class="imgSlide">
					<div class="img">
						<ul>
							<li><img src="productUpload/${detail.image1}" alt="제품이미지" /></li>
							<li><img src="productUpload/${detail.image2}" alt="제품이미지" /></li>
							<li><img src="productUpload/${detail.image3}" alt="제품이미지" /></li>
						</ul>
					</div>

					<div class="thum">
						<ul>
							<li><img src="productUpload/${detail.image1 }" alt="제품이미지" /></li>
							<li><img src="productUpload/${detail.image2 }" alt="제품이미지" /></li>
							<li><img src="productUpload/${detail.image3 }" alt="제품이미지" /></li>
						</ul>
					</div>
				</div>
				<!-- //Slide -->
				

				<!-- info -->
				
				<form action="payment?product_no=${detail.product_no }" method="post" name="detail_form">
				<div class="info">
					<p class="title">
					<!--카테고리 넣어야댐 -->
						<span>[오리지널]</span>
			
						${detail.title }
					</p>

					<div class="priceInfo">
						<ul>
							<li>
								<div class="stit">판매가</div> <div class="heavygray"><strong>${detail.price }</strong></div>
							</li>
							<li>
								<div class="stit">포인트</div> <div class="orange"><strong>${detail.point }</strong></div>
							</li>
							<li>
								<div class="stit">칼로리</div> <div>${detail.kcal }</div>
							</li>
							<li>
								<div class="stit">용량</div> <div>${detail.volume }</div>
							</li>
							<li>
								<div class="stit">수량</div> <div class="num"><input id="spinner" name="count" value="1" /></div>
							</li>
							<li>
								<div class="stit">평점</div> 
								<div>
									<img src="images/ico/ico_star.gif" alt="별점" />
									<img src="images/ico/ico_star.gif" alt="별점" />
									<img src="images/ico/ico_star.gif" alt="별점" />
									<img src="images/ico/ico_star.gif" alt="별점" />
									<img src="images/ico/ico_star_off.gif" alt="별점" />
								</div>
							</li>
						</ul>
					</div>
					</form>
					<!-- 판매중 -->
					<div class="infobtn">
						<ul>
							<li><input type="submit" class="ty2" value="구매하기"></li>
							<li><a href="#" class="ty2">장바구니 <span>담기</span></a></li>
							<li class="last"><a href="#" class="ty3">위시 <span>리스트</span></a></li>
						</ul>
					</div>
					<!-- //판매중 -->

					<!-- 판매중지 -->
					<div class="endbtn" style="display:none;">
						<ul>
							<li><a href="#">판매중지</a></li>
							<li><a href="#">SOLD OUT</a></li>
						</ul>
					</div>
					<!-- //판매중지 -->


				</div>
				<!-- //info -->

			</div>
		<!-- //product -->

		
		<!-- tab -->
			<div class="detailTab">
				<ul>
					<li class="dep"><a href="javascript:;" onclick="return false;" id="detailInfo">상품상세 정보</a></li>
					<li><a href="javascript:;" onclick="return false;" id="goodsRelation">관련상품</a></li>
					<li class="dep"><a href="javascript:;" onclick="return false;" id="goodsReview">상품리뷰 <span>(3)</span></a></li>
					<li><a href="javascript:;" onclick="return false;" id="goodsQna">질문과 답변 <span>(1)</span></a></li>
					<li class="last"><a href="javascript:;" onclick="return false;" id="goodsNotice">정책 및 공지</a></li>
				</ul>
			</div><script type="text/javascript">$(function(){$(".detailTab ul li a:eq(${initVal})").click();});</script>
		<!-- //tab -->


		<!-- detail content -->
			<div id="detailContent">

				<!-- detail info -->
				<div class="detailInfo disnone">
					<img src="images/img/sample_detail_info.jpg" class="web" alt="제품상세 정보" />
					<img src="images/img/sample_detail_info_m.jpg" class="mobile" alt="제품상세 정보" />
					<div class="checkInfoDiv">
						<table summary="제품의 정보를 알 수 있는 표로 제품명, 내용량, 제조원, 포장재질, 유통기한, 고객상담실, 식품의 유형, 유통전문판매원, 영양성분, 원재료명 및 함량, 업소명 및 소재지 순으로 나열되어 있습니다." class="checkTable" border="1" cellspacing="0">
							<caption>제품의 정보</caption>
							<colgroup>
							<col width="20%" class="tw22" />
							<col width="*" />
							<col width="18%" class="tw22" />
							<col width="*" class="tw25" />
							</colgroup>
				
							<tbody>
				
								<tr>
									<th scope="row" class="info"><span>제조명</span></th>
									<td>${ProductInfoDto.name }</td>
									<th scope="row" class="info"><span>내용량</u></span></th>
									<td>${ProductInfoDto.capacity}</td>
								</tr>

								<tr>
									<th scope="row" class="info"><span>제조원</span></th>
									<td>${ProductInfoDto.manufacturer}</td>
									<th scope="row" class="info"><span>포장재질</span></th>
									<td>${ProductInfoDto.material}</td>
								</tr>

								<tr>
									<th scope="row" class="info"><span>유통기한</span></th>
									<td>${ProductInfoDto.shelf_life}</td>
									<th scope="row" class="info"><span>고객<u>상담실</u></span></th>
									<td>${ProductInfoDto.service_tel}</td>
								</tr>

								<tr>
									<th scope="row" class="info"><span>식품의 <u>유형</u></span></th>
									<td>${ProductInfoDto.food_type}</td>
									<th scope="row" class="info"><span>유통전문<u>판매원</u></span></th>
									<td>${ProductInfoDto.sales_office}</td>
								</tr>

								<tr>
									<th scope="row" class="info"><span>영양성분</span></th>
									<td colspan="3">${ProductInfoDto.nutrient}</td>
								</tr>

								<tr>
									<th scope="row" class="info"><span>원재료명 <u>및 함량</u></span></th>
									<td colspan="3">${ProductInfoDto.raw_materials}</td>
								</tr>

								<tr>
									<th scope="row" class="info"><span>업소명 <u>및 소재지</u></span></th>
									<td colspan="3">${ProductInfoDto.location}</td>
								</tr>
							</tbody>
								
						</table>
					</div>
				</div>
				<!-- detail info -->

				<!-- goods relation -->
				<div class="goodsRelation disnone">
					<div class="headTitle">
						<strong>관련상품&nbsp;</strong> 이 상품을 구매하신 분들이 함께 구매한 상품입니다.
					</div>

					<div class="relationList">
						<ul>
							<li>
								<div class="img"><img src="images/img/sample_relation_goods.jpg" alt="관련상품 이미지" /></div>
								<div class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></div>
								<div class="price">4,3330원</div>
							</li>

							<li>
								<div class="img"><img src="images/img/sample_relation_goods.jpg" alt="관련상품 이미지" /></div>
								<div class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></div>
								<div class="price">4,3330원</div>
							</li>

							<li>
								<div class="img"><img src="images/img/sample_relation_goods.jpg" alt="관련상품 이미지" /></div>
								<div class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></div>
								<div class="price">4,3330원</div>
							</li>

							<li>
								<div class="img"><img src="images/img/sample_relation_goods.jpg" alt="관련상품 이미지" /></div>
								<div class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></div>
								<div class="price">4,3330원</div>
							</li>

							<li>
								<div class="img"><img src="images/img/sample_relation_goods.jpg" alt="관련상품 이미지" /></div>
								<div class="name"><a href="#">쟈뎅 오리지널 블루마운틴 블렌드 원두커피백 15P</a></div>
								<div class="price">4,3330원</div>
							</li>
						</ul>
					</div>

					<div class="btnAreaList">
						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="#" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a><a href="#" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
						<strong>1</strong>
						<a href="#">2</a>
						<a href="#">3</a>
						<a href="#">4</a>
						<a href="#">5</a>
						<a href="#" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a><a href="#" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						</div>
						<!-- //페이징이동1 -->
					</div>

				</div>
				<!-- //goods relation -->

				<!-- goods review -->
				<div class="goodsReview disnone">
					<div class="headTitle">
						<strong>포토 상품평&nbsp;</strong> 포토 상품평 작성자 중 우수상품평을 선정해 소정의 선물을 드립니다.
						<p class="btn"><a href="photo_view?product_no=${detail.product_no }" class="popBtn">포토 상품평 작성</a></p>
					</div>


				<!-- 포토 구매후기 -->
					<div class="imgListType">
						<ul>
					<c:forEach var="PhotoReview_view" items="${PhotoReview_view }">
							<!-- List -->
							<li>
								<div class="img">
								<img src="preuserUpload/${PhotoReview_view.thumbnail}" width="155" height="160" alt="포토리뷰 썸네일" /></div>
								<div class="txt">
									<div class="subject">
										<a href="#"><span class="orange">[먹어봤어요]</span> ${PhotoReview_view.title }</a>
									</div>
									<div class="conf">
										${PhotoReview_view.content }
									</div>
									<div class="data">
										<p>작성자 <span>${PhotoReview_view.id }</span></p>
										<p>등록일 <span>${PhotoReview_view.review_date }</span></p>
										<p>조회수 <span></span></p>
										<p>평점 
											<span class="ty">
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
												<img src="images/ico/ico_star.gif" alt="별점" />
											</span>
										</p>
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

						<a href="detail?curPage1=1&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${PhotoRdto.getPrev_page1()}">
						
           				 <a href="detail?curPage1=${PhotoRdto.getStart_page1()-1}&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${PhotoRdto.getStart_page1()}" end="${PhotoRdto.getEnd_page1()}" step="1" var="index">
            				<c:if test="${PhotoRdto.getCurPage1() eq index}">
               				<a  href="detail?curPage1=${index}&search=${sv.search}&product_no=${sv.product_no}&initVal=2" style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${PhotoRdto.getCurPage1() ne index}">
              				 <a href="detail?curPage1=${index}&search=${sv.search}&product_no=${sv.product_no}&initVal=2">${index}</a>
              			
           	
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${PhotoRdto.getNext_page1()}">
            				<a href="detail?curPage1=${PhotoRdto.getEnd_page1()+1}&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="detail?curPage1=${PhotoRdto.getPage_cnt1()}&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						
					</div>
						<!-- //페이징이동1 -->
					</div>
				<!-- //포토 구매후기 -->

					
					<div class="headTitle depth">
				
						<strong>상품리뷰&nbsp;</strong>상품리뷰는 상품 구매 후 작성하실 수 있습니다.
						<p class="btn"><a href="review_view?product_no=${detail.product_no }" class="popBtn">구매 후기 작성</a></p>
					</div>

				<!-- 상품리뷰 -->
				<c:forEach var="review_view" items="${review_view }">
					<div class="accordion">
						<ul>
							<!-- 반복 -->
							<li>
								<div class="headArea">
									<div class="subject">
										<a href="javascript:;" class="accbtn">${review_view.title }</a>
									</div>
									<div class="writer">${review_view_id }</div>
									<div class="day">
										<p>${review_view.review_date }</p>
										
										<p>
										<span class="ty" id="star${k=k+1 }">
											</span>
										<script>
									    var innerHtml = "평점&nbsp;";
									    for (var i = 0; i < 5; i++) {
									        if (i < ${review_view.grade}) {
									            innerHtml += '<img src="images/ico/ico_star.gif"/>'
									        } else {
									            innerHtml += '<img src="images/ico/ico_star_off.gif"/>';
									        }
									    }
									    var star = document.getElementById('star${k}');
									    star.innerHTML = innerHtml;
									</script>
										</p>
									</div>
								</div>

								<div class="hideArea">
									<div class="bodyArea">
										${review_view.content }
									</div>

									<!-- 답변 -->
									<div class="answer">
										<div class="inbox">
											<div class="aname">
												<p>담당자</p>
											</div>

											<div class="atxt">
												쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
												쟈뎅 커피를 사랑해주셔서 감사합니다. 앞으로도 노력하는 쟈뎅이 되겠습니다. 감사합니다.
											</div>
										</div>	
									</div>
									<!-- //답변 -->

									<div class="modify">
										<a href="review_modify_view?review_no=${review_view.review_no }&product_no=${review_view.product_no}">수정</a>
										<a href="review_delete?review_no=${review_view.review_no }&product_no=${review_view.product_no}">삭제</a>
									</div>

								</div>
							</li>
							<!-- //반복 -->

						</ul>
					</div>
					</c:forEach>

				
						<div class="btnAreaList">
						<!-- 페이징이동1 -->
				<div class="allPageMoving1">

						<a href="detail?curPage2=1&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${rDto.getPrev_page2()}">
						
           				 <a href="detail?curPage2=${rDto.getStart_page2()-1}&search=${sv.search}&product_no=${sv.product_no}&initVal=3" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${rDto.getStart_page2()}" end="${rDto.getEnd_page2()}" step="1" var="index">
            				<c:if test="${rDto.getCurPage2() eq index}">
               				<a  href="detail?curPage2=${index}&search=${sv.search}&product_no=${sv.product_no}&initVal=2 " style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${rDto.getCurPage2() ne index}">
              				 <a href="detail?curPage2=${index}&search=${sv.search}&product_no=${sv.product_no}&initVal=2">${index}</a>
              			
           	
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${rDto.getNext_page2()}">
            				<a href="detail?curPage2=${rDto.getEnd_page2()+1}&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="detail?curPage2=${rDto.getPage_cnt2()}&search=${sv.search}&product_no=${sv.product_no}&initVal=2" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						
					</div>
						<!-- //페이징이동1 -->
					</div>
				<!-- //상품리뷰 -->

				</div>
				<!-- //goods review -->


				<!-- goods qna -->
					<div class="goodsQna disnone">
						<div class="headTitle depth">
							<strong>질문과 답변&nbsp;</strong>상품과 관련된 문의와 답변을 하는 공간입니다.
							<p class="btn"><a href="inquiry_view?product_no=${detail.product_no }" class="popBtn">문의하기</a></p>
						</div>

						<!-- 질문과 답변 -->
					<c:forEach var="qna_view" items="${qna_view }">
						<div class="accordion">
							<ul>
								<li>
									<div class="headArea">
										<div class="subject">
											<a href="javascript:;" class="accbtn">${qna_view.title }</a>
										</div>
										<div class="writer">${qna_view.id }</div>
										<div class="day">
											<p>${qna_view.qna_date }</p>
											<p><span class="nbtnMini iw70">답변대기</span></p>
										</div>
									</div>

									<div class="hideArea">
										<div class="bodyArea">
											${qna_view.content }
										</div>

										<div class="modify">
											<a href="qna_modify_view?qna_no=${qna_view.qna_no }&product_no=${detail.product_no}">수정</a>
											<a href="qna_delete?qna_no=${qna_view.qna_no }&product_no=${detail.product_no}">삭제</a>
											        
										</div>
									</div>
								</li>

								

							</ul>
								</c:forEach> 
									
						</div>
								<div class="btnAreaList">
						<!-- //질문과 답변 -->

						<!-- 페이징이동1 -->
						<div class="allPageMoving1">

						<a href="detail?curPage=1&search=${sv.search}&product_no=${sv.product_no}&initVal=3" class="n"><img src="images/btn/btn_pre2.gif" alt="처음으로"/></a>
						<c:if test="${qDto.getPrev_page()}">
						
           				 <a href="detail?curPage=${qDto.getStart_page()-1}&search=${sv.search}&product_no=${sv.product_no}&initVal=3" class="pre"><img src="images/btn/btn_pre1.gif" alt="앞페이지로"/></a>
         					</c:if>
         					
						 <c:forEach begin="${qDto.getStart_page()}" end="${qDto.getEnd_page()}" step="1" var="index">
            				<c:if test="${qDto.getCurPage() eq index}">
               				<a  href="detail?curPage=${index}&search=${sv.search}&product_no=${sv.product_no}&initVal=3 " style="color:#f7703c; border-color:#f7703c;">${index}</a>
            				</c:if>
            				<c:if test="${qDto.getCurPage() ne index}">
              				 <a href="detail?curPage=${index}&search=${sv.search}&product_no=${sv.product_no}&initVal=3">${index}</a>
              			
           	
            				</c:if>
         					</c:forEach>
         					
         					<c:if test="${qDto.getNext_page()}">
            				<a href="detail?curPage=${qDto.getEnd_page()+1}&search=${sv.search}&product_no=${sv.product_no}&initVal=3" class="next"><img src="images/btn/btn_next1.gif" alt="뒤페이지로"/></a>
         					</c:if>
         					
						
						<a href="detail?curPage=${qDto.getPage_cnt()}&search=${sv.search}&product_no=${sv.product_no}&initVal=3" class="n"><img src="images/btn/btn_next2.gif" alt="마지막페이지로"/></a>

						
					</div>
							
							<!-- //페이징이동1 -->
						</div>
					</div>
				<!-- //goods qna -->


				<!-- goods notice -->
					<div class="goodsNotice disnone">
						<div class="headTitle depth">
							<strong>정책 및 공지&nbsp;</strong>주문 전 필독 사항입니다.
						</div>

						<div class="detailDiv">
						<table summary="정책 및 공지 알림 게시판으로 회원가입안내, 주문안내, 결제안내, 배송안내, 교환/반품안내, 환불안내 순으로 조회 하실수 있습니다. " class="detailTable" border="1" cellspacing="0">
							<caption>정책 및 공지</caption>
							<colgroup>
							<col width="22%" class="tw30" />
							<col width="*" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row"><span>회원가입<br/>안내</span></th>
									<td>
										<ul>
											<li>저희 쇼핑몰은 회원제로 운영합니다.</li>
											<li>회원가입비나 월회비, 연회비 등 어떠한 비용도 청구하지 않는 100% 무료입니다.</li>
											<li>회원님들께는 구매 시 포인트 혜택을 드립니다.</li>
										</ul>
									</td>
								</tr>

								<tr>
									<th scope="row"><span>주문 안내</span></th>
									<td>
										<ul>
											<li>Step 1 : 상품 검색</li>
											<li>Step 2 : 장바구니에 담기</li>
											<li>Step 3 : 회원 ID 로그인 또는 비회원으로 주문하기</li>
											<li>Step 4 : 주문 성공 화면(주문번호)</li>
										</ul>

										<p class="fn12">※비회원 주문인 경우 주문번호와 승인번호(카드 결제 시)를 꼭 메모해 두시기 바랍니다.<br/>&nbsp;&nbsp;&nbsp;단, 회원의 경우 자동으로 저장되므로 따로 관리하실 필요가 없습니다.</p>
									</td>
								</tr>
								
								<tr>
									<th scope="row"><span>결제 안내</span></th>
									<td>
										<ul>
											<li>카드 결제나 무통장 입금을 하시는 경우 입금/결제 확인 후 상품이 배송됩니다.</li>
											<li>무통장 입금 시 주문자와 입금자가 다른 경우 배송이 지연될 수 있습니다. 게시판에 정보를 남겨주셔야 합니다. </li>
										</ul>
									</td>
								</tr>
								
								<tr>
									<th scope="row"><span>배송 안내</span></th>
									<td>
										<ul>
											<li>배송 방법 : 택배</li>
											<li>배송 지역 : 전국 지역 (제주 도서/산간지역 별도)</li>
											<li>배송 비용 : 총 결제금액이 100,000원 미만일 경우 2,500원 추가됩니다.</li>
											<li>배송 안내 : 재고가 없거나 재입고 될 경우 7~14일이 소요됩니다.</li>
										</ul>
									</td>
								</tr>

								<tr>
									<th scope="row"><span>교환/반품<br/>안내</span></th>
									<td>
										<ul>
											<li>저희 쇼핑몰은 교환/반품 정책을 운영하고 있습니다.</li>
											<li>사이즈 교환에 한하여는 1회 교환이 가능합니다. (단, 택배비는 고객 부담입니다.)</li>
											<li>교환 시 제품을 수령한 날로부터 24시간 이내 1:1문의 게시판 혹은 고객센터로 연락을 주시고 3일 이내에 보내주신 상품에 한하여 교환됩니다.</li>
											<li>제품에 하자가 있는 경우에는 동일 사이즈, 동일 디자인으로 재교환 해 드립니다.</li>
										</ul>
									</td>
								</tr>

								<tr>
									<th scope="row"><span>환불 안내</span></th>
									<td>
										<ul>
											<li>환불 시 반품 확인 여부를 확인 한 후 3일 이내에 결제금액을 환불해 드립니다.</li>
											<li>신용카드로 결제하신 경우, 신용카드 승인을 취소하면 결제 대금이 청구되지 않습니다. </li>
										</ul>
									</td>
								</tr>
							</tbody>
						</table>
						</div>
					</div>
				<!-- //goods notice -->


			</div>
		<!-- //detail content -->








<script type="text/javascript" src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="css/jquery.fancybox-1.3.4.css" />
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<style type="text/css">
.ui-corner-all{border-bottom-right-radius:0 !important; border-bottom-left-radius:0 !important; border-top-left-radius:0 !important; border-top-right-radius:0 !important;}
.ui-widget-content{border:0;}
.ui-spinner-input{width:70px; margin:0; border:1px #ddd solid; padding:2px 0 2px 5px; font-family:'Nanum Gothic' !important; font-size:12px !important;}
</style>

<script type="text/javascript">
$(document).ready(function() {

	// spinner
	var spinner = $( "#spinner" ).spinner({ min: 1 });
	

	// rolling
	function widthChk(){
		var winWidth = $(window).width();
		if(winWidth > 983){var twidth = 348;
		}else if(winWidth < 983 && winWidth > 767){var twidth = 298;
		}else{var twidth = 248;}
		return twidth
	}

	function slideChk(){
		var ulchk = widthChk() * $(".img ul li").size();
		$(".img ul").css("width",ulchk);
	}
	
	$(".thum ul li").click(function(){
		var winWidth = $(window).width();
		var thumNum = $(".thum ul li").index(this);	
		var ulLeft = widthChk() * thumNum ;
		$(".thum ul li").removeClass("hover");
		$(this).addClass("hover");
		$(".img ul").stop().animate({"left": - ulLeft}, 500);
	});
	

	// goods relation last margin
	function relationChk(){
		var winWidth = $(window).width();
		if(winWidth > 767){
			$(".relationList li").css("margin","0 20px 0 0");
			$(".relationList li:eq(4)").css("margin","0");
		}else if(winWidth < 768 && winWidth > 360){
			$(".relationList li").css("margin","0 10px 10px 0");
			$(".relationList li:eq(4)").css("margin","0");
		}else{
			$(".relationList li").css("margin","0 10px 10px 0");
			$(".relationList li:nth-child(2n)").css("margin","0 0 10px 0");
		}
	}

	// layer popup
	var winWidth = $(window).width();
	if(winWidth > 767){
		var layerCheck = 540;
		var popCheck = 768;
	}else{
		var layerCheck = 320;
		var popCheck = 320;
	}
	$(".passbtn").fancybox({
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

	$(".popBtn").fancybox({
		'autoDimensions'    : false,
		'showCloseButton'	: false,
		'width' : popCheck,
		'padding' : 0,
		'type'			: 'iframe',
		'onComplete' : function() {
			$('#fancybox-frame').load(function() { // wait for frame to load and then gets it's height
			$('#fancybox-content').height($(this).contents().find('body').height());
			});
		}
	});


	// resize
	$(window).resize(function(){
		$(".thum ul li:eq(0)").click();
		slideChk();
		relationChk();
	});


	$(".thum ul li:eq(0)").click();
	slideChk();
	relationChk();

});
</script>




		</div>
		<!-- //maxcontents -->

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
				<div id="flogo"><img src="images/txt/flogo.gif" alt="JARDIN THE COFFEE CREATOR, SINCE 1984" /></div>
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

				<div id="inicis"><img src="images/ico/ico_inicis.png" alt="이니시스 결제시스템" /></div>
			</div>
		</div>
	</div>



</div>
</div>



</body>
</html>