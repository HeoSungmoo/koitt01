package com.koitt.jardin.dao.event;

import java.util.List;

import com.koitt.jardin.dto.event.EventCommentDto;
import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.dto.event.WinnerDTO;

public interface EventDAO {

	public List<EventDTO> event();

	public EventDTO eventView(int event_no);

	public EventCommentDto eventComment(int event_no);

	public void eventCommentWrite(EventCommentDto eventCommentDto);

	public List<EventDTO> finEvent();

	public EventDTO finEventView(int event_no);

	public List<WinnerDTO> prizeWinner();

	public EventDTO prizeWinnerView(int no);
}
