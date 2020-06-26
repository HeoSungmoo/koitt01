package com.koitt.jardin.service.community;

import java.util.List;

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
import com.koitt.jardin.service.comment.Comment;

public interface CommunityService {
	

	// 체험단 글 보기(리뷰)
	public PreUserDTO exprReview(SearchValue sv);

	// 체험단 글보기(체험단 신청)
	public PreUserDTO exprView(int preuser_no);

	// 체험단 리뷰 글쓰기
	public void preUserReview(int preuser_no,String writerId,MultipartFile preUserReviewImage,int grade,String title,String content) throws Exception;

	// 체험단 신청 글쓰기
	public void preUserApply(PreUserApplyDTO pDto);

	
	// 이용후기 글 보기
	public UpdateReviewDTO epilogueView(int review_no);

	// 이용후기 글 삭제
	public void epilogueDelete(int review_no);

	//이용후기 수정페이지로 이동
	public void epilogueWrite(String id,int review_no,String title,String productTitle,int grade, String content,MultipartFile thumbnail) throws Exception;
	
	
	// 이용후기 글 수정
	public UpdateReviewDTO epilogueUpdate(UpdateReviewDTO rDto);

	//이용후기 조회수
	public void epilogueHit(SearchValue sv);
	
	//포토상품후기 글쓰기
	public void epilogueWrite2(String id,String title,String productTitle,int grade, String content,MultipartFile thumbnail) throws Exception;
	
	//이용후기 중 상품 이름 중복제거후  불러오기
	public List<ProductDTO> productTitle();
	
	
	// enjoy커피 글 보기
	public EnjoyCoffDTO enjoyView(SearchValue sv);
	
	//enjoy커피 조회수
	public void enjoyHit(SearchValue sv);
	
	// enjoy 글보기 이전글
		public EnjoyCoffDTO enjoyViewPre(SearchValue sv);

		// enjoy 글보기 이전글
		public EnjoyCoffDTO enjoyViewNext(SearchValue sv);

// enjoy 페이징 및 검색------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO enjoyPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<EnjoyCoffDTO> enjoyPageNationList(SearchValue sv);

// 체험단 페이징 및 검색------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO exprPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<PreUserDTO> exprPageNationList(SearchValue sv);
	
	//체험단 리뷰 게시글 수
	public PageNationDTO exprReviewPageNation(SearchValue sv);

	//체험단 리뷰 게시글 리스트 가져오기
	public List<PreUserReviewDTO> exprReviewList(SearchValue sv);
// 포토상품후기 페이징 및 검색------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO epiloguePageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<EpilogueDTO> epiloguePageNationList(SearchValue sv);

// 이용후기 페이징 및 검색------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO commentPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<ReviewDTO> commentPageNationList(SearchValue sv);
}
