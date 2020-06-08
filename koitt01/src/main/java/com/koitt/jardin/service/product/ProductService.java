package com.koitt.jardin.service.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.SubCategoryDto;

public interface ProductService {

	public List<ProductDTO> list();

	public ProductDTO detail(int product_no);

	public List<CategoryDto> categoryList(String name);

	public List<SubCategoryDto> SubCategoryDto();

	public SubCategoryDto SubCategoryDto(int sub_category_code);

	public ProductInfoDTO productInfoDto(int product_no);

	public void inquiry(ProductDTO ProductDto);

	public void photo(ProductDTO ProductDto);

	public void review(ProductDTO ProductDto);

	public ProductDTO search(int productNo);

}
