package com.koitt.jardin.controller.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.service.event.EventService;

@Controller
public class EventController {

	@Autowired
	EventService eventService;

	// 진행중 이벤트 게시판 목록
	@RequestMapping("event")
	public String event(Model model) {
		List<EventDTO> event = eventService.event();

		System.out.println(event.get(3).getEvent_no());
		System.out.println(event.get(3).getTitle());
		System.out.println(event.get(3).getStart_date() + "시작일");
		System.out.println(event.get(3).getEnd_date() + "종료일");
		model.addAttribute("event", event);

		return "event/event";
	}

	// 진행중 이벤트 글내용
	@RequestMapping("eventView")
	public String eventView(Model model, int eventNo) {
		model.addAttribute("eventView", eventService.eventView(eventNo));

		return "event/eventView";
	}

	// 종료된 이벤트 게시판 목록
	@RequestMapping("finEvent")
	public String finEvent(Model model) {
		model.addAttribute("finEvent", eventService.finEvent());
		return "event/finEvent";
	}

	// 종료된 이벤트 글내용
	@RequestMapping("finEventView")
	public String finEventView(Model model, int eventNo) {
		model.addAttribute("finEventView", eventService.finEventView(eventNo));
		return "event/finEventView";
	}

	// 당첨자 발표 게시판 목록
	@RequestMapping("prizeWinner")
	public String prizeWinner(Model model) {
		model.addAttribute("prizeWinner");
		return "event/prizeWinner";
	}

	// 당첨자 발표 글내용
	@RequestMapping("prizeWinnerView")
	public String prizeWinnerView() {

		return "event/prizeWinnerView";
	}

}
