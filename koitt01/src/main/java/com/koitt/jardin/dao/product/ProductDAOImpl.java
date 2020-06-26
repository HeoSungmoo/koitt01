package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.page.ProductPageNationDTO;
import com.koitt.jardin.dto.page.ReviewPageNationDTO;
import com.koitt.jardin.dto.product.CommentDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.QnaDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

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
	public ProductInfoDTO productInfoDto(int product_no) {

		return sqlSession.selectOne("product.productInfoDto", product_no);
	}

	@Override
	public List<ProductDTO> categoryAllList(SearchValue sv) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.categoryAllList", sv);
	}

	@Override
	public List<ProductDTO> categoryList(SearchValue sv) {

		return sqlSession.selectList("product.categoryList", sv);
	}

	@Override
	public void review(ReviewDTO reviewDto) {

		sqlSession.insert("product.review", reviewDto);

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

	@Override
	public ProductPageNationDTO productPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.productPageNation", sv);
	}

	@Override
	public List<ProductDTO> productPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.productPageNationList", sv);
	}

	@Override
	public ReviewPageNationDTO PhotoReviewPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.photoPageNation", sv);
	}

	@Override
	public List<ReviewDTO> PhotoReviewPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.photoPageNationList", sv);
	}

	@Override
	public ProductPageNationDTO categoryPageNationListDTO(SearchValue sv) {

		return sqlSession.selectOne("page.categoryPageNationList", sv);
	}

	@Override
	public ProductPageNationDTO categoryPageNationDTO(SearchValue sv) {

		return sqlSession.selectOne("page.categoryPageNation", sv);
	}

	@Override
	public List<ReviewDTO> ReviewPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.reviewPageNationList", sv);
	}

	@Override
	public ReviewPageNationDTO ReviewPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.reviewPageNation", sv);
	}

	@Override
	public List<QnaDTO> QnApageNationList(SearchValue sv) {

		return sqlSession.selectList("page.QnApageNationList", sv);
	}

	@Override
	public ReviewPageNationDTO QnApageNation(SearchValue sv) {

		return sqlSession.selectOne("page.QnApageNation", sv);
	}

	@Override
	public List<ProductDTO> productSearchPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.productSearchPageNationList", sv);
	}

	@Override
	public ProductPageNationDTO productSearchPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.productSearchPageNation", sv);
	}

	@Override
	public List<ProductDTO> product_amount(SearchValue sv) {

		return null;
	}

	@Override
	public List<ProductDTO> HighPircePageNationList(SearchValue sv) {

		return sqlSession.selectList("page.HighPircePageNationList", sv);
	}

	@Override
	public List<ProductDTO> LowPircePageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("page.LowPircePageNationList", sv);
	}

}
