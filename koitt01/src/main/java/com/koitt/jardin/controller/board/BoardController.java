package com.koitt.jardin.controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.service.board.BoardService;
import com.koitt.jardin.service.member.MyPageService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	@Autowired
	MyPageService myPageService;

	// 공지사항 글 리스트
	@RequestMapping("notice")
	public String notice(Model model) {
		model.addAttribute("notice", boardService.notice());

		return "board/notice";
	}

	// 공지사항 글보기
	@RequestMapping("noticeView")
	public String noticeView(Model model, int No) {
		model.addAttribute("noticeView", boardService.noticeView(No));
		model.addAttribute("noticeViewPre", boardService.noticeView(No - 1));
		model.addAttribute("noticeViewNext", boardService.noticeView(No + 1));
		return "board/noticeView";
	}

	// 1:1 문의 
	@RequestMapping("bInquiryView")
	public String inquiryView() {
		return "board/inquiry";
	}

	// FAQ
	@RequestMapping("faq")
	public String faq(Model model) {
		model.addAttribute("faq", boardService.faq());
		return "board/faq";
	}
	@RequestMapping("faqJoin")
	public String faqJoin(Model model) {
		model.addAttribute("faq", boardService.faqJoin());
		return "board/faq";
	}
	@RequestMapping("faqProduct")
	public String faqProduct(Model model) {
		model.addAttribute("faq", boardService.faqProduct());
		return "board/faq";
	}
	@RequestMapping("faqOrder")
	public String faqOrder(Model model) {
		model.addAttribute("faq", boardService.faqOrder());
		return "board/faq";
	}
	@RequestMapping("faqSearch")
	public String faqSearch(Model model,String search) {
		model.addAttribute("faq", boardService.faqSearch(search));
		return "board/faq";
	}
	

	// 이용방법
	@RequestMapping("guide")
	public String guide(Model model) {
//		model.addAttribute("guide", boardService.guide());
		return "board/guide";
	}
}
