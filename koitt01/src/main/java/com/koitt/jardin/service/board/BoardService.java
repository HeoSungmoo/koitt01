package com.koitt.jardin.service.board;

import java.util.List;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.board.PageNationDTO;

public interface BoardService {

	// 공지사항 글 리스트
	public List<NoticeDTO> notice();

	// 공지사항 검색
	public List<NoticeDTO> noticeSearch(String option, String search);

	// 공지사항 조회수
	public void noticeViewHit(int No);

	// 공지사항 글 보기
	public NoticeDTO noticeView(int no);

	// 공지사항 글보기 이전글
	public NoticeDTO noticeViewPre(int no);

	// 공지사항 글보기 이전글
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

	public PageNationDTO pageNation(int curPage);

	public List<PageNationDTO> pageNationList(int curPage);

}
