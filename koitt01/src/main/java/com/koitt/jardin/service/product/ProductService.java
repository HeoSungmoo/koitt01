package com.koitt.jardin.service.product;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

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

	public void review(ReviewDTO reviewDto);

	public List<ReviewDTO> review_view(int product_no);

	public void review_delete(int review_no);

	public void review_modify(ReviewDTO reviewDto);

	public ReviewDTO review_modify_view(int review_no);

//	public void photo(ReviewDTO reviewDto);

	public abstract void photo(int product_no, String id, String title, String content, int grade,
			MultipartFile thumbnail) throws Exception;

	public ProductDTO search(int productNo);

}
