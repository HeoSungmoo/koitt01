package com.jardin.shop11.dao.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jardin.shop11.dto.board.BoardDTO;

@Repository
public class boardDaoImpl implements boardDao {

	@Autowired
	SqlSession sqlsession;

	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return sqlsession.selectList("board.list");
	}

}
