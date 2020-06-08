package com.koitt.jardin.controller.community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.service.community.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	CommunityService communityService;

	// 체험단 글 리스트
	@RequestMapping("expr")
	public String expr(Model model) {
		model.addAttribute("expr", communityService.expr());
		return "community/expr";
	}

	// 체험단 글 보기 및 체험단 리뷰리스트
	@RequestMapping("exprReview")
	public String exprReview(Model model, int preuser_no) {
		model.addAttribute("exprReview", communityService.exprReview(preuser_no));
		expr(model);
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
	public String epilogue(Model model) {
//		model.addAttribute("epilogue", communityService.epilogue());
		return "community/epilogue";
	}

	// 포토구매후기 글 보기
	@RequestMapping("epilogueView")
	public String epilogueView() {

		return "community/epilogueView";
	}

	// 포토구매후기 글 쓰기
	@RequestMapping("epilogueWrite")
	public String epilogueWrite() {

		return "community/epilogueWrite";
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
	public String enjoy() {

		return "community/enjoy";
	}

	// Enjoy Coffee 글 보기
	@RequestMapping("enjoyView")
	public String enjoyView() {

		return "community/enjoyView";
	}
}
