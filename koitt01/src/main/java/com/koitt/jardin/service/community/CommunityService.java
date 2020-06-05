package com.koitt.jardin.service.community;

import java.util.List;

import com.koitt.jardin.dto.community.PreUserDTO;

public interface CommunityService {

	// 체험단 글 리스트
	public List<PreUserDTO> expr();

	// 체험단 글 보기(리뷰)
	public PreUserDTO exprReview(int preUserNo);

	public PreUserDTO exprView(int preuser_no);

	// 체험단 리뷰 글쓰기
	public void preUserReview(int preUserApplyNo);

	// 체험단 신청 글쓰기
	public void preUserApply(int preUserApplyNo);

}
