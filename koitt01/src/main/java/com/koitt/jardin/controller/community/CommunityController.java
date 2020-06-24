package com.koitt.jardin.controller.community;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.EpilogueDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.product.UpdateReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;
import com.koitt.jardin.service.community.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	CommunityService communityService;

	// 체험단 리스트 출력및 검색
	@RequestMapping("expr")
	public String expr(SearchValue sv, Model model) {
		PageNationDTO pDto = communityService.exprPageNation(sv); // 게시글 수 저장
		List<PreUserDTO> list = communityService.exprPageNationList(sv);
		model.addAttribute("expr", list);
		model.addAttribute("pDto", pDto);
		model.addAttribute("sv", sv);
		return "community/expr";
	}

	// 체험단 글 보기 및 체험단 리뷰리스트
	@RequestMapping("exprReview")
	public String exprReview(SearchValue sv, Model model) {
		model.addAttribute("exprView", communityService.exprReview(sv));

		expr(sv, model);
		return "community/exprReview";
	}

	// 체험단 리뷰 작성
	@RequestMapping("preUserReview")
	public String preUserReview(int preUserApplyNo) {
		communityService.preUserReview(preUserApplyNo);
		return "community/exprReview";
	}

	// 체험단 글 보기 및 체험단 신청--------> exprReview와 exprView는 같은 글보기 상태에서 리뷰는 리뷰작성및 리뷰
	// 리스트가 나오고 뷰는 체험단 신청이 나오는 차이가 있어서 exprReview를 호출했다.
	@RequestMapping("exprView")
	public String exprView(Model model, int preuser_no,HttpSession session) {
		String id=(String)session.getAttribute("member");
		model.addAttribute("exprView", communityService.exprView(preuser_no));
		model.addAttribute("id",id);
		return "community/exprView";
	}
	//체험단 신청 insert
	@RequestMapping("preUserApply")
	public String preUserApply(PreUserApplyDTO pDto) {
		communityService.preUserApply(pDto);
		return "redirect:expr";
	}

	// 포토구매후기 글
	// 리스트--------------------------------------------------------------------2020-06-03
	// 작업중 리뷰에 대한 부분 상의 필요
	@RequestMapping("epilogue")
	public String epilogue(Model model, HttpSession session, SearchValue sv) {

		String memberId = (String) session.getAttribute("member");
		System.out.println("커뮤니티id"+memberId);
		PageNationDTO pDto = communityService.epiloguePageNation(sv); // 게시글 수 저장
		List<EpilogueDTO> eDto = communityService.epiloguePageNationList(sv);
		
		model.addAttribute("pDto", pDto);
		model.addAttribute("eDto", eDto);
		model.addAttribute("sv", sv);
		model.addAttribute("memberId", memberId);
		return "community/epilogue";
	}

	// 포토구매후기 글 보기
	@RequestMapping("epilogueView")
	public String epilogueView(Model model, int review_no, SearchValue sv) {
		model.addAttribute("epilogueView", communityService.epilogueView(review_no));
		model.addAttribute("sv", sv);
		return "community/epilogueView";
	}

	// 포토구매후기 글 수정 update
	@RequestMapping("epilogueWrite1")
	public String epilogueWrite(Model model,String id,String title,int review_no,String productTitle,int grade, String content,MultipartFile thumbnail) throws Exception {
		
		System.out.println("-------------커뮤니티 컨트롤러----------------");
		communityService.epilogueWrite(id,review_no,title,productTitle,grade,content,thumbnail);
		System.out.println("-------------커뮤니티 컨트롤러----------------");
		System.out.println("리뷰글 번호"+review_no);
		System.out.println("상품명"+productTitle);
		System.out.println("글 제목"+title);
		System.out.println("평가점수"+grade);
		System.out.println("리뷰글 내용"+content);
		System.out.println("썸네일"+thumbnail);
		return "redirect:epilogue";
	}
	// 포토구매후기 글 수정페이지 view
	@RequestMapping("epilogueUpdate")
	public String epilogueUpdate(Model model,UpdateReviewDTO rDto) {	
	rDto=communityService.epilogueUpdate(rDto);
	model.addAttribute("epilogueUpdate",rDto);
		return "community/epilogueWrite";
	}
	// 포토구매후기 글 삭제
	@RequestMapping("epilogueDelete")
	public String epilogueDelete(int review_no) {
		communityService.epilogueDelete(review_no);
		return "redirect:epilogue";
	}

	// 상품평 글 리스트
	@RequestMapping("comment")
	public String comment(Model model, HttpSession session, SearchValue sv) {
		String memberId = (String) session.getAttribute("member");
		PageNationDTO pDto = communityService.commentPageNation(sv); // 게시글 수 저장
		List<ReviewDTO> eDto = communityService.commentPageNationList(sv);
		model.addAttribute("pDto", pDto);
		model.addAttribute("eDto", eDto);
		model.addAttribute("sv", sv);
		model.addAttribute("memberId", memberId);
		return "community/comment";
	}

	// 상품평 글 보기
	@RequestMapping("commentView")
	public String commentView() {

		return "community/commentView";
	}

	// 상품평 글 쓰기
	@RequestMapping("epilogueInsert")
	public String commentWrite() {

		return "community/epilogueInsert";
	}

	// Enjoy Coffee 글 리스트
	@RequestMapping("enjoy")
	public String enjoy(SearchValue sv, Model model) {
		PageNationDTO pDto = communityService.enjoyPageNation(sv); // 게시글 수 저장
		List<EnjoyCoffDTO> eDto = communityService.enjoyPageNationList(sv);
		model.addAttribute("pDto", pDto);
		model.addAttribute("eDto", eDto);
		model.addAttribute("sv", sv);
		return "community/enjoy";
	}

	// Enjoy Coffee 글 보기
	@RequestMapping("enjoyView")
	public String enjoyView(Model model, SearchValue sv) {
		model.addAttribute("enjoyView", communityService.enjoyView(sv));
		model.addAttribute("sv", sv);
		return "community/enjoyView";
	}

}
