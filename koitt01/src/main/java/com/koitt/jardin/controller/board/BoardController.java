package com.koitt.jardin.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.board.SearchValue;
=======
>>>>>>> branch 'master' of https://github.com/HeoSungmoo/koitt01.git
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.search.SearchValue;
import com.koitt.jardin.service.board.BoardService;
import com.koitt.jardin.service.member.MyPageService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	@Autowired
	MyPageService myPageService;

	// 공지사항 글보기
	@RequestMapping("noticeView")
	public String noticeView(Model model, int no, SearchValue sv) {
		boardService.noticeViewHit(no);
		model.addAttribute("noticeView", boardService.noticeView(no));
		model.addAttribute("noticeViewPre", boardService.noticeViewPre(no));
		model.addAttribute("noticeViewNext", boardService.noticeViewNext(no));
		model.addAttribute("sv", sv);
		return "board/noticeView";
	}

<<<<<<< HEAD
	// 공지사항 리스트 출력 및 검색 리스트 출력
	@RequestMapping("notice")
	public String noticeSearch(SearchValue sv, Model model) {

		PageNationDTO PDto = boardService.noticeSearchPageNation(sv); // 게시글 수 저장
		List<NoticeDTO> list = boardService.noticeSearchPageNationList(sv);
		model.addAttribute("notice", list);
		model.addAttribute("pDto", PDto);
		model.addAttribute("sv", sv);

		System.out.println("현재 블럭 시작페이지start_page: " + PDto.getStart_page());
		System.out.println("현재 블럭 끝 페이지end_page: " + PDto.getEnd_page());
		System.out.println("현재 페이지 위치curPage: " + PDto.getCurPage());
		System.out.println("다음 블럭 버튼next_page: " + PDto.getNext_page());
		System.out.println("게시글 수listCnt: " + PDto.getListCnt());
		System.out.println("페이지 수page_cnt: " + PDto.getPage_cnt());
		System.out.println("현재 블럭위치cur_range: " + PDto.getCur_range());
		System.out.println("블럭수range_cnt: " + PDto.getRange_cnt());
=======
	// 공지사항 검색
	@RequestMapping("noticeSearch")
	public String noticeSearch(Model model, SearchValue sv) {
//		System.out.println("1" + sv.getOption());
//		System.out.println("2" + sv.getSearch());
//		System.out.println("3" + sv.getCurPage());
		PageNationDTO PDto = boardService.pageNation(sv.getCurPage());
		model.addAttribute("pDto", PDto);
		model.addAttribute("notice", boardService.noticeSearch(sv));
>>>>>>> branch 'master' of https://github.com/HeoSungmoo/koitt01.git
		return "board/notice";
	}

	// 1:1 문의
	@RequestMapping("bInquiryView")
	public String inquiryView() {
		return "board/inquiry";
	}

	// FAQ 리스트 출력 및 검색페이징
	@RequestMapping("faq")
	public String faq(SearchValue sv, Model model) {

		PageNationDTO PDto = boardService.faqPageNation(sv); // 게시글 수 저장
		List<FaqDTO> list = boardService.faqPageNationList(sv);
		model.addAttribute("faq", list);
		model.addAttribute("pDto", PDto);
		model.addAttribute("sv", sv);

		return "board/faq";
	}

	// 이용방법
	@RequestMapping("guide")
	public String guide(Model model) {
//		model.addAttribute("guide", boardService.guide());
		return "board/guide";
	}

//	// 공지사항 글 리스트,페이징
//	@RequestMapping("notice")
//	public String noticePage(@RequestParam(value = "curPage", defaultValue = "1") int curPage, Model model) {
//		PageNationDTO PDto = boardService.pageNation(curPage); // 게시글 수 저장
//		List<PageNationDTO> list = boardService.pageNationList(curPage);
//
//		model.addAttribute("notice", list);
//		model.addAttribute("pDto", PDto);

<<<<<<< HEAD
//		return "board/notice";
//	}
=======
		model.addAttribute("notice", list);
		model.addAttribute("pDto", PDto);
//		System.out.println("현재 블럭 시작페이지start_page: " + PDto.getStart_page());
//		System.out.println("현재 블럭 끝 페이지end_page: " + PDto.getEnd_page());
//		System.out.println("현재 페이지 위치curPage: " + PDto.getCurPage());
//		System.out.println("다음 블럭 버튼next_page: " + PDto.getNext_page());
//		System.out.println("게시글 수listCnt: " + PDto.getListCnt());
//		System.out.println("페이지 수page_cnt: " + PDto.getPage_cnt());
//		System.out.println("현재 블럭위치cur_range: " + PDto.getCur_range());
//		System.out.println("블럭수range_cnt: " + PDto.getRange_cnt());

		return "board/notice";
	}
>>>>>>> branch 'master' of https://github.com/HeoSungmoo/koitt01.git

}
