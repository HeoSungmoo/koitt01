package com.koitt.jardin.dao.product;

import java.util.List;

import com.koitt.jardin.dto.page.ProductPageNationDTO;
import com.koitt.jardin.dto.page.ReviewPageNationDTO;
import com.koitt.jardin.dto.product.CommentDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.QnaDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

public interface ProductDAO {

	// 제품 리스트 페이지 ------------------------------------------------------------

	public List<ProductDTO> list();

	public List<ProductDTO> categoryAllList(ProductDTO productDto);

	public List<ProductDTO> categoryList(ProductDTO productDto);

	public List<ProductDTO> product_search(String search);

	// ------------------------------------------------------------------------------

	public ProductPageNationDTO productPageNation(SearchValue sv);

	public List<ProductDTO> productPageNationList(SearchValue sv);

	// 제품 상세 페이지

	// ----------------------------------------------------------------------------------
	public List<ReviewDTO> reviewPageNationList(SearchValue sv);

	public ReviewPageNationDTO reviewPageNation(SearchValue sv);

	// -----------------------------------------------------------------------------------

	public ProductDTO detail(int product_no);

	public ProductInfoDTO productInfoDto(int product_no);

	public void review(ReviewDTO reviewDto);

	public void review_delete(int review_no);

	public void review_modify(ReviewDTO reviewDto);

	public ReviewDTO review_modify_view(int review_no);

	public void photo(ReviewDTO reviewDto);

	public void inquiry(QnaDTO qnaDto);

	public List<QnaDTO> QnA_view(int product_no);

	public void QnA_delete(int qna_no);

	public QnaDTO QnA_modify_view(int qna_no);

	public void QnA_modify(QnaDTO qnaDto);

	// ajax 테스트 ---------------------------------------------------

	public List<CommentDto> comment_List();

	public void comment_insert(CommentDto comment);

	public void comment_delete(int cId);

	public void comment_update(CommentDto comment);

}
