package com.koitt.jardin.dao.community;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.EpilogueDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

public interface CommunityDAO {

	// 체험단 글 리스트
//	public List<PreUserDTO> expr();

	// 체험 단 글 보기 리뷰
	public PreUserDTO exprReview(int preUserNo);

	// 체험 단 글 보기 뷰
	public PreUserDTO exprView(int preuser_no);

	// 체험단 리뷰 글쓰기
	public void preUserReview(int preUserApplyNo);

	// 체험단 신청 글쓰기
	public void preUserApply(PreUserApplyDTO pDto);

	// 이용후기 글 보기
	public ReviewDTO epilogueView(int review_no);

	// 이용후기 글 삭제
	public void epilogueDelete(int review_no);

	// 이용후기 글 수정
	public void epilogueUpdate(ReviewDTO rDto);

	// 인조이 커피 글 보기
	public EnjoyCoffDTO enjoyView(SearchValue sv);

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

//포토이용후기 페이징----------------------------------------------------------------
//페이징 게시글 수
	public PageNationDTO epiloguePageNation(SearchValue sv);

// 페이징 글 리스트 가져오기
	public List<EpilogueDTO> epiloguePageNationList(SearchValue sv);

// 포토이용후기 페이징----------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO commentPageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<EpilogueDTO> commentPageNationList(SearchValue sv);
}