package com.koitt.jardin.dao.home;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.home.BannerDTO;

@Repository
public class HomeDAOImpl implements HomeDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<BannerDTO> bannerList() {
		return sqlSession.selectList("home.banner");
	}
}
