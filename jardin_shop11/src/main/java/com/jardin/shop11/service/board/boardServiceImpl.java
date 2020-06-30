package com.jardin.shop11.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardin.shop11.dao.board.boardDao;
import com.jardin.shop11.dto.board.BoardDTO;

@Service
public class boardServiceImpl implements boardService {

	@Autowired
	boardDao boardDao;

	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return boardDao.list();
	}

}
