package com.koitt.jardin.service.event;

import java.util.List;

import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.dto.event.WinnerDTO;

public interface EventService {

	public List<EventDTO> event();

	public EventDTO eventView(int eventNo);

	public List<EventDTO> finEvent();

	public EventDTO finEventView(int eventNo);

	public List<WinnerDTO> prizeWinner();

	public EventDTO prizeWinnerView(int no);
}
