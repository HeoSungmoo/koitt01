package com.koitt.jardin.controller.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommunityController {

	// 체험단 글 리스트
	@RequestMapping("expr")
	public String expr() {

		return "community/expr";
	}

	// 체험단 글 보기 및 체험단 리뷰 글 쓰기
	@RequestMapping("exprReview")
	public String exprReview() {

		return "community/exprReview";
	}

	// 체험단 글 보기 및 체험단 신청
	@RequestMapping("exprView")
	public String exprView() {

		return "community/exprView";
	}

	// 포토구매후기 글 리스트
	@RequestMapping("epilogue")
	public String epilogue() {

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
