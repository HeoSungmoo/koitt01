package com.koitt.jardin.service.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;

public interface ProductService {

	public List<ProductDTO> list();

	public ProductDTO detail(int product_No);

	public List<CategoryDto> CategoryList();

	public void inquiry(ProductDTO ProductDto);

	public void photo(ProductDTO ProductDto);

	public void review(ProductDTO ProductDto);

	public ProductDTO search(int product_No);
}
