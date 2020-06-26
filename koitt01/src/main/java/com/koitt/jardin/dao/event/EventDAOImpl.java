package com.koitt.jardin.dao.event;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.event.EventCommentDto;
import com.koitt.jardin.dto.event.EventDTO;
import com.koitt.jardin.dto.event.WinnerDTO;

@Repository
public class EventDAOImpl implements EventDAO {

	@Autowired
	SqlSession sqlSession;

	// 진행중 이벤트 게시판 목록
	@Override
	public List<EventDTO> event() {

		return sqlSession.selectList("event.eventList");
	}

	// 진행중 이벤트 글내용
	@Override
	public EventDTO eventView(int event_no) {

		return sqlSession.selectOne("event.eventView", event_no);
	}

	// 종료된 이벤트 게시판 목록
	@Override
	public List<EventDTO> finEvent(EventDTO eventDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("event.finEvent", eventDto);
	}

	// 종료된 이벤트 글내용
	@Override
	public EventDTO finEventView(int event_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("event.finEventView", event_no);
	}

	@Override
	public void eventCommentWrite(EventCommentDto eventCommentDto) {
		sqlSession.insert("event.eventCommentWrite", eventCommentDto);

	}

	@Override
	public List<EventCommentDto> eventComment(int event_no) {

		return sqlSession.selectList("event.eventComment", event_no);
	}

	@Override
	public void eventCommentDelete(int comment_no) {

		sqlSession.delete("event.eventCommentDelete", comment_no);

	}

	@Override
	public void eventCommentModify(EventCommentDto eventCommentDto) {
		sqlSession.update("event.eventCommentModify", eventCommentDto);

	}

	@Override
	public EventCommentDto eventCommentModifyView(EventCommentDto eventCommentDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("event.eventCommentModifyView", eventCommentDto);
	}

	// 당첨자 페이지
	@Override
	public List<WinnerDTO> prizeWinner() {

		return sqlSession.selectList("event.prizeWinner");
	}

	// 조회수 증가
	@Override
	public void upHit(int no) {
		sqlSession.update("event.upHit", no);

	}

	@Override
	public WinnerDTO prizeWinnerView(int no) {

		return sqlSession.selectOne("event.prizeWinnerView", no);
	}

	@Override
	public List<EventDTO> eventSearch(String option, String search) {
		List<EventDTO> sList = null;

		if (option.equals("title")) {
			sList = sqlSession.selectList("event.eventSearchT", search);

		} else if (option.equals("content")) {
			sList = sqlSession.selectList("event.eventSearchC", search);
		}
		return sList;

	}

	@Override
	public EventDTO eventViewPre(int event_no) {
		EventDTO ed = sqlSession.selectOne("event.eventViewPre", event_no);

		return sqlSession.selectOne("event.eventViewPre", event_no);
	}

	@Override
	public EventDTO eventViewNext(int event_no) {
		EventDTO ed = sqlSession.selectOne("event.eventViewNext", event_no);

		return sqlSession.selectOne("event.eventViewNext", event_no);
	}

	@Override
	public EventDTO finEventViewPre(int event_no) {
		EventDTO ed = sqlSession.selectOne("event.finEventViewPre", event_no);

		return sqlSession.selectOne("event.finEventViewPre", event_no);
	}

	@Override
	public EventDTO finEventViewNext(int event_no) {
		EventDTO ed = sqlSession.selectOne("event.finEventViewNext", event_no);

		return sqlSession.selectOne("event.finEventViewNext", event_no);
	}

}
