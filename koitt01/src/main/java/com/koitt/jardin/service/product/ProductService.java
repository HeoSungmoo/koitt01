package com.koitt.jardin.service.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.ReviewDTO;

public interface ProductService {

	public List<ProductDTO> list();

	public ProductDTO detail(int product_no);

	public List<CategoryDto> categoryList(String name);

	public ProductInfoDTO productInfoDto(int product_no);

	public void inquiry(ProductDTO ProductDto);

	public void photo(ProductDTO ProductDto);

	public void review(ReviewDTO reviewDto);

	public List<ReviewDTO> review_view(int product_no);

	public ProductDTO search(int productNo);

}
