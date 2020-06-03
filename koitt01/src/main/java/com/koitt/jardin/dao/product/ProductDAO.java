package com.koitt.jardin.dao.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;

public interface ProductDAO {

	public List<ProductDTO> list();

	public List<CategoryDto> categoryList();

	public CategoryDto categoryView();

	public ProductDTO detail(int productNo);

	public List<ProductInfoDTO> productInfoDto();

	public void inquiry(ProductDTO ProductDto);

	public void photo(ProductDTO ProductDto);

	public void review(ProductDTO ProductDto);

	public ProductDTO search(int productNo);

}
