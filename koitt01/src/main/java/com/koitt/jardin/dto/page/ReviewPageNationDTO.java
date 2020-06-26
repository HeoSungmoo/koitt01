package com.koitt.jardin.dto.page;

public class ReviewPageNationDTO {

	private int page_size = 2; // 한 페이지에 담을 게시글 수
	private int range_size = 5;// 한 블럭 에 담을 페이지 수
	private int curPage; // 현재 페이지 위치
	private int curPage1;
	private int cur_range; // 현재 블럭 위치
	private int listCnt; // 게시글 수
	private int page_cnt; // 페이지 수
	private int range_cnt; // 블럭 수
	private int start_page; // 현재 블럭 시작 페이지
	private int end_page; // 현재 블럭 끝 페이지
	private boolean prev_page; // 이전 블럭 버튼
	private boolean next_page; // 다음 블럭 버튼
	private String m_id; // 내 게시글만 보기 위한 아이디
	private String category; // (상품)카테고리
	private String keyword; // (상품)검색어

	// 이전 페이지, 다음 페이지 설정
	public void prevnext(int curPage) {
		if (getRange_cnt() == 1) {
			setPrev_page(false);
			setNext_page(false);
		} else if (curPage > 0 && curPage < 6) {
			setPrev_page(false);
			setNext_page(true);
		} else if (getRange_cnt() * 5 - 5 < curPage) {
			setPrev_page(true);
			setNext_page(false);
		} else {
			setPrev_page(true);
			setNext_page(true);
		}
	}

	public int getCurPage1() {
		return curPage1;
	}

	public void setCurPage1(int curPage1) {
		this.curPage1 = curPage1;
	}

	public int getCurpage1() {
		return curPage1;
	}

	public void setCurpage1(int curpage1) {
		this.curPage1 = curpage1;
	}

	public void setStart_page(int start_page) {
		this.start_page = start_page;
	}

	public void setEnd_page(int end_page) {
		this.end_page = end_page;
	}

	public int getPage_size() {
		return page_size;
	}

	public void setPage_size(int page_size) {
		this.page_size = page_size;
	}

	public int getRange_size() {
		return range_size;
	}

	public void setRange_size(int range_size) {
		this.range_size = range_size;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getCur_range() {
		return cur_range;
	}

	public void setCur_range(int curPage) {
		if (curPage % 5 == 0) {
			this.cur_range = curPage / 5;
		} else {
			this.cur_range = curPage / 5 + 1;
		}
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getPage_cnt() {
		return page_cnt;
	}

	// 게시판 페이지 갯수
	public void setPage_cnt(int listCnt) {
		if (listCnt % 2 == 0) {
			this.page_cnt = listCnt / 2;
		} else {
			this.page_cnt = listCnt / 2 + 1;
		}
	}

	public int getRange_cnt() {
		return range_cnt;
	}

	public void setRange_cnt(int page_cnt) {
		if (page_cnt % 5 == 0) {
			this.range_cnt = page_cnt / getRange_size();
		} else {
			this.range_cnt = page_cnt / getRange_size() + 1;
		}
	}

	public int getStart_page() {
		return start_page;
	}

	public void setStart_page(int cur_range, int range_size) {
		this.start_page = ((cur_range - 1) * range_size) + 1;

	}

	public int getEnd_page() {
		return end_page;
	}

	public void setEnd_page(int cur_range, int range_cnt) {
		if (cur_range == range_cnt) {
			this.end_page = getPage_cnt();
		} else {
			this.end_page = cur_range * 5;
		}
	}

	public boolean getPrev_page() {
		return prev_page;
	}

	public void setPrev_page(boolean prev_page) {
		this.prev_page = prev_page;
	}

	public boolean getNext_page() {
		return next_page;
	}

	public void setNext_page(boolean next_page) {
		this.next_page = next_page;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}