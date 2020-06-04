package com.koitt.jardin.service.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.SubCategoryDto;

public interface ProductService {

	public List<ProductDTO> list();

	public ProductDTO detail(int productNo);

	public List<CategoryDto> categoryList(String name);

	public List<SubCategoryDto> SubCategoryDto(String name);

	public List<ProductInfoDTO> productInfoDto();

	public void inquiry(ProductDTO ProductDto);

	public void photo(ProductDTO ProductDto);

	public void review(ProductDTO ProductDto);

	public ProductDTO search(int productNo);

}
