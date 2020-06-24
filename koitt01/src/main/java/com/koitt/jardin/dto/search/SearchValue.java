package com.koitt.jardin.dto.search;

public class SearchValue {

	int curPage = 1;
	int no;
	int preuser_no;
	String option = "";
	String search = "";
	String category = "";

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
