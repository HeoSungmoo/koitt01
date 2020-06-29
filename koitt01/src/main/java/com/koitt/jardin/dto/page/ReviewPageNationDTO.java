package com.koitt.jardin.dto.page;

public class ReviewPageNationDTO {

	private int page_size = 2; // 한 페이지에 담을 게시글 수
	private int range_size = 5;// 한 블럭 에 담을 페이지 수
	private int curPage2; // 현재 페이지 위치
	private int cur_range2; // 현재 블럭 위치
	private int listCnt; // 게시글 수
	private int page_cnt2; // 페이지 수
	private int range_cnt2; // 블럭 수
	private int start_page2; // 현재 블럭 시작 페이지
	private int end_page2; // 현재 블럭 끝 페이지
	private boolean prev_page2; // 이전 블럭 버튼
	private boolean next_page2; // 다음 블럭 버튼

	// 이전 페이지, 다음 페이지 설정
	public void prevnext2(int curPage2) {
		if (getRange_cnt2() == 1) {
			setPrev_page2(false);
			setNext_page2(false);
		} else if (curPage2 > 0 && curPage2 < 6) {
			setPrev_page2(false);
			setNext_page2(true);
		} else if (getRange_cnt2() * 10 - 10 < curPage2) {
			setPrev_page2(true);
			setNext_page2(false);
		} else {
			setPrev_page2(true);
			setNext_page2(true);
		}
	}

	public void setStart_page2(int start_page2) {
		this.start_page2 = start_page2;
	}

	public void setEnd_page2(int end_page2) {
		this.end_page2 = end_page2;
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

	public int getCurPage2() {
		return curPage2;
	}

	public void setCurPage2(int curPage2) {
		this.curPage2 = curPage2;
	}

	public int getCur_range2() {
		return cur_range2;
	}

	public void setCur_range2(int curPage2) {
		if (curPage2 % 5 == 0) {
			this.cur_range2 = curPage2 / 5;
		} else {
			this.cur_range2 = curPage2 / 5 + 1;
		}
	}

	public int getListCnt() {
		return listCnt;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public int getPage_cnt2() {
		return page_cnt2;
	}

	// 게시판 페이지 갯수
	public void setPage_cnt2(int listCnt) {
		if (listCnt % 2 == 0) {
			this.page_cnt2 = listCnt / 2;
		} else {
			this.page_cnt2 = listCnt / 2 + 1;
		}
	}

	public int getRange_cnt2() {
		return range_cnt2;
	}

	public void setRange_cnt2(int page_cnt2) {
		if (page_cnt2 % 5 == 0) {
			this.range_cnt2 = page_cnt2 / getRange_size();
		} else {
			this.range_cnt2 = page_cnt2 / getRange_size() + 1;
		}
	}

	public int getStart_page2() {
		return start_page2;
	}

	public void setStart_page2(int cur_range2, int range_size) {
		this.start_page2 = ((cur_range2 - 1) * range_size) + 1;

	}

	public int getEnd_page2() {
		return end_page2;
	}

	public void setEnd_page2(int cur_range2, int range_cnt2) {
		if (cur_range2 == range_cnt2) {
			this.end_page2 = getPage_cnt2();
		} else {
			this.end_page2 = cur_range2 * 5;
		}
	}

	public boolean getPrev_page2() {
		return prev_page2;
	}

	public void setPrev_page2(boolean prev_page2) {
		this.prev_page2 = cur_range2 == 1 ? false : true;
	}

	public boolean getNext_page2() {
		return next_page2;
	}

	public void setNext_page2(boolean next_page2) {
		this.next_page2 = cur_range2 == range_cnt2 ? false : true;
	}

}