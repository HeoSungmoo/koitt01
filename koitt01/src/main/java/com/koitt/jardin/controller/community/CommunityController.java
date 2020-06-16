package com.koitt.jardin.controller.community;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.community.PreUserApplyDTO;
import com.koitt.jardin.dto.community.PreUserDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.search.SearchValue;
import com.koitt.jardin.service.community.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	CommunityService communityService;

	// 체험단 글 리스트
	@RequestMapping("expr")
	public String expr(SearchValue sv, Model model) {
//		model.addAttribute("expr", communityService.expr());
		PageNationDTO pDto = communityService.exprPageNation(sv); // 게시글 수 저장
		List<PreUserDTO> list = communityService.exprPageNationList(sv);
		model.addAttribute("expr", list);
		model.addAttribute("pDto", pDto);
		model.addAttribute("sv", sv);
		System.out.println("expr현재 블럭 시작페이지start_page: " + pDto.getStart_page());
		System.out.println("expr현재 블럭 끝 페이지end_page: " + pDto.getEnd_page());
		System.out.println("expr현재 페이지 위치curPage: " + pDto.getCurPage());
		System.out.println("expr다음 블럭 버튼next_page: " + pDto.getNext_page());
		System.out.println("expr게시글 수listCnt: " + pDto.getListCnt());
		System.out.println("expr페이지 수page_cnt: " + pDto.getPage_cnt());
		System.out.println("expr현재 블럭위치cur_range: " + pDto.getCur_range());
		System.out.println("expr블럭수range_cnt: " + pDto.getRange_cnt());
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
	public String epilogue(Model model, HttpSession session) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String memberId = mapper.writeValueAsString((String) session.getAttribute("member"));
		model.addAttribute("memberId", memberId);
		model.addAttribute("epilogue", communityService.epilogue());
		return "community/epilogue";
	}

	// 포토구매후기 글 보기
	@RequestMapping("epilogueView")
	public String epilogueView(Model model, int review_no) {
		model.addAttribute("epilogueView", communityService.epilogueView(review_no));
		return "community/epilogueView";
	}

	// 포토구매후기 글 쓰기
	@RequestMapping("epilogueWrite")
	public String epilogueWrite(HttpSession session, int review_no, Model model) {
		model.addAttribute("epilogueWrite", review_no);

		return "community/epilogue";
	}

	// 상품평 글 리스트
	@RequestMapping("comment")
	public String comment() {

		return "community/comment";
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
	public String enjoyView(Model model, int no, SearchValue sv) {
		model.addAttribute("enjoyView", communityService.enjoyView(no));
		model.addAttribute("sv", sv);
		return "community/enjoyView";
	}

}
