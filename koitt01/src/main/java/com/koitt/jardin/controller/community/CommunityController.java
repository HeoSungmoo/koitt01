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
	public String exprReview(SearchValue sv, Model model, int preuser_no) {
		model.addAttribute("exprReview", communityService.exprReview(preuser_no));
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
	public String exprView(Model model, int preuser_no) {
		model.addAttribute("exprView", communityService.exprView(preuser_no));
		return "community/exprView";
	}

	@RequestMapping("preUserApply")
	public String preUserApply(PreUserApplyDTO pDto, HttpServletRequest request, HttpSession session) {
		pDto.setId((String) session.getAttribute("member"));

		int preuser_no = Integer.parseInt(request.getParameter("preuser_no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		pDto.setPreuser_no(preuser_no);
		pDto.setTitle(title);
		pDto.setContent(content);
		communityService.preUserApply(pDto);
		return "community/expr";
	}

	// 포토구매후기 글
	// 리스트--------------------------------------------------------------------2020-06-03
	// 작업중 리뷰에 대한 부분 상의 필요
	@RequestMapping("epilogue")
	public String epilogue(Model model, HttpSession session, SearchValue sv) {

		String memberId = (String) session.getAttribute("member");

		PageNationDTO pDto = communityService.epiloguePageNation(sv); // 게시글 수 저장
		List<EpilogueDTO> eDto = communityService.epiloguePageNationList(sv);

		model.addAttribute("pDto", pDto);
		model.addAttribute("eDto", eDto);
		model.addAttribute("sv", sv);
		model.addAttribute("memberId", memberId);
		model.addAttribute("eDto", eDto);
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
	@RequestMapping("epilogueWrite")
	public String epilogueWrite(Model model,ReviewDTO rDto,MultipartFile thumbnail) {
		
		model.addAttribute("epilogueUpdate",rDto);
		return "community/epilogueWrite";
	}
	// 포토구매후기 글 수정페이지 view
	@RequestMapping("epilogueUpdate")
	public String epilogueUpdate(Model model,ReviewDTO rDto,RedirectAttributes redirectAttributes) {	
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
		List<EpilogueDTO> eDto = communityService.commentPageNationList(sv);

		model.addAttribute("pDto", pDto);
		model.addAttribute("eDto", eDto);
		model.addAttribute("sv", sv);
		model.addAttribute("memberId", memberId);
		model.addAttribute("eDto", eDto);
		return "community/epilogue";
	}

	// 상품평 글 보기
	@RequestMapping("commentView")
	public String commentView() {

		return "community/commentView";
	}

	// 상품평 글 쓰기
	@RequestMapping("commentWrite")
	public String commentWrite() {

		return "community/commentWrite";
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
