package com.koitt.jardin.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	// 공지사항 글 리스트
	@RequestMapping("notice")
	public String notice() {

		return "board/notice";
	}
	
	// 공지사항 글 보기
		@RequestMapping("noticeView")
		public String noticeView() {

			return "board/noticeView";
		}

	// 1:1문의 글 작성
	@RequestMapping("inquiry")
	public String inquiry() {

		return "board/inquiry";
	}

	// FAQ
	@RequestMapping("faq")
	public String faq() {

		return "board/faq";
	}

	// 이용안내
	@RequestMapping("guide")
	public String guide() {

		return "board/guide";
	}
}
