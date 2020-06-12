package com.koitt.jardin.dao.community;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.community.PreUserReviewDTO;
import com.koitt.jardin.dto.page.ExprPageNationDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;

@Repository
public class CommunityDAOImpl implements CommunityDAO {

	@Autowired
	SqlSession sqlSession;

	// 체험단 글 리스트
//	@Override
//	public List<PreUserDTO> expr() {
//
//		return sqlSession.selectList("community.expr");
//	}

	// 체험단 글 보기 리뷰
	@Override
	public PreUserDTO exprReview(int preUserNo) {
		PreUserDTO pd = sqlSession.selectOne("community.exprReview", preUserNo);
		return sqlSession.selectOne("community.exprReview", preUserNo);
	}

	// 체험단 글 보기 뷰
	@Override
	public PreUserDTO exprView(int preuser_no) {

		return sqlSession.selectOne("community.exprView", preuser_no);
	}

	// 체험단 리뷰 글 쓰기
	@Override
	public void preUserReview(int preUserApplyNo) {
		sqlSession.insert("community.preUserReview", preUserApplyNo);

	}

	// 체험단 신청 글쓰기
	@Override
	public void preUserApply(int preuser_no) {
		sqlSession.insert("community.preUserApply", preuser_no);

	}

	// 이용후기 글 리스트
	@Override
	public List<PreUserReviewDTO> epilogue() {

		return sqlSession.selectList("community.epilogue");
	}

	// 이용후기 글 보기
	@Override
	public ReviewDTO epilogueView(int review_no) {
		ReviewDTO rd = sqlSession.selectOne("epilogueView", review_no);
		System.out.println(rd.getReview_date());
		System.out.println(rd.getGrade());
		System.out.println(rd.getContent());
		return sqlSession.selectOne("epilogueView", review_no);
	}

	// 인조이 커피 글 리스트
	@Override
	public List<EnjoyCoffDTO> enjoyCoffee() {

		return sqlSession.selectList("community.enjoyCoffee");
	}

	// 인조이 커피 글 보기
	@Override
	public EnjoyCoffDTO enjoyView(int no) {

		return sqlSession.selectOne("community.enjoyView", no);
	}

	// 체험단 페이징------------------------------------------------------------------
	// 페이징 게시글 수
	@Override
	public ExprPageNationDTO exprPageNation() {
		return sqlSession.selectOne("community.exprPageNation");
	}

	// 체험단 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> exprPageNationList(int curPage) {
		return sqlSession.selectList("community.exprPageNationList", curPage);
	}

}
