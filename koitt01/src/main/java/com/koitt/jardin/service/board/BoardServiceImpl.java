package com.koitt.jardin.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.koitt.jardin.dao.board.BoardDAO;
import com.koitt.jardin.dto.board.BoardDTO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;

	@Override
	public List<BoardDTO> notice() {
		boardDao.notice();
		return null;
	}

}
