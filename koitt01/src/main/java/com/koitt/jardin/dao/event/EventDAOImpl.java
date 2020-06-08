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
	public List<EventDTO> finEvent() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("event.finEvent");
	}

	// 종료된 이벤트 글내용
	@Override
	public EventDTO finEventView(int event_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("event.finEventView", event_no);
	}

	@Override
	public List<WinnerDTO> prizeWinner() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("event.prizeWinner");
	}

	@Override
	public EventDTO prizeWinnerView(int no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("event.finEventView", no);
	}

	@Override
	public EventCommentDto eventComment(int event_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("event.eventComment", event_no);
	}

}
