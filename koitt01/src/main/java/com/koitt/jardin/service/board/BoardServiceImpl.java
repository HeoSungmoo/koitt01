package com.koitt.jardin.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.board.BoardDAO;
import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.search.SearchValue;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;

	// 공지사항 글 보기
	@Override
	public NoticeDTO noticeView(int no) {
		return boardDao.noticeView(no);
	}

	@Override
	public NoticeDTO noticeViewPre(int no) {
		return boardDao.noticeViewPre(no);
	}

	@Override
	public NoticeDTO noticeViewNext(int no) {
		return boardDao.noticeViewNext(no);
	}

	// 공지사항 조회수
	@Override
	public void noticeViewHit(int rnum) {
		boardDao.noticeViewHit(rnum);

	}

	// 1:1문의
	@Override
	public void inquiry() {
		boardDao.inquiry();

	}

	// FAQ 전체 리스트
	@Override
	public List<FaqDTO> faq() {

		return boardDao.faq();
	}

	// FAQ 회원가입 리스트
	@Override
	public List<FaqDTO> faqJoin() {

		return boardDao.faqJoin();
	}

	// FAQ 상품 리스트
	@Override
	public List<FaqDTO> faqProduct() {

		return boardDao.faqProduct();
	}

	// FAQ 주문 리스트
	@Override
	public List<FaqDTO> faqOrder() {

		return boardDao.faqOrder();
	}

	// FAQ 검색
	@Override
	public List<FaqDTO> faqSearch(String search) {
		return boardDao.faqSearch(search);

	}

	// 이용안내
	@Override
	public GuideDTO guide() {

		return boardDao.guide();
	}
//공지사항 페이징------------------------------------------------------------------

	// 페이징 글 리스트 가져오기
	@Override
	public List<NoticeDTO> pageNationList(SearchValue sv) {
		return boardDao.pageNationList(sv);
	}

	// 페이지 글 게시글 수 가져오기
	@Override
	public PageNationDTO pageNation(SearchValue sv) {
		PageNationDTO pDto = boardDao.pageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

//FAQ 페이징------------------------------------------------------------------
	// FAQ페이징 글 리스트 가져오기
	@Override
	public List<FaqDTO> faqPageNationList(SearchValue sv) {
		return boardDao.faqPageNationList(sv);
	}

	// FAQ 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO faqPageNation(SearchValue sv) {
		PageNationDTO pDto = boardDao.faqPageNation(sv);

		System.out.println("pDto" + pDto.getListCnt());
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}
//FAQ 페이징------------------------------------------------------------------

}
