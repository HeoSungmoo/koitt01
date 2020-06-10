package com.koitt.jardin.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.board.BoardDAO;
import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.board.PageNationDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;

	// 공지사항 글 리스트
	@Override
	public List<NoticeDTO> notice() {

		return boardDao.notice();

	}

	// 공지사항 검색
	@Override
	public List<NoticeDTO> noticeSearch(String option, String search) {

		return boardDao.noticeSearch(option, search);
	}

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

	// 페이지 네이션
	@Override
	public List<PageNationDTO> pageNationList(int curPage) {

		return boardDao.pageNationList(curPage);

	}

	@Override
	public PageNationDTO pageNation(int curPage) {
		System.out.println("서비스 현재페이지" + curPage);
		PageNationDTO pDto = boardDao.pageNation();
		pDto.setCur_page(curPage);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCur_page(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

}
