package com.koitt.jardin.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.board.BoardDAO;
import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;

	// 공지사항 글 리스트
	@Override
	public List<NoticeDTO> notice() {

		return boardDao.notice();

	}

	// 공지사항 글 보기
	@Override
	public NoticeDTO noticeView(int No) {

		return boardDao.noticeView(No);
	}

	// 1:1문의
	@Override
	public void inquiry() {
		boardDao.inquiry();

	}

	// FAQ
	@Override
	public List<FaqDTO> faq() {

		return boardDao.faq();
	}

	// 이용안내
	@Override
	public GuideDTO guide() {

		return boardDao.guide();
	}

}
