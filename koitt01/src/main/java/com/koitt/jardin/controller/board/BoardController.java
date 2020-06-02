package com.koitt.jardin.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.service.board.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	MembershipService membershipService;

	// 공지사항 글 리스트임
	@RequestMapping("notice")
	public String notice(Model model) {
		model.addAttribute("notice", boardService.notice());
		return "board/notice";
	}

	// 공지사항 글 보기
	@RequestMapping("noticeView")
	public String noticeView(Model model, int No) {
		model.addAttribute("noticeView", boardService.noticeView(No));
		return "board/noticeView";
	}

	// 1:1 문의 글작성 페이지
	@RequestMapping("inquiryView")
	public String inquiryView() {
		return "board/inquiry";
	}

	// 1:1문의 글 작성 결과
	@RequestMapping("inquiry")
	public String inquiry() {
		membershipService.inquiry();
		return "mypage/inquiry";
	}

	// FAQ
	@RequestMapping("faq")
	public String faq(Model model) {
		model.addAttribute("faq", boardService.faq());
		return "board/faq";
	}

	// 이용안내
	@RequestMapping("guide")
	public String guide(Model model) {
		model.addAttribute("guide", boardService.guide());
		return "board/guide";
	}
}
