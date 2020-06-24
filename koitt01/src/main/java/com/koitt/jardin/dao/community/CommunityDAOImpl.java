package com.koitt.jardin.dao.community;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.EpilogueDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.community.PreUserReviewDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

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
	public void preUserApply(PreUserApplyDTO pDto) {
		sqlSession.insert("community.preUserApply", pDto);

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

	// enjoy 페이징------------------------------------------------------------------
	// enjoy 페이징 게시글 수
	@Override
	public PageNationDTO enjoyPageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			System.out.println("enjoy 리스트 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.enjoyPageNation", sv);
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.enjoyPageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.enjoyPageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.enjoyPageNationCo", sv);
		}

		return pDto;

	}

	// enjoy 페이징 글 리스트 가져오기
	@Override
	public List<EnjoyCoffDTO> enjoyPageNationList(SearchValue sv) {
		List<EnjoyCoffDTO> eDto = null;
		if (sv.getOption().equals("")) {
			System.out.println("그냥 리스트 출력으로 들어옴");
			System.out.println("enjoy 리스트 개수 출력으로 들어옴");
			eDto = sqlSession.selectList("community.enjoyPageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.enjoyPageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.enjoyPageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.enjoyPageNationCoList", sv);
		}
		return eDto;
	}

	// 체험단 페이징------------------------------------------------------------------
	// 체험단 페이징 게시글 수
	@Override
	public PageNationDTO exprPageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			System.out.println("expr 리스트 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.exprPageNation", sv);
			System.out.println("게시글 수" + pDto.getListCnt());
			System.out.println("페이지 수" + pDto.getPage_cnt());
			System.out.println("블록 수" + pDto.getRange_cnt());
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.exprPageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.exprPageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("community.exprPageNationCo", sv);
		}

		return pDto;

	}

	// 체험단 페이징 글 리스트 가져오기
	@Override
	public List<PreUserDTO> exprPageNationList(SearchValue sv) {
		List<PreUserDTO> eDto = null;
		if (sv.getOption().equals("")) {
			System.out.println("expr 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.exprPageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.exprPageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.exprPageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("community.exprPageNationCoList", sv);
		}
		return eDto;
	}

	// 포토 이용후기 페이징------------------------------------------------------------------
	// 이용후기 페이징 게시글 수
	@Override
	public PageNationDTO epiloguePageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			pDto = sqlSession.selectOne("community.epiloguePageNation", sv);
		} else if (sv.getOption().equals("total")) {
			pDto = sqlSession.selectOne("community.epiloguePageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			pDto = sqlSession.selectOne("community.epiloguePageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			pDto = sqlSession.selectOne("community.epiloguePageNationCo", sv);
		}
		return pDto;
	}

	// 이용후기 페이징 글 리스트 가져오기
	@Override
	public List<EpilogueDTO> epiloguePageNationList(SearchValue sv) {

		List<EpilogueDTO> eDto = null;
		if (sv.getOption().equals("")) {
			eDto = sqlSession.selectList("community.epiloguePageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			eDto = sqlSession.selectList("community.epiloguePageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			eDto = sqlSession.selectList("community.epiloguePageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			eDto = sqlSession.selectList("community.epiloguePageNationCoList", sv);
		}
		return eDto;
	}

	// 이용후기 페이징------------------------------------------------------------------
	// 이용후기 페이징 게시글 수
	@Override
	public PageNationDTO commentPageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			pDto = sqlSession.selectOne("community.commentPageNation", sv);
		} else if (sv.getOption().equals("total")) {
			pDto = sqlSession.selectOne("community.commentPageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			pDto = sqlSession.selectOne("community.commentPageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			pDto = sqlSession.selectOne("community.commentPageNationCo", sv);
		}
		return pDto;
	}

	// 이용후기 페이징 글 리스트 가져오기
	@Override
	public List<EpilogueDTO> commentPageNationList(SearchValue sv) {

		List<EpilogueDTO> eDto = null;
		if (sv.getOption().equals("")) {
			eDto = sqlSession.selectList("community.commentPageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			eDto = sqlSession.selectList("community.commentPageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			eDto = sqlSession.selectList("community.commentPageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			eDto = sqlSession.selectList("community.commentPageNationCoList", sv);
		}
		return eDto;
	}
}
