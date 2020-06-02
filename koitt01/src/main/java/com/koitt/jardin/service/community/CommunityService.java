package com.koitt.jardin.service.community;

import java.util.List;

import com.koitt.jardin.dto.community.PreUserDTO;

public interface CommunityService {

	// 체험단 글 리스트
	public List<PreUserDTO> expr();

	// 체험단 글 보기(리뷰)
	public PreUserDTO exprReview(int preUserNo);

	// 체험단 리뷰 글쓰기
	public void preUserReview(int preUserApplyNo);
}
