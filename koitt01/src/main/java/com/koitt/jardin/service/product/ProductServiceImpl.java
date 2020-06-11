package com.koitt.jardin.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.product.ProductDAO;
import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.SubCategoryDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {

		return productDao.list();
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int product_no) {
		// TODO Auto-generated method stub
		return productDao.detail(product_no);
	}

	@Override
	public void inquiry(ProductDTO ProductDto) {

	}

	// 구매후기 작성란
	@Override
	public void photo(ProductDTO ProductDto) {

		productDao.photo(ProductDto);
	}

	@Override
	public void review(ProductDTO ProductDto) {

		productDao.review(ProductDto);
	}

	@Override
	public ProductDTO search(int productNo) {

		return productDao.search(productNo);
	}

	@Override
	public ProductInfoDTO productInfoDto(int product_no) {
		// TODO Auto-generated method stub
		return productDao.productInfoDto(product_no);
	}

	@Override
	public List<CategoryDto> categoryList(String name) {
		// TODO Auto-generated method stub
		return productDao.categoryList(name);
	}

	@Override
	public SubCategoryDto SubCategoryDto(int sub_category_code) {
		// TODO Auto-generated method stub
		return productDao.SubCategoryDto(sub_category_code);
	}

	@Override
	public List<SubCategoryDto> SubCategoryDto() {
		// TODO Auto-generated method stub
		return productDao.SubCategoryDto();
	}

	@Override
	public List<ProductDTO> categoryList(String category1, String category2, int page) {
		// TODO Auto-generated method stub
		return productDao.categoryList(category1, category2, page);
	}

}
