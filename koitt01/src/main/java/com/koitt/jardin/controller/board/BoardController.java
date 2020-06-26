package com.koitt.jardin.controller.board;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.member.InquiryDTO;
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

	// 공지사항 리스트 출력 및 검색 리스트 출력
	@RequestMapping("notice")
	public String noticeSearch(SearchValue sv, Model model) {

		PageNationDTO PDto = boardService.pageNation(sv); // 게시글 수 저장
		List<NoticeDTO> list = boardService.pageNationList(sv);
		model.addAttribute("notice", list);
		model.addAttribute("pDto", PDto);
		model.addAttribute("sv", sv);
		System.out.println("-----------노티스 컨트롤러-----------------");
		System.out.println("현재페이지다: "+sv.getCurPage());
		System.out.println("옵션이다: "+sv.getOption());
		System.out.println("검색어다: "+sv.getSearch());
		System.out.println("-----------노티스 컨트롤러-----------------");
//		System.out.println("현재 블럭 시작페이지start_page: " + PDto.getStart_page());
//		System.out.println("현재 블럭 끝 페이지end_page: " + PDto.getEnd_page());
//		System.out.println("현재 페이지 위치curPage: " + PDto.getCurPage());
//		System.out.println("다음 블럭 버튼next_page: " + PDto.getNext_page());
//		System.out.println("게시글 수listCnt: " + PDto.getListCnt());
//		System.out.println("현재 블럭위치cur_range: " + PDto.getCur_range());
//		System.out.println("블럭수range_cnt: " + PDto.getRange_cnt());

		return "board/notice";
	}
	
	//1:1문의 작성페이지로 이동
	@RequestMapping("boardInquiryView")
	public String inuiryWriteView() {
		return "board/inquiry";
	}

	// 1:1 문의
	@RequestMapping("BoardInquiryWrite")
	public String inquiryView(String category,String title,String content,
			MultipartFile file_name,HttpSession session) throws Exception {
		String id=(String)session.getAttribute("member");
		System.out.println("id입니다"+id);
		
		if(file_name!=null) {
			boardService.inquiryWrite(id,category,title,content,file_name);
			System.out.println("보드 컨트롤러 파일첨부");
		}else if(file_name==null) {
			boardService.inquiryWrite1(id,category,title,content);
			System.out.println("보드 컨트롤러 파일첨부 안함");
		}

		return "redirect:notice";//임시 뷰페이지 성공페이지 만들어줘야함
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

}
