package com.koitt.jardin.dao.event;

import java.util.List;

import com.koitt.jardin.dto.event.EventCommentDto;
import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.dto.event.WinnerDTO;

public interface EventDAO {
	// 진행중 이벤트 리스트
	public List<EventDTO> event();

	// 진행중 이벤트 글내용
	public EventDTO eventView(int event_no);

	public EventDTO eventViewPre(int event_no);

	public EventDTO eventViewNext(int event_no);

	// 진행중 이벤트 댓글 리스트
	public List<EventCommentDto> eventComment(int event_no);

	// 진행중 이벤트 댓글 작성
	public void eventCommentWrite(EventCommentDto eventCommentDto);

	// 진행중 이벤트 댓글 삭제
	public void eventCommentDelete(int comment_no);

	// 진행중 이벤트 글수정 뷰
	public EventCommentDto eventCommentModifyView(EventCommentDto eventCommentDto);

	// 진행중 이벤트 글수정
	public void eventCommentModify(EventCommentDto eventCommentDto);

	// 종료된 이벤트 리스트
	public List<EventDTO> finEvent(EventDTO eventDto);

	// 종료된 이벤트 글내용
	public EventDTO finEventView(int event_no);

	// 당첨자 페이지
	public List<WinnerDTO> prizeWinner();

	// 조회수 증가
	public void upHit(int no);

	public WinnerDTO prizeWinnerView(int no);

	// 이벤트 검색
	public List<EventDTO> eventSearch(String option, String search);
}
