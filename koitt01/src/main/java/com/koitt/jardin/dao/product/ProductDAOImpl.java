package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.product.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	SqlSession sqlSession;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.list");
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int product_No) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.detail", product_No);
	}

	// 구매후기 작성란
	@Override
	public void photo(ProductDTO ProductDto) {

		sqlSession.insert("product.photo", ProductDto);

	}

	@Override
	public void review(ProductDTO ProductDto) {

		sqlSession.insert("product.review", ProductDto);

	}

	@Override
	public ProductDTO search(int product_No) {

		return sqlSession.selectOne("product.search", product_No);
	}

}
