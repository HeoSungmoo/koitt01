package com.koitt.jardin.dao.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.QnaDTO;
import com.koitt.jardin.dto.product.ReviewDTO;

public interface ProductDAO {

	public List<ProductDTO> list();

	public List<CategoryDto> categoryList(String name);

	public ProductDTO detail(int product_no);

	public ProductInfoDTO productInfoDto(int product_no);

	public void review(ReviewDTO reviewDto);

	public List<ReviewDTO> review_view(int product_no);

	public void review_delete(int review_no);

	public void review_modify(ReviewDTO reviewDto);

	public ReviewDTO review_modify_view(int review_no);

	public void photo(ReviewDTO reviewDto);

	public void inquiry(QnaDTO qnaDto);

	public ProductDTO search(int productNo);

}
