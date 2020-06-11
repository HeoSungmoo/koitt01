package com.koitt.jardin.dao.board;

import java.util.List;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.board.PageNationDTO;
import com.koitt.jardin.dto.board.SearchValue;

public interface BoardDAO {

	// 공지사항 글 리스트
	public List<NoticeDTO> notice();

	// 공지사항 검색
	public List<NoticeDTO> noticeSearch(SearchValue sv);

	// 공지사항 글 보기
	public NoticeDTO noticeView(int no);

	// 공지사항 조회수
	public void noticeViewHit(int rnum);

	// 공지사항 글보기 이전 글
	public NoticeDTO noticeViewPre(int no);
	// 공지사항 글보기 다음 글

	public NoticeDTO noticeViewNext(int no);

	// 1:1문의
	public void inquiry();

	// FAQ전체 리스트
	public List<FaqDTO> faq();

	// FAQ회원가입 리스트
	public List<FaqDTO> faqJoin();

	// FAQ상품 리스트
	public List<FaqDTO> faqProduct();

	// FAQ주문 리스트
	public List<FaqDTO> faqOrder();

	// FAQ검색
	public List<FaqDTO> faqSearch(String search);

	// 이용안내
	public GuideDTO guide();

	// 공지사항 페이지네이션
	public PageNationDTO pageNation();

	public List<PageNationDTO> pageNationList(int curPage);

}
