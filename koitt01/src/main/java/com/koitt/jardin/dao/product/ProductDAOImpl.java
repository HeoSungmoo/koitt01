package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.CommentDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.QnaDTO;
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

		return sqlSession.selectList("product.list");
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int product_no) {

		return sqlSession.selectOne("product.detail", product_no);
	}

	@Override
	public ProductDTO search(int productNo) {

		return sqlSession.selectOne("product.search", productNo);
	}

	@Override
	public ProductInfoDTO productInfoDto(int product_no) {

		return sqlSession.selectOne("product.productInfoDto", product_no);
	}

	@Override
	public List<CategoryDto> categoryList(String name) {

		return sqlSession.selectList("product.categoryList", name);
	}

	@Override
	public void review(ReviewDTO reviewDto) {

		sqlSession.insert("product.review", reviewDto);

	}

	@Override
	public List<ReviewDTO> review_view(int product_no) {

		return sqlSession.selectList("product.review_view", product_no);
	}

	@Override
	public void review_delete(int review_no) {

		sqlSession.delete("product.review_delete", review_no);

	}

	@Override
	public void review_modify(ReviewDTO reviewDto) {

		sqlSession.update("product.review_modify", reviewDto);
	}

	@Override
	public ReviewDTO review_modify_view(int review_no) {

		return sqlSession.selectOne("product.review_modify_view", review_no);
	}

	@Override
	public void photo(ReviewDTO reviewDto) {
		sqlSession.insert("product.photo", reviewDto);

	}

	@Override
	public void inquiry(QnaDTO qnaDto) {
		sqlSession.insert("product.inquiry", qnaDto);

	}

	@Override
	public List<CommentDto> comment_List() {

		return sqlSession.selectList("product.comment_List");
	}

	@Override
	public void comment_delete(int cId) {
		sqlSession.delete("product.comment_delete", cId);
	}

	@Override
	public void comment_insert(CommentDto comment) {
		sqlSession.insert("product.comment_insert", comment);

	}

	@Override
	public void comment_update(CommentDto comment) {
		sqlSession.update("product.comment_update", comment);

	}

	@Override
	public List<QnaDTO> QnA_view(int product_no) {

		return sqlSession.selectList("product.qna_view", product_no);
	}

	@Override
	public void QnA_delete(int qna_no) {

		sqlSession.delete("product.qna_delete", qna_no);

	}

	@Override
	public QnaDTO QnA_modify_view(int qna_no) {

		return sqlSession.selectOne("product.qna_modify_view", qna_no);
	}

	@Override
	public void QnA_modify(QnaDTO qnaDto) {

		sqlSession.update("product.qna_modify", qnaDto);

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
