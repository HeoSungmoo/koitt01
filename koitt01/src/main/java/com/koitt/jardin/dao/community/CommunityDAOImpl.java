package com.koitt.jardin.dao.community;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.CommentDTO.CommentDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.EpilogueDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.community.PreUserReviewDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.product.UpdateReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

@Repository
public class CommunityDAOImpl implements CommunityDAO {

	@Autowired
	SqlSession sqlSession;

	// 체험단 글 보기 리뷰
	@Override
	public PreUserDTO exprReview(SearchValue sv) {
		return sqlSession.selectOne("expr.exprReview", sv);
	}

	// 체험단 글 보기 뷰
	@Override
	public PreUserDTO exprView(int preuser_no) {

		return sqlSession.selectOne("expr.exprView", preuser_no);
	}

	// 체험단 리뷰 글 쓰기
	@Override
	public void preUserReview(PreUserReviewDTO purDto) {
		sqlSession.insert("expr.preUserReview", purDto);

	}

	// 체험단 신청 글쓰기
	@Override
	public void preUserApply(PreUserApplyDTO pDto) {
		sqlSession.insert("expr.preUserApply", pDto);

	}

	// 이용후기 글 보기
	@Override
	public UpdateReviewDTO epilogueView(int review_no) {
		return sqlSession.selectOne("epilogue.epilogueView", review_no);
	}

	// 이용후기 글 삭제
	public void epilogueDelete(int review_no) {
		sqlSession.selectOne("epilogue.epilogueDelete", review_no);
	}

	// 이용후기 글 수정페이지로 이동
	@Override
	public void epilogueWrite(UpdateReviewDTO rDto) throws Exception {
		sqlSession.update("epilogue.epilogueUpdate", rDto);
	}

	// 포토상품후기 글쓰기
	@Override
	public void epilogueWrite2(UpdateReviewDTO rDto) throws Exception {
		sqlSession.insert("epilogue.epilogueWrite2", rDto);
	}

	// 이용후기 글 수정
	public UpdateReviewDTO epilogueUpdate(UpdateReviewDTO rDto) {
		return sqlSession.selectOne("epilogue.epilogueView", rDto);
	}

	// 이용후기 조회수
	@Override
	public void epilogueHit(SearchValue sv) {
		sqlSession.update("epilogue.epilogueHit", sv);

	}

	// 이용후기 작성시 상품 이름 리스트 가져오기
	public List<ProductDTO> productTitle() {
		return sqlSession.selectList("epilogue.productTitle");
	}

	// 인조이 커피 글 보기
	@Override
	public EnjoyCoffDTO enjoyView(SearchValue sv) {

		return sqlSession.selectOne("enjoyCoffee.enjoyView", sv);
	}

	// 인조이 글보기 이전 글
	public EnjoyCoffDTO enjoyViewPre(SearchValue sv) {
		
		return sqlSession.selectOne("enjoyCoffee.enjoyViewPre", sv);
	}

	// 인조이 글보기 다음 글
	public EnjoyCoffDTO enjoyViewNext(SearchValue sv) {
		
		return sqlSession.selectOne("enjoyCoffee.enjoyViewNext", sv);
	}

	// 인조이 커피 조회수
	@Override
	public void enjoyHit(SearchValue sv) {
		sqlSession.update("enjoyCoffee.enjoyHit", sv);

	}

	// 체험단 페이징------------------------------------------------------------------

