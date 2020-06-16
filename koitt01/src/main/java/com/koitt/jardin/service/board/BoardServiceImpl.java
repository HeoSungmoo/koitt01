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

	// 공지사항 글 리스트
	@Override
	public List<NoticeDTO> notice() {

		return boardDao.notice();

	}

	// 공지사항 검색
	@Override
	public List<NoticeDTO> noticeSearch(SearchValue sv) {

		return boardDao.noticeSearch(sv);
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
//공지사항 페이징------------------------------------------------------------------

	// 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> pageNationList(int curPage) {
		return boardDao.pageNationList(curPage);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO pageNation(int curPage) {
		PageNationDTO pDto = boardDao.pageNation();
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

//FAQ 페이징------------------------------------------------------------------
	// 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> faqPageNationList(int curPage) {
		return boardDao.faqPageNationList(curPage);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO faqPageNation(int curPage) {
		PageNationDTO pDto = boardDao.faqPageNation();
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// faqJoin 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> faqJoinPageNationList(int curPage) {
		return boardDao.faqJoinPageNationList(curPage);
	}

	// faqJoin 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO faqJoinPageNation(int curPage) {
		PageNationDTO pDto = boardDao.faqJoinPageNation();
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// faqProduct 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> faqProductPageNationList(int curPage) {
		return boardDao.faqProductPageNationList(curPage);
	}

	// faqProduct 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO faqProductPageNation(int curPage) {
		PageNationDTO pDto = boardDao.faqProductPageNation();
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// faqOrder 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> faqOrderPageNationList(int curPage) {
		return boardDao.faqOrderPageNationList(curPage);
	}

	// faqOrder 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO faqOrderPageNation(int curPage) {
		PageNationDTO pDto = boardDao.faqOrderPageNation();
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}
//FAQ 페이징------------------------------------------------------------------
}
