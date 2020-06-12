package com.koitt.jardin.controller.event;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.dto.event.EventCommentDto;
import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.service.event.EventService;

@Controller
public class EventController {

	@Autowired
	EventService eventService;

	// 진행중 이벤트 게시판 목록
	@RequestMapping("event")
	public String event(Model model, HttpSession session) {
		List<EventDTO> event = eventService.event();

		model.addAttribute("event", event);

		return "event/event";
	}

	// 진행중 이벤트 글내용
	@RequestMapping("eventView")
	public String eventView(Model model, int event_no, EventCommentDto eventCommentDto, HttpSession session) {
		EventDTO ed = new EventDTO();

		model.addAttribute("eventView", eventService.eventView(event_no));
		model.addAttribute("eventViewPre", eventService.eventViewPre(event_no));
		model.addAttribute("eventViewNext", eventService.eventViewNext(event_no));
		model.addAttribute("eventComment", eventService.eventComment(event_no));
		return "event/eventView";
	}

	// 진행중 이벤트 댓글 쓰기
	@RequestMapping("eventCommentWrite")
	public String eventWrite(Model model, EventCommentDto eventCommentDto, int event_no, HttpSession session) {
		eventCommentDto.setId((String) session.getAttribute("member"));
		eventService.eventCommentWrite(eventCommentDto);
		model.addAttribute("eventView", eventService.eventView(event_no));
		return "redirect:/eventView?event_no=" + event_no;
	}

	// 진행중 이벤트 댓글 삭제
	@RequestMapping("eventCommentDelete")
	public String eventCommentDelete(Model model, int event_no, int comment_no, HttpSession session) {
		eventService.eventCommentDelete(comment_no);
		return "redirect:/eventView?event_no=" + event_no;
	}

	// 이벤드 댓글 수정칸 보기
	@RequestMapping("eventCommentModifyView")
	public String eventCommentModifyView(Model model, int event_no, EventCommentDto eventCommentDto,
			HttpSession session) {
		model.addAttribute("eventCommentModifyView", eventService.eventCommentModifyView(eventCommentDto));
		model.addAttribute("event_no", event_no);
		return "event/eventCommentModify";
	}

	// 이벤트 댓글 수정
	@RequestMapping("eventCommentModify")
	public String eventCommentModify(Model model, int event_no, EventCommentDto eventCommentDto, HttpSession session) {
		eventService.eventCommentModify(eventCommentDto);

		return "redirect:/eventView?event_no=" + event_no;
	}

	// 종료된 이벤트 게시판 목록
	@RequestMapping("finEvent")
	public String finEvent(Model model, HttpSession session) {
		List<EventDTO> event = eventService.event();

		model.addAttribute("event", event);

		return "event/finEvent";
	}

	// 종료된 이벤트 글내용
	@RequestMapping("finEventView")
	public String finEventView(Model model, int event_no, HttpSession session) {

		model.addAttribute("eventView", eventService.eventView(event_no));
		model.addAttribute("finEventViewPre", eventService.finEventViewPre(event_no));
		model.addAttribute("finEventViewNext", eventService.finEventViewNext(event_no));
		model.addAttribute("eventComment", eventService.eventComment(event_no));
		return "event/finEventView";
	}

	// 당첨자 발표 게시판 목록
	@RequestMapping("prizeWinner")
	public String prizeWinner(Model model, HttpSession session) {
		model.addAttribute("prizeWinner", eventService.prizeWinner());
		return "event/prizeWinner";
	}

	// 당첨자 발표 글내용
	@RequestMapping("prizeWinnerView")
	public String prizeWinnerView(int no, Model model, HttpSession session) {

		eventService.upHit(no);
		model.addAttribute("prizeWinnerView", eventService.prizeWinnerView(no));

		return "event/prizeWinnerView";
	}

	// 진행중 이벤트 검색
	@RequestMapping("eventSearch")
	public String eventSearch(Model model, String search, String option, HttpSession session) {

		model.addAttribute("event", eventService.eventSearch(option, search));

		return "event/event";

	}

	// 종료된 이벤트 검색
	@RequestMapping("finEventSearch")
	public String finEventSearch(Model model, String search, String option) {

		model.addAttribute("event", eventService.eventSearch(option, search));

		return "event/finEvent";

	}

	// 당첨자 이벤트 검색
	@RequestMapping("winnerSearch")
	public String winnerSearch(Model model, String search, String option) {

		model.addAttribute("event", eventService.eventSearch(option, search));

		return "event/prizeWinner";

	}

}
