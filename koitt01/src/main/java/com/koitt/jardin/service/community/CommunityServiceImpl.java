package com.koitt.jardin.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.community.CommunityDAO;
import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.community.PreUserReviewDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;

@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	CommunityDAO communityDAO;

	// 체험단 글 보기 리뷰
	@Override
	public PreUserDTO exprReview(int preUserNo) {

		return communityDAO.exprReview(preUserNo);
	}

	// 체험단 글보기 뷰
	@Override
	public PreUserDTO exprView(int preuser_no) {

		return communityDAO.exprView(preuser_no);
	}

	// 체험단 리뷰 글쓰기
	@Override
	public void preUserReview(int preUserApplyNo) {
		communityDAO.preUserReview(preUserApplyNo);

	}

	// 체험단 신청 글쓰기
	@Override
	public void preUserApply(int preuser_no) {
		communityDAO.preUserApply(preuser_no);

	}

	// 이용후기 글 리스트
	@Override
	public List<PreUserReviewDTO> epilogue() {

		return communityDAO.epilogue();
	}

	// 이용후기 글 보기
	@Override
	public ReviewDTO epilogueView(int review_no) {

		return communityDAO.epilogueView(review_no);
	}

	// 인조이 커피 글 리스트
	@Override
	public List<EnjoyCoffDTO> enjoyCoffee() {

		return communityDAO.enjoyCoffee();
	}

	// 인조이 커피 글 보기
	@Override
	public EnjoyCoffDTO enjoyView(int no) {

		return communityDAO.enjoyView(no);
	}

//FAQ 페이징------------------------------------------------------------------
	// 페이징 글 리스트 가져오기
	@Override
	public List<PageNationDTO> exprPageNationList(int curPage) {
		return communityDAO.exprPageNationList(curPage);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO exprPageNation(int curPage) {
		PageNationDTO pDto = communityDAO.exprPageNation();

		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(curPage); // 현재 페이지 위치
		pDto.setCur_range(curPage); // 현재 블럭 위치
		pDto.prevnext(curPage); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

}
