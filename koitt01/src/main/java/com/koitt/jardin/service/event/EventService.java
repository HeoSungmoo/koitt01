package com.koitt.jardin.service.event;

import java.util.List;

import com.koitt.jardin.dto.event.EventCommentDto;
import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.dto.event.WinnerDTO;

public interface EventService {
	// 진행중 이벤트 리스트
	public List<EventDTO> event();

	// 진행중 이벤트 글내용
	public EventDTO eventView(int event_no);

	// 진행중 이벤트 댓글 리스트
	public List<EventCommentDto> eventComment(int event_no);

	// 진행중 이벤트 이전글
	public EventDTO eventViewPre(int event_no);

	// 진행중 이벤트 다음글
	public EventDTO eventViewNext(int event_no);

	// 종료된 이벤트 이전글
	public EventDTO finEventViewPre(int event_no);

	// 종료된 이벤트 다음글
	public EventDTO finEventViewNext(int event_no);

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

	// 당첨자 이벤트 리스트 목록
	public List<WinnerDTO> prizeWinner();

	// 당첨자 이벤트 리스트 조회수
	public void upHit(int no);

	// 당첨자 이벤트 내용
	public WinnerDTO prizeWinnerView(int no);

	// 이벤트 검색
	public List<EventDTO> eventSearch(String option, String search);
}
