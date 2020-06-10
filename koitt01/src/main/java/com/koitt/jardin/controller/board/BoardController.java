package com.koitt.jardin.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.dto.board.PageNationDTO;
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
	public String noticeView(Model model, int no) {
		boardService.noticeViewHit(no);
		model.addAttribute("noticeView", boardService.noticeView(no));
		model.addAttribute("noticeViewPre", boardService.noticeViewPre(no));
		model.addAttribute("noticeViewNext", boardService.noticeViewNext(no));
		return "board/noticeView";
	}

	// 공지사항 이전페이지
	@RequestMapping("noticeViewPre")
	public String noticeViewPre(Model model, int no) {
		model.addAttribute("noticeView", boardService.noticeViewPre(no));
		return "board/noticeView";
	}

	// 공지사항 다음페이지
	@RequestMapping("noticeViewNext")
	public String noticeViewNext(Model model, int no) {
		model.addAttribute("noticeView", boardService.noticeViewNext(no));
		return "board/noticeView";
	}

	// 공지사항 검색
	@RequestMapping("noticeSearch")
	public String noticeSearch(Model model, String option, String search) {
		model.addAttribute("notice", boardService.noticeSearch(option, search));
		return "board/notice";
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
	public String faqSearch(Model model, String search) {
		model.addAttribute("faq", boardService.faqSearch(search));
		return "board/faq";
	}

	// 이용방법
	@RequestMapping("guide")
	public String guide(Model model) {
//		model.addAttribute("guide", boardService.guide());
		return "board/guide";
	}

	// 게시글 목록
	@RequestMapping("아직 안건")
	public String noticePage(int curPage, Model model) {
		PageNationDTO PDto = boardService.pageNation(curPage); // 게시글 수 저장
		List<PageNationDTO> list = boardService.pageNationList(curPage);

		model.addAttribute("list", list);
		model.addAttribute("pDto", PDto);
		return "notice";
	}

}
