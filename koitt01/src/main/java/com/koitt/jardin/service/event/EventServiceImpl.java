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
	public List<EventDTO> finEvent(EventDTO eventDto) {

		return eventDao.finEvent(eventDto);
	}

	// 종료된 이벤트 글내용
	@Override
	public EventDTO finEventView(int event_no) {

		return eventDao.finEventView(event_no);
	}

	// 당첨자 페이지
	@Override
	public List<WinnerDTO> prizeWinner() {

		return eventDao.prizeWinner();
	}

	@Override
	public WinnerDTO prizeWinnerView(int no) {

		return eventDao.prizeWinnerView(no);
	}

	// 진행중 이벤트 댓글작성
	@Override
	public void eventCommentWrite(EventCommentDto eventCommentDto) {

		eventDao.eventCommentWrite(eventCommentDto);

	}

	// 댓글 리스트 출력
	@Override
	public List<EventCommentDto> eventComment(int event_no) {

		return eventDao.eventComment(event_no);
	}

	// 진행중 이벤트 댓글 삭제
	@Override
	public void eventCommentDelete(int comment_no) {
		// TODO Auto-generated method stub
		eventDao.eventCommentDelete(comment_no);
	}

	// 진행중 이벤트 댓글 수정
	@Override
	public void eventCommentModify(EventCommentDto eventCommentDto) {
		// TODO Auto-generated method stub
		eventDao.eventCommentModify(eventCommentDto);

	}

	// 진행중 이벤트 댓글 수정 뷰페이지
	@Override
	public EventCommentDto eventCommentModifyView(EventCommentDto eventCommentDto) {
		// TODO Auto-generated method stub
		return eventDao.eventCommentModifyView(eventCommentDto);
	}

	// 당첨자 게시글 조회수 증가
	@Override
	public void upHit(int no) {
		eventDao.upHit(no);

	}

	// 이벤트 검색
	@Override
	public List<EventDTO> eventSearch(String option, String search) {
		// TODO Auto-generated method stub
		return eventDao.eventSearch(option, search);
	}

	@Override
	public EventDTO eventViewPre(int event_no) {
		// TODO Auto-generated method stub
		return eventDao.eventViewPre(event_no);
	}

	@Override
	public EventDTO eventViewNext(int event_no) {
		// TODO Auto-generated method stub
		return eventDao.eventViewNext(event_no);
	}

}
