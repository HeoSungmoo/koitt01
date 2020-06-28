package com.koitt.jardin.dto.page;

public class PhotoReviewPageNationDTO {

	private int page_size = 2; // 한 페이지에 담을 게시글 수
	private int range_size = 5;// 한 블럭 에 담을 페이지 수
	private int curPage1; // 현재 페이지 위치
	private int cur_range1; // 현재 블럭 위치
	private int listCnt; // 게시글 수
	private int page_cnt1; // 페이지 수
	private int range_cnt1; // 블럭 수
	private int start_page1; // 현재 블럭 시작 페이지
	private int end_page1; // 현재 블럭 끝 페이지
	private boolean prev_page1; // 이전 블럭 버튼
	private boolean next_page1; // 다음 블럭 버튼


	// 이전 페이지, 다음 페이지 설정
	public void prevnext1(int curPage1) {
		if (getRange_cnt1() == 1) {
			setPrev_page1(false);
			setNext_page1(false);
		} else if (curPage1 > 0 && curPage1 < 6) {
			setPrev_page1(false);
			setNext_page1(true);
		} else if (getRange_cnt1() * 10 - 10 < curPage1) {
			setPrev_page1(true);
			setNext_page1(false);
		} else {
			setPrev_page1(true);
			setNext_page1(true);
		}
	}



	public void setStart_page1(int start_page1) {
		this.start_page1 = start_page1;
	}

	public void setEnd_page(int end_page1) {
		this.end_page1 = end_page1;
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

	public int getCurPage1() {
		return curPage1;
	}

	public void setCurPage1(int curPage1) {
		this.curPage1 = curPage1;
	}

	public int getCur_range1() {
		return cur_range1;
	}

	public void setCur_range1(int curPage1) {
		if (curPage1 % 5 == 0) {
			this.cur_range1 = curPage1 / 5;
		} else {
			this.cur_range1 = curPage1 / 5 + 1;
		}
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getPage_cnt1() {
		return page_cnt1;
	}

	// 게시판 페이지 갯수
	public void setPage_cnt1(int listCnt) {
		if (listCnt % 2 == 0) {
			this.page_cnt1 = listCnt / 2;
		} else {
			this.page_cnt1 = listCnt / 2 + 1;
		}
	}

	public int getRange_cnt1() {
		return range_cnt1;
	}

	public void setRange_cnt1(int page_cnt1) {
		if (page_cnt1 % 5 == 0) {
			this.range_cnt1 = page_cnt1 / getRange_size();
		} else {
			this.range_cnt1 = page_cnt1 / getRange_size() + 1;
		}
	}

	public int getStart_page1() {
		return start_page1;
	}

	public void setStart_page1(int cur_range1, int range_size) {
		this.start_page1 = ((cur_range1 - 1) * range_size) + 1;

	}

	public int getEnd_page1() {
		return end_page1;
	}

	public void setEnd_page1(int cur_range1, int range_cnt1) {
		if (cur_range1 == range_cnt1) {
			this.end_page1 = getPage_cnt1();
		} else {
			this.end_page1 = cur_range1 * 5;
		}
	}

	public boolean getPrev_page1() {
		return prev_page1;
	}

	public void setPrev_page1(boolean prev_page1) {
		this.prev_page1 = prev_page1;
	}

	public boolean getNext_page1() {
		return next_page1;
	}

	public void setNext_page1(boolean next_page1) {
		this.next_page1 = next_page1;
	}



}