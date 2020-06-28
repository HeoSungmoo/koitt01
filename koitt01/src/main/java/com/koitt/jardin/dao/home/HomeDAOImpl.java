package com.koitt.jardin.dao.home;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.home.BannerDTO;
import com.koitt.jardin.dto.home.ProductTypeDTO;
import com.koitt.jardin.dto.product.ProductDTO;

@Repository
public class HomeDAOImpl implements HomeDAO {

	@Autowired
	SqlSession sqlSession;

	// 배너 리스트 불러오기
	@Override
	public List<BannerDTO> bannerList() {
		return sqlSession.selectList("home.bannerList");
	}

	// 베스트셀러 리스트 불러오기
	@Override
	public List<ProductTypeDTO> hitList() {
		return sqlSession.selectList("home.hitList");
	}

	// 할인상품 리스트 불러오기
	@Override
	public List<ProductTypeDTO> saleList() {
		return sqlSession.selectList("home.saleList");
	}

	// 고객센터 전화번호 불러오기
	@Override
	public String tel() {
		return sqlSession.selectOne("home.tel");
	}

	// 공지사항 상위글 3개 불러오기
	@Override
	public List<NoticeDTO> notice() {
		return sqlSession.selectList("home.notice");
	}

	// 인조이 사위글 3개 불러오기
	@Override
	public List<EnjoyCoffDTO> enjoyCoffee() {
		return sqlSession.selectList("home.enjoyCoffee");
	}
	
	@Override
	public List<ProductDTO> list(){
		
		return sqlSession.selectList("product.list");
	}
}
