package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.ReviewDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SqlSession sqlSession;

//	@Autowired
//	ProductMapper productMapper;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {
		// TODO Auto-generated method stub

		return sqlSession.selectList("product.list");
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int product_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.detail", product_no);
	}

	// 구매후기 작성란

	@Override
	public void inquiry(ProductDTO ProductDto) {

		sqlSession.insert("product.inquiry", ProductDto);

	}

	@Override
	public void photo(ProductDTO ProductDto) {

		sqlSession.insert("product.photo", ProductDto);

	}

	@Override
	public ProductDTO search(int productNo) {

		return sqlSession.selectOne("product.search", productNo);
	}

	@Override
	public ProductInfoDTO productInfoDto(int product_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.productInfoDto", product_no);
	}

	@Override
	public List<CategoryDto> categoryList(String name) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.categoryList", name);
	}

	@Override
	public void review(ReviewDTO reviewDto) {

		sqlSession.insert("product.review", reviewDto);

	}

	@Override
	public List<ReviewDTO> review_view(int product_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.review_view", product_no);
	}

	@Override
	public void review_delete(int review_no) {

		sqlSession.delete("product.review_delete", review_no);

	}

//	@Override
//	public List<ProductDTO> categoryList(String category1, String category2) {
//		// TODO Auto-generated method stub
//
//		return productMapper.categoryTest(category1, category2);
//	}

//	@Override
//	public List<ProductDTO> categoryList(String category1, String category2) {
//		// TODO Auto-generated method stub
//		return sqlSession.selectList("product.categoryList,category1");
////		return productMapper.categoryTest(category1, category2);
//	}

//	@Override
//	public List<ProductDTO> categoryList(String category1, String category2) {
//		// TODO Auto-generated method stub
//
//		return productMapper.categoryTest(category1, category2);
//	}

}
