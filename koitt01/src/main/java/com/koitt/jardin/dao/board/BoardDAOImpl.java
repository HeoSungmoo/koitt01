package com.koitt.jardin.dao.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.member.InquiryDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.search.SearchValue;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	SqlSession sqlSession;

	// 공지사할 글 리스트 가져오기

	// 공지사항 글 보기
	@Override
	public NoticeDTO noticeView(int no) {
//		sqlSession.update("board.noticeViewHit", No);
		return sqlSession.selectOne("board.noticeView", no);
	}

	// 공지사항 글보기 이전글
	@Override
	public NoticeDTO noticeViewPre(int no) {

		return sqlSession.selectOne("board.noticeViewPre", no);
	}

	// 공지사항 글보기 다음글
	@Override
	public NoticeDTO noticeViewNext(int no) {

		return sqlSession.selectOne("board.noticeViewNext", no);
	}

	// 공지사항 조회수
	@Override
	public void noticeViewHit(int rnum) {
		sqlSession.update("board.noticeViewHit", rnum);

	}

	// 1:1문의 글 쓰기
	@Override
	public void inquiryWrite(InquiryDTO iDto) {
		if(iDto.getFile_name()==null){
			System.out.println("보드 DAO 파일첨부 안함");
			sqlSession.insert("board.inquiryWriteNonF", iDto);
		}else {
		System.out.println("보드 DAO 파일첨부");
		sqlSession.insert("board.inquiryWrite", iDto);
		}
	}

	// FAQ검색
	public List<FaqDTO> faqSearch(String search) {
		return sqlSession.selectList("board.faqSearch", search);
	}

	// 이용안내 글 가져오기
	@Override
	public GuideDTO guide() {

		return sqlSession.selectOne("board.guide");
	}

//공지사항 페이징------------------------------------------------------------------

	@Override
	public PageNationDTO pageNation(SearchValue sv) {
		PageNationDTO pDto = null;

		if (sv.getOption().equals("")) { // 검색 안했을 경우
			pDto = sqlSession.selectOne("board.pageNation", sv);
			System.out.println();
		} else if (sv.getOption().equals("title")) { // 제목검색

			pDto = sqlSession.selectOne("board.noticeSearchCN", sv);

		} else if (sv.getOption().equals("content")) { // 내용검색
			pDto = sqlSession.selectOne("board.noticeSearchTN", sv);
		}
		return pDto;

	}

	// 페이징 글 리스트 가져오기
	@Override
	public List<NoticeDTO> pageNationList(SearchValue sv) {

		List<NoticeDTO> nDto = null;
		if (sv.getOption().equals("")) { // 검색 안했을 경우
			nDto = sqlSession.selectList("board.pageNationList", sv);

		} else if (sv.getOption().equals("title")) { // 제목검색

			nDto = sqlSession.selectList("board.noticeSearchT", sv);

		} else if (sv.getOption().equals("content")) { // 내용검색
			nDto = sqlSession.selectList("board.noticeSearchC", sv);
		}
		return nDto;

	}

//FAQ 페이징------------------------------------------------------------------
	// 페이징 게시글 수
	@Override
	public PageNationDTO faqPageNation(SearchValue sv) {
		PageNationDTO pDto = new PageNationDTO();
System.out.println("왜 안되는거지");
		if (sv.getCategory().equals("")) {
			pDto = sqlSession.selectOne("board.faqPageNation", sv);
		} else if (sv.getCategory().equals("교환반품")) {
			pDto = sqlSession.selectOne("board.faqJoinPageNation", sv);
		} else if (sv.getCategory().equals("취소환불")) {
			pDto = sqlSession.selectOne("board.faqProductPageNation", sv);
		} else if (sv.getCategory().equals("주문결제")) {
			pDto = sqlSession.selectOne("board.faqOrderPageNation", sv);
		}
		System.out.println("faq글 리스트 개수" + pDto.getListCnt());
		return pDto;
	}

	// 페이징 글 리스트 가져오기
	@Override
	public List<FaqDTO> faqPageNationList(SearchValue sv) {
		List<FaqDTO> pDto = null;
		if (sv.getCategory().equals("")) {
			pDto = sqlSession.selectList("board.faqPageNationList", sv);
		} else if (sv.getCategory().equals("교환반품")) {
			pDto = sqlSession.selectList("board.faqJoinPageNationList", sv);
		} else if (sv.getCategory().equals("취소환불")) {
			pDto = sqlSession.selectList("board.faqProductPageNationList", sv);
		} else if (sv.getCategory().equals("주문결제")) {
			pDto = sqlSession.selectList("board.faqOrderPageNationList", sv);
		}
		return pDto;

	}

}
