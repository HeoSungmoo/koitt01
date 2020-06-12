package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.ProductMapper;
import com.koitt.jardin.dto.product.SubCategoryDto;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SqlSession sqlSession;

	@Autowired
	ProductMapper productMapper;

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
	public void review(ProductDTO ProductDto) {

		sqlSession.insert("product.review", ProductDto);

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
	public SubCategoryDto SubCategoryDto(int sub_category_code) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.SubCategoryDto", sub_category_code);
	}

	@Override
	public List<SubCategoryDto> SubCategoryDto() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.subCategoryList");
	}

	@Override
	public List<ProductDTO> categoryList(String category1, String category2) {
		// TODO Auto-generated method stub

		return productMapper.categoryTest(category1, category2);
	}

//	@Override
//	public ProductDTO categoryList() {
//		// TODO Auto-generated method stub
//		return sqlSession.selectOne("product.categoryList");
//	}

}
