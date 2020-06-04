<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		
		<div id="snbBox">
			<h1><img src="images/txt/logo.gif" alt="JARDIN SHOP" /></h1>
			<div id="quickmenu">
				<div id="mnaviOpen"><img src="images/btn/btn_mnavi.gif" width="33" height="31" alt="메뉴열기" /></div>
				<div id="mnaviClose"><img src="images/btn/btn_mnavi_close.gif" width="44" height="43" alt="메뉴닫기" /></div>
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
					<input type="image" src="images/btn/btn_main_search.gif" width="23" height="20" alt="검색하기" />
				</div>
			</div>
		</div>
	</div>


	<!-- GNB -->
	<div id="gnb">
		
		<div id="top">
			<ul>
		<c:forEach var="CategoryDto" items="${categoryList }">
				<li class="brand t1"><a href="#" id="topNavi1">${CategoryDto.name }</a>
				</c:forEach>
					<ul id="topSubm1">
						<c:forEach var="SubCategoryDto" items="${SubCategoryList }">
						<li><a href="#">${SubCategoryDto.name }</a></li>
						</c:forEach>
					</ul>
				</li>
	
		</div>

		<script type="text/javascript">initTopMenu();</script>
	</div>
	<!-- //GNB -->

</body>
</html>