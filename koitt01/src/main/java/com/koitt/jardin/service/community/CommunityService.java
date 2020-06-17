package com.koitt.jardin.service.community;

import java.util.List;

import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.community.PreUserReviewDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

public interface CommunityService {

//	// 체험단 글 리스트
//	public List<PreUserDTO> expr();

	// 체험단 글 보기(리뷰)
	public PreUserDTO exprReview(int preUserNo);

	// 체험단 글보기(체험단 신청)
	public PreUserDTO exprView(int preuser_no);

	// 체험단 리뷰 글쓰기
	public void preUserReview(int preUserApplyNo);

	// 체험단 신청 글쓰기
	public void preUserApply(PreUserApplyDTO pDto);

	// 이용후기 글 리스트
	public List<PreUserReviewDTO> epilogue();

	// 이용후기 글 보기
	public ReviewDTO epilogueView(int review_no);

	// enjoy커피 글 리스트
	public List<EnjoyCoffDTO> enjoyCoffee();

	// enjoy커피 글 보기
	public EnjoyCoffDTO enjoyView(int no);

// 체험단 페이징 및 검색------------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO exprPageNation(int curPage);

	// 페이징 글 리스트 가져오기
	public List<PageNationDTO> exprPageNationList(int curPage);

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

}
