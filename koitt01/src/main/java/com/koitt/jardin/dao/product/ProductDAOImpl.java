package com.koitt.jardin.dao.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.home.BannerDTO;
import com.koitt.jardin.dto.page.PhotoReviewPageNationDTO;
import com.koitt.jardin.dto.page.ProductPageNationDTO;
import com.koitt.jardin.dto.page.QnaPageNationDTO;
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

	// 제품의 상세내용 // 상품상세 정보
	@Override
	public ProductInfoDTO productInfoDto(int product_no) {

		return sqlSession.selectOne("product.productInfoDto", product_no);
	}

	// 제품 카테고리 리스트
	@Override
	public List<ProductDTO> categoryAllList(SearchValue sv) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("product.categoryAllList", sv);
	}

	// 제품 카테고리 리스트
	@Override
	public List<ProductDTO> categoryList(SearchValue sv) {

		return sqlSession.selectList("product.categoryList", sv);
	}

	// 제품 상품리뷰 쓰기
	@Override
	public void review(ReviewDTO reviewDto) {

		sqlSession.insert("product.review", reviewDto);

	}

	// 제품 상품리뷰 삭제
	@Override
	public void review_delete(int review_no) {

		sqlSession.delete("product.review_delete", review_no);

	}

	// 제품 상품리뷰 수정
	@Override
	public void review_modify(ReviewDTO reviewDto) {

		sqlSession.update("product.review_modify", reviewDto);
	}

	// 제품 상품리뷰 수정란 보기
	@Override
	public ReviewDTO review_modify_view(int review_no) {

		return sqlSession.selectOne("product.review_modify_view", review_no);
	}

	// 제품 포토리뷰 쓰기
	@Override
	public void photo(ReviewDTO reviewDto) {
		sqlSession.insert("product.photo", reviewDto);

	}

	// 제품 질문과 답변 쓰기
	@Override
	public void inquiry(QnaDTO qnaDto) {
		sqlSession.insert("product.inquiry", qnaDto);

	}

	// 제품 질문과 답변 삭제
	@Override
	public void QnA_delete(int qna_no) {

		sqlSession.delete("product.qna_delete", qna_no);

	}

	// 제품 질문과 답변 수정란 보기
	@Override
	public QnaDTO QnA_modify_view(int qna_no) {

		return sqlSession.selectOne("product.qna_modify_view", qna_no);
	}

	// 제품 질문과 답변 수정
	@Override
	public void QnA_modify(QnaDTO qnaDto) {

		sqlSession.update("product.qna_modify", qnaDto);

	}

	// 제품 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO productPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.productPageNation", sv);
	}

	// 제품 페이지네이션 리스트
	@Override
	public List<ProductDTO> productPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.productPageNationList", sv);
	}

	// 포토상품리뷰 페이지네이션 페이지,게시물 수 확인
	@Override
	public PhotoReviewPageNationDTO PhotoReviewPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.photoPageNation", sv);
	}

	// 포토상품리뷰 페이지네이션 리스트
	@Override
	public List<ReviewDTO> PhotoReviewPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.photoPageNationList", sv);
	}

	// 카테고리1 대분류 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO categoryPageNationListDTO(SearchValue sv) {

		return sqlSession.selectOne("page.categoryPageNationList", sv);
	}

	// 카테고리2 대분류 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO categoryPageNationDTO(SearchValue sv) {

		return sqlSession.selectOne("page.categoryPageNation", sv);
	}

	// 리뷰 페이지네이션 리스트
	@Override
	public List<ReviewDTO> ReviewPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.reviewPageNationList", sv);
	}

	// 리뷰 페이지네이션 페이지,게시물 수 확인
	@Override
	public ReviewPageNationDTO ReviewPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.reviewPageNation", sv);
	}

	// 질문과 답변 페이지네이션 리스트
	@Override
	public List<QnaDTO> QnApageNationList(SearchValue sv) {

		return sqlSession.selectList("page.QnApageNationList", sv);
	}

	// 질문과 답변 페이지네이션 페이지,게시물 수 확인
	@Override
	public QnaPageNationDTO QnApageNation(SearchValue sv) {

		return sqlSession.selectOne("page.QnApageNation", sv);
	}

	// 제품 검색 페이지네이션 리스트
	@Override
	public List<ProductDTO> productSearchPageNationList(SearchValue sv) {

		return sqlSession.selectList("page.productSearchPageNationList", sv);
	}

	// 제품 검색 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO productSearchPageNation(SearchValue sv) {

		return sqlSession.selectOne("page.productSearchPageNation", sv);
	}

	// 제품 검색 높은 가격순 페이지네이션 리스트
	@Override
	public List<ProductDTO> HighPircePageNationList(SearchValue sv) {

		return sqlSession.selectList("page.HighPircePageNationList", sv);
	}

	// 제품 검색 낮은 가격순 페이지네이션 리스트
	@Override
	public List<ProductDTO> LowPircePageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("page.LowPircePageNationList", sv);
	}

	// -------------------ajax 연습 ------------------------------------------------
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
	public BannerDTO banner(String category1) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("product.banner", category1);
	}

}