	// enjoy 페이징------------------------------------------------------------------
	// enjoy 페이징 게시글 수
	@Override
	public PageNationDTO enjoyPageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			System.out.println("enjoy 리스트 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("enjoyCoffee.enjoyPageNation", sv);
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("enjoyCoffee.enjoyPageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("enjoyCoffee.enjoyPageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("enjoyCoffee.enjoyPageNationCo", sv);
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
			eDto = sqlSession.selectList("enjoyCoffee.enjoyPageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("enjoyCoffee.enjoyPageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("enjoyCoffee.enjoyPageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("enjoyCoffee.enjoyPageNationCoList", sv);
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
			pDto = sqlSession.selectOne("expr.exprPageNation", sv);
			System.out.println("게시글 수" + pDto.getListCnt());
			System.out.println("페이지 수" + pDto.getPage_cnt());
			System.out.println("블록 수" + pDto.getRange_cnt());
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("expr.exprPageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("expr.exprPageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 개수 출력으로 들어옴");
			pDto = sqlSession.selectOne("expr.exprPageNationCo", sv);
		}

		return pDto;

	}

	// 체험단 페이징 글 리스트 가져오기
	@Override
	public List<PreUserDTO> exprPageNationList(SearchValue sv) {
		List<PreUserDTO> eDto = null;
		if (sv.getOption().equals("")) {
			System.out.println("expr 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("expr.exprPageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			System.out.println("total 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("expr.exprPageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			System.out.println("title 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("expr.exprPageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			System.out.println("content 리스트 출력으로 들어옴");
			eDto = sqlSession.selectList("expr.exprPageNationCoList", sv);
		}
		return eDto;
	}

	// 체험단 리뷰 페이징
	@Override
	public PageNationDTO exprReviewPageNation(SearchValue sv) {
		return sqlSession.selectOne("expr.exprReviewPageNation", sv);

	}

	// 체험단 페이징 글 리스트 가져오기
	@Override
	public List<PreUserReviewDTO> exprReviewList(SearchValue sv) {
		return sqlSession.selectList("expr.exprReviewPageNationList", sv);
	}

	// 포토 이용후기 페이징------------------------------------------------------------------
	// 이용후기 페이징 게시글 수
	@Override
	public PageNationDTO epiloguePageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			pDto = sqlSession.selectOne("epilogue.epiloguePageNation", sv);
		} else if (sv.getOption().equals("total")) {
			pDto = sqlSession.selectOne("epilogue.epiloguePageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			pDto = sqlSession.selectOne("epilogue.epiloguePageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			pDto = sqlSession.selectOne("epilogue.epiloguePageNationCo", sv);
		}
		return pDto;
	}

	// 이용후기 페이징 글 리스트 가져오기
	@Override
	public List<EpilogueDTO> epiloguePageNationList(SearchValue sv) {

		List<EpilogueDTO> eDto = null;
		if (sv.getOption().equals("")) {
			eDto = sqlSession.selectList("epilogue.epiloguePageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			eDto = sqlSession.selectList("epilogue.epiloguePageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			eDto = sqlSession.selectList("epilogue.epiloguePageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			eDto = sqlSession.selectList("epilogue.epiloguePageNationCoList", sv);
		}
		return eDto;
	}

	// 이용후기 페이징------------------------------------------------------------------
	// 이용후기 페이징 게시글 수
	@Override
	public PageNationDTO commentPageNation(SearchValue sv) {
		PageNationDTO pDto = null;
		if (sv.getOption().equals("")) {
			pDto = sqlSession.selectOne("comment.commentPageNation", sv);
		} else if (sv.getOption().equals("total")) {
			pDto = sqlSession.selectOne("comment.commentPageNationTo", sv);
		} else if (sv.getOption().equals("title")) {
			pDto = sqlSession.selectOne("comment.commentPageNationTi", sv);
		} else if (sv.getOption().equals("content")) {
			pDto = sqlSession.selectOne("comment.commentPageNationCo", sv);
		}
		return pDto;
	}

	// 이용후기 페이징 글 리스트 가져오기
	@Override
	public List<ReviewDTO> commentPageNationList(SearchValue sv) {

		List<ReviewDTO> eDto = null;
		if (sv.getOption().equals("")) {
			eDto = sqlSession.selectList("comment.commentPageNationList", sv);
		} else if (sv.getOption().equals("total")) {
			eDto = sqlSession.selectList("comment.commentPageNationToList", sv);
		} else if (sv.getOption().equals("title")) {
			eDto = sqlSession.selectList("comment.commentPageNationTiList", sv);
		} else if (sv.getOption().equals("content")) {
			eDto = sqlSession.selectList("comment.commentPageNationCoList", sv);
		}
		return eDto;
	}

}
