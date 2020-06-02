package com.koitt.jardin.controller.event;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping("event")
	public String event() {

		return "event/event";
	}

	@RequestMapping("eventView")
	public String eventView() {

		return "event/eventView";
	}

	@RequestMapping("finEvent")
	public String finEvent() {

		return "event/finEvent";
	}

	@RequestMapping("finEventView")
	public String finEventView() {

		return "event/finEventView";
	}

	@RequestMapping("password")
	public String password() {

		return "event/password";
	}

	@RequestMapping("prizeWinner")
	public String prizeWinner() {

		return "event/prizeWinner";
	}

	@RequestMapping("prizeWinnerView")
	public String prizeWinnerView() {

		return "event/prizeWinnerView";
	}

}
