package com.koitt.jardin.dao.product;

import java.util.List;

import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.SubCategoryDto;

public interface ProductDAO {

	public List<ProductDTO> list();

	public List<CategoryDto> categoryList(String name);

	public List<SubCategoryDto> SubCategoryDto();

	public List<ProductDTO> categoryList(String category1, String category2);

//	public ProductDTO categoryList();

	public SubCategoryDto SubCategoryDto(int sub_category_code);

	public ProductDTO detail(int product_no);

	public ProductInfoDTO productInfoDto(int product_no);

	public void inquiry(ProductDTO ProductDto);

	public void photo(ProductDTO ProductDto);

	public void review(ProductDTO ProductDto);

	public ProductDTO search(int productNo);

}
