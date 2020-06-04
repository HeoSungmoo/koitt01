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

	// 怨듭��궗�빆 湲� 由ъ뒪�듃�엫
	@RequestMapping("notice")
	public String notice(Model model) {
		model.addAttribute("notice", boardService.notice());

		return "board/notice";
	}

	// 怨듭��궗�빆 湲� 蹂닿린
	@RequestMapping("noticeView")
	public String noticeView(Model model, int No) {
		model.addAttribute("noticeView", boardService.noticeView(No));
		model.addAttribute("noticeViewPre", boardService.noticeView(No - 1));
		model.addAttribute("noticeViewNext", boardService.noticeView(No + 1));
		return "board/noticeView";
	}

	// 1:1 臾몄쓽 湲��옉�꽦 �럹�씠吏�
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

	// �씠�슜�븞�궡
	@RequestMapping("guide")
	public String guide(Model model) {
//		model.addAttribute("guide", boardService.guide());
		return "board/guide";
	}
}
