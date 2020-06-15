package com.koitt.jardin.controller.community;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.service.community.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	CommunityService communityService;

	// 체험단 글 리스트
	@RequestMapping("expr")
	public String expr(@RequestParam(value = "curPage", defaultValue = "1") int curPage, Model model) {
//		model.addAttribute("expr", communityService.expr());
		PageNationDTO PDto = communityService.exprPageNation(curPage); // 게시글 수 저장
		List<PageNationDTO> list = communityService.exprPageNationList(curPage);
		model.addAttribute("expr", list);
		model.addAttribute("pDto", PDto);
		System.out.println("expr현재 블럭 시작페이지start_page: " + PDto.getStart_page());
		System.out.println("expr현재 블럭 끝 페이지end_page: " + PDto.getEnd_page());
		System.out.println("expr현재 페이지 위치curPage: " + PDto.getCurPage());
		System.out.println("expr다음 블럭 버튼next_page: " + PDto.getNext_page());
		System.out.println("expr게시글 수listCnt: " + PDto.getListCnt());
		System.out.println("expr페이지 수page_cnt: " + PDto.getPage_cnt());
		System.out.println("expr현재 블럭위치cur_range: " + PDto.getCur_range());
		System.out.println("expr블럭수range_cnt: " + PDto.getRange_cnt());
		System.out.println("과연" + PDto.getPage_cnt() % 10);
		return "community/expr";
	}

	// 체험단 글 보기 및 체험단 리뷰리스트
	@RequestMapping("exprReview")
	public String exprReview(@RequestParam(value = "curPage", defaultValue = "1") int curPage, Model model,
			int preuser_no) {
		model.addAttribute("exprReview", communityService.exprReview(preuser_no));
		expr(curPage, model);
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
	public String preUserApply(int preuser_no) {
		communityService.preUserApply(preuser_no);
		return "community/exprApplyResult";
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
	public String enjoy(Model model) {
		model.addAttribute("enjoyCoffee", communityService.enjoyCoffee());
		return "community/enjoy";
	}

	// Enjoy Coffee 글 보기
	@RequestMapping("enjoyView")
	public String enjoyView(Model model, int no) {
		model.addAttribute("enjoyView", communityService.enjoyView(no));
		return "community/enjoyView";
	}
}
