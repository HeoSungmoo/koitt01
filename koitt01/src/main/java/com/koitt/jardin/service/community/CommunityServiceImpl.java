package com.koitt.jardin.service.community;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dao.community.CommunityDAO;
import com.koitt.jardin.dto.CommentDTO.CommentDTO;
import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.EpilogueDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.community.PreUserReviewDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.product.UpdateReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	CommunityDAO communityDAO;

	// 체험단 글 보기 리뷰
	@Override
	public PreUserDTO exprReview(SearchValue sv) {

		return communityDAO.exprReview(sv);
	}

	// 체험단 글보기 뷰
	@Override
	public PreUserDTO exprView(int preuser_no) {

		return communityDAO.exprView(preuser_no);
	}

	// 체험단 리뷰 글쓰기
	@Override
	public void preUserReview(int preuser_no,MultipartFile preUserReviewImage,int grade,String title,String content) throws Exception {
		String path="C:/Users/yohan/git/koitt01/koitt01/src/main/webapp/resources/preuserUpload/";
		String origin_Name=preUserReviewImage.getOriginalFilename();
		System.out.println(origin_Name);
		UUID uuid= UUID.randomUUID();
		String file_Name=uuid.toString()+"_"+origin_Name;
		preUserReviewImage.transferTo(new File(path + file_Name));
		PreUserReviewDTO purDto = new PreUserReviewDTO();
		purDto.setPreuser_no(preuser_no);
		purDto.setTitle(title);
		purDto.setContent(content);
		purDto.setGrade(grade);
		purDto.setPreUserReviewImage(file_Name);
		communityDAO.preUserReview(purDto);

	}

	// 체험단 신청 글쓰기
	@Override
	public void preUserApply(PreUserApplyDTO pDto) {
		communityDAO.preUserApply(pDto);

	}

	// 이용후기 글 보기
	@Override
	public UpdateReviewDTO epilogueView(int review_no) {

		return communityDAO.epilogueView(review_no);
	}

	@Override
	public void epilogueDelete(int review_no) {
		communityDAO.epilogueDelete(review_no);
	}

	@Override
	public void epilogueWrite(String id,int review_no,String title,String productTitle,int grade, String content,MultipartFile thumbnail) throws Exception {
		String path="C:/Users/yohan/git/koitt01/koitt01/src/main/webapp/resources/upload/";
		System.out.println("-------------커뮤니티 서비스----------------");
		System.out.println("리뷰글 번호"+review_no);
		System.out.println("상품명"+productTitle);
		System.out.println("글 제목"+title);
		System.out.println("평가점수"+grade);
		System.out.println("리뷰글 내용"+content);
		System.out.println("썸네일"+thumbnail);
		System.out.println("-------------커뮤니티 서비스----------------");
		String origin_Name=thumbnail.getOriginalFilename();
		UUID uuid= UUID.randomUUID();
		String file_Name=uuid.toString()+"_"+origin_Name;
		thumbnail.transferTo(new File(path + file_Name));
		UpdateReviewDTO rDto = new UpdateReviewDTO();
		rDto.setReview_no(review_no);
		rDto.setProductTitle(productTitle);
		rDto.setTitle(title);
		rDto.setId(id);
		rDto.setTitle(title);
		rDto.setContent(content);
		rDto.setGrade(grade);
		rDto.setThumbnail(file_Name);
		communityDAO.epilogueWrite(rDto);
		
	}
	
	
	@Override
	public UpdateReviewDTO epilogueUpdate(UpdateReviewDTO rDto) {
		System.out.println(rDto.getReview_no());
	
		return communityDAO.epilogueUpdate(rDto);
	}

	// 인조이 커피 글 보기
	@Override
	public EnjoyCoffDTO enjoyView(SearchValue sv) {

		return communityDAO.enjoyView(sv);
	}

// 체험단(expr) 페이징------------------------------------------------------------------
	// 페이징 글 리스트 가져오기
	@Override
	public List<PreUserDTO> exprPageNationList(SearchValue sv) {
		return communityDAO.exprPageNationList(sv);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO exprPageNation(SearchValue sv) {
		PageNationDTO pDto = communityDAO.exprPageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// enjoy 페이징------------------------------------------------------------------
	// 페이징 글 리스트 가져오기
	@Override
	public List<EnjoyCoffDTO> enjoyPageNationList(SearchValue sv) {
		return communityDAO.enjoyPageNationList(sv);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO enjoyPageNation(SearchValue sv) {
		PageNationDTO pDto = communityDAO.enjoyPageNation(sv);
		System.out.println(pDto.getPrev_page());
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

//포토상품후기
// 페이징 글 리스트 가져오기
	@Override
	public List<EpilogueDTO> epiloguePageNationList(SearchValue sv) {
		return communityDAO.epiloguePageNationList(sv);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO epiloguePageNation(SearchValue sv) {
		PageNationDTO pDto = communityDAO.epiloguePageNation(sv);
		
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

//상품후기 상품후기
	// 페이징 글 리스트 가져오기
	@Override
	public List<ReviewDTO> commentPageNationList(SearchValue sv) {
		return communityDAO.commentPageNationList(sv);
	}

	// 페이징 게시글 수 및 값 세팅
	@Override
	public PageNationDTO commentPageNation(SearchValue sv) {
		PageNationDTO pDto = communityDAO.commentPageNation(sv);
		System.out.println(pDto.getPrev_page());
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;

	}
	
	

}
