package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.SubCategoryDto;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SqlSession sqlSession;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {
		// TODO Auto-generated method stub

		return sqlSession.selectList("product.list");
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int productNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.detail", productNo);
	}

	@Override
	public List<ProductInfoDTO> productInfoDto() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.productInfoDto");
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
	public void review(ProductDTO ProductDto) {

		sqlSession.insert("product.review", ProductDto);

	}

	@Override
	public ProductDTO search(int productNo) {

		return sqlSession.selectOne("product.search", productNo);
	}

	@Override
	public List<CategoryDto> categoryList(String name) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.categoryList", name);
	}

	@Override
	public List<SubCategoryDto> SubCategoryDto(String name) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.SubCategoryDto", name);
	}

}
