package com.koitt.jardin.dto.search;

public class SearchValue {

	int curPage = 1;
	int curPage1 = 1;
	int curPage2 = 1;
	int no;
	int preuser_no;
	String option = "";
	String search = "";
	String category = "";
	int review_no;
	int product_no;
	String category1 = "";
	String category2 = "";
	String selectPrice = "";

	public int getCurPage2() {
		return curPage2;
	}

	public void setCurPage2(int curPage2) {
		this.curPage2 = curPage2;
	}

	public String getSelectPrice() {
		return selectPrice;
	}

	public void setSelectPrice(String selectPrice) {
		this.selectPrice = selectPrice;
	}

	public int getCurPage1() {
		return curPage1;
	}

	public void setCurPage1(int curPage1) {
		this.curPage1 = curPage1;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getReview_no() {
		return review_no;
	}

	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPreuser_no() {
		return preuser_no;
	}

	public void setPreuser_no(int preuser_no) {
		this.preuser_no = preuser_no;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
