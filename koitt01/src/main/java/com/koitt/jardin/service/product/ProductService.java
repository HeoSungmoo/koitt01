package com.koitt.jardin.service.product;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;
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



public interface ProductService {
	// 제품리스트 목록페이지
	public List<ProductDTO> list();

	// 제품 카테고리1 리스트
	public List<ProductDTO> categoryAllList(SearchValue sv);

	// 제품 카테고리2 리스트
	public List<ProductDTO> categoryList(SearchValue sv);

//	--------------------제품리스트 페이지네이션-----------------------------
	// 제품 페이지네이션 리스트
	public List<ProductDTO> productPageNationList(SearchValue sv);

	// 제품 페이지네이션 페이지,게시물 수 확인
	public ProductPageNationDTO productPageNation(SearchValue sv);

	// 카테고리1 대분류 페이지네이션 페이지,게시물 수 확인
	public ProductPageNationDTO categoryPageNationListDTO(SearchValue sv);

	// 카테고리2 대분류 페이지네이션 페이지,게시물 수 확인
	public ProductPageNationDTO categoryPageNationDTO(SearchValue sv);

	// 제품 검색 페이지네이션 리스트
	public List<ProductDTO> productSearchPageNationList(SearchValue sv);

	// 제품 검색 페이지네이션 페이지,게시물 수 확인
	public ProductPageNationDTO productSearchPageNation(SearchValue sv);

// -------------------제품 검색 페이지네이션------------------------
	// 제품 검색 높은 가격순 페이지네이션 리스트
	public List<ProductDTO> HighPircePageNationList(SearchValue sv);

	// 제품 검색 낮은 가격순 페이지네이션 리스트
	public List<ProductDTO> LowPircePageNationList(SearchValue sv);

// ---------------------제품 상세 페이지네이션--------------------------------------
	// 포토상품리뷰 페이지네이션 리스트
	public List<ReviewDTO> PhotoReviewPageNationList(SearchValue sv);

	// 포토상품리뷰 페이지네이션 페이지,게시물 수 확인
	public PhotoReviewPageNationDTO PhotoReviewPageNation(SearchValue sv);

	// 리뷰 페이지네이션 리스트
	public List<ReviewDTO> ReviewPageNationList(SearchValue sv);

	// 리뷰 페이지네이션 페이지,게시물 수 확인
	public ReviewPageNationDTO ReviewPageNation(SearchValue sv);

	// 질문과 답변 페이지네이션 리스트
	public List<QnaDTO> QnApageNationList(SearchValue sv);

	// 질문과 답변 페이지네이션 페이지,게시물 수 확인
	public QnaPageNationDTO QnApageNation(SearchValue sv);

	// ----------------------제품상세--------------------------------------------

	// 제품의 상세내용 ( condent_view)
	public ProductDTO detail(int product_no);

	// 제품의 상세내용 // 상품상세 정보
	public ProductInfoDTO productInfoDto(int product_no);

	// 제품 상품리뷰 쓰기
	public void review(ReviewDTO reviewDto);

	// 제품 상품리뷰 삭제
	public void review_delete(int review_no);

	// 제품 상품리뷰 수정
	public void review_modify(ReviewDTO reviewDto);

	// 제품 상품리뷰 수정란 보기
	public ReviewDTO review_modify_view(int review_no);

	// 제품 포토리뷰 쓰기
	public abstract void photo(int product_no, String title, String content, int grade, MultipartFile thumbnail,
			String id) throws Exception;

	// 제품 질문과 답변
	public void inquiry(QnaDTO qnaDto);

	// 제품 질문과 답변 삭제
	public void QnA_delete(int qna_no);

	// 제품 질문과 답변 수정란 보기
	public QnaDTO QnA_modify_view(int qna_no);

	// 제품 질문과 답변 수정
	public void QnA_modify(QnaDTO qnaDto);

	// -------------------ajax 테스트 ------------------------------------

	public List<CommentDto> comment_List();

	public void comment_delete(int cId);

	public void comment_insert(CommentDto comment);

	public void comment_update(CommentDto comment);

}
