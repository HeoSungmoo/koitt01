package com.koitt.jardin.service.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.event.EventDAO;
import com.koitt.jardin.dto.event.EventCommentDto;
import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.dto.event.WinnerDTO;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventDAO eventDao;

	// 진행중 이벤트 게시판 목록
	@Override
	public List<EventDTO> event() {
		// TODO Auto-generated method stub
		return eventDao.event();
	}

	// 진행중 이벤트 글내용
	@Override
	public EventDTO eventView(int event_no) {
		// TODO Auto-generated method stub
		return eventDao.eventView(event_no);
	}

	// 종료된 이벤트 게시판 목록
	@Override
	public List<EventDTO> finEvent() {

		return eventDao.finEvent();
	}

	// 종료된 이벤트 글내용
	@Override
	public EventDTO finEventView(int event_no) {
		// TODO Auto-generated method stub
		return eventDao.finEventView(event_no);
	}

	@Override
	public List<WinnerDTO> prizeWinner() {
		// TODO Auto-generated method stub
		return eventDao.prizeWinner();
	}

	@Override
	public EventDTO prizeWinnerView(int no) {

		return eventDao.prizeWinnerView(no);
	}

	// 진행중 이벤트 댓글
//	@Override
//	public EventCommentDto eventComment(int event_no) {
//		// TODO Auto-generated method stub
//		return eventDao.eventComment(event_no);
//	}

	// 진행중 이벤트 댓글작성
	@Override
	public void eventCommentWrite(EventCommentDto eventCommentDto) {

		eventDao.eventCommentWrite(eventCommentDto);

	}

	@Override
	public List<EventCommentDto> eventComment(int event_no) {
		// TODO Auto-generated method stub
		return eventDao.eventComment(event_no);
	}

}
