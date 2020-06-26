package com.koitt.jardin.dao.community;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.CommentDTO.CommentDTO;
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

public interface CommunityDAO {


	// 체험 단 글 보기 리뷰
	public PreUserDTO exprReview(SearchValue sv);

	// 체험 단 글 보기 뷰
	public PreUserDTO exprView(int preuser_no);

	// 체험단 리뷰 글쓰기
	public void preUserReview(PreUserReviewDTO purDto);

	// 체험단 신청 글쓰기
	public void preUserApply(PreUserApplyDTO pDto);
	
	// 이용후기 글 보기
	public UpdateReviewDTO epilogueView(int review_no);

	// 이용후기 글 삭제
	public void epilogueDelete(int review_no);

	// 이용후기 글 수정
	public UpdateReviewDTO epilogueUpdate(UpdateReviewDTO rDto);

	//이용후기 수정페이지로 이동
	public void epilogueWrite(UpdateReviewDTO rDto) throws Exception;
	
	//포토상품후기 글 쓰기
		public void epilogueWrite2(UpdateReviewDTO rDto) throws Exception;
	
	//이용후기 조회수
	public void epilogueHit(SearchValue sv);
	
	//이용후기 작성시 상품 명 가져오기
	public List<ProductDTO> productTitle();
	// 인조이 커피 글 보기
	public EnjoyCoffDTO enjoyView(SearchValue sv);
	
	//enjoy 조회수
	public void enjoyHit(SearchValue sv);

	// 인조이 글보기 이전 글
	public EnjoyCoffDTO enjoyViewPre(SearchValue sv);

	// 인조이 글보기 다음 글
	public EnjoyCoffDTO enjoyViewNext(SearchValue sv);
// enjoy페이징------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO enjoyPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<EnjoyCoffDTO> enjoyPageNationList(SearchValue sv);

// 체험단 페이징------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO exprPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<PreUserDTO> exprPageNationList(SearchValue sv);

	//체험단 리뷰 게시글 수
	public PageNationDTO exprReviewPageNation(SearchValue sv);

	//체험단 리뷰 게시글 리스트 가져오기
	public List<PreUserReviewDTO> exprReviewList(SearchValue sv);
	
//포토이용후기 페이징----------------------------------------------------------------
//페이징 게시글 수
	public PageNationDTO epiloguePageNation(SearchValue sv);

// 페이징 글 리스트 가져오기
	public List<EpilogueDTO> epiloguePageNationList(SearchValue sv);

// 포토이용후기 페이징----------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO commentPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<ReviewDTO> commentPageNationList(SearchValue sv);
}