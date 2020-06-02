package com.koitt.jardin.service.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.event.EventDAO;
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
	public EventDTO eventView(int eventNo) {
		// TODO Auto-generated method stub
		return eventDao.eventView(eventNo);
	}

	// 종료된 이벤트 게시판 목록
	@Override
	public List<EventDTO> finEvent() {

		return eventDao.finEvent();
	}

	// 종료된 이벤트 글내용
	@Override
	public EventDTO finEventView(int eventNo) {
		// TODO Auto-generated method stub
		return eventDao.finEventView(eventNo);
	}

	@Override
	public List<WinnerDTO> prizeWinner() {
		// TODO Auto-generated method stub
		return eventDao.prizeWinner();
	}

	@Override
	public EventDTO prizeWinner() {
		
		return eventDao.p
	}

}
