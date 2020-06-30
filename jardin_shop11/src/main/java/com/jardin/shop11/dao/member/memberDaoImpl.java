package com.jardin.shop11.dao.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class memberDaoImpl implements memberDao {

	@Autowired
	SqlSession sqlSession;

}
