package com.koitt.jardin.service.board;

import org.springframework.beans.factory.annotation.Autowired;

import com.koitt.jardin.dao.board.BoardDAO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;

}
