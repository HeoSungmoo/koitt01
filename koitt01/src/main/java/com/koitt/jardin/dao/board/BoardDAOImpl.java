package com.koitt.jardin.dao.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.board.PageNationDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	SqlSession sqlSession;

	// 공지사할 글 리스트 가져오기
	@Override
	public List<NoticeDTO> notice() {

		System.out.println(sqlSession.selectList("board.notice"));
		return sqlSession.selectList("board.notice");
	}

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

	// 공지사항 글 검색
	@Override
	public List<NoticeDTO> noticeSearch(String option, String search) {

		List<NoticeDTO> sList = null;

		if (option.equals("title")) {

			sList = sqlSession.selectList("board.noticeSearchT", search);
			System.out.println(sList.size());
		} else if (option.equals("content")) {
			sList = sqlSession.selectList("board.noticeSearchC", search);
			System.out.println(sList.size());
		}
		return sList;

	}

	// 공지사항 조회수
	@Override
	public void noticeViewHit(int rnum) {
		sqlSession.update("board.noticeViewHit", rnum);

	}

	// 1:1문의 글 쓰기
	@Override
	public void inquiry() {
		// TODO Auto-generated method stub

	}

	// FAQ 글 리스트 가져오기
	@Override
	public List<FaqDTO> faq() {
		return sqlSession.selectList("board.faq");

	}

	@Override
	public List<FaqDTO> faqJoin() {

		return sqlSession.selectList("board.faqJoin");
	}

	@Override
	public List<FaqDTO> faqProduct() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.faqProduct");
	}

	@Override
	public List<FaqDTO> faqOrder() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.faqOrder");
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

	// 공지사항 페이지네이션 게시글 수
	@Override
	public PageNationDTO pageNation() {
		return sqlSession.selectOne("board.pageNation");
	}

	// 공지사항 페이징 게시글 리스트
	@Override
	public List<PageNationDTO> pageNationList(int curPage) {
		System.out.println("서비스 현재페이지" + curPage);
		return sqlSession.selectList("board.pageNationList", curPage);

	}

}
