package com.koitt.jardin.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.product.ProductDAO;
import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {

		return productDao.list();
	}

	@Override
	public List<CategoryDto> categoryList() {
		// TODO Auto-generated method stub
		return productDao.categoryList();
	}

	@Override
	public CategoryDto categoryView() {
		// TODO Auto-generated method stub
		return productDao.categoryView();
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int productNo) {
		// TODO Auto-generated method stub
		return productDao.detail(productNo);
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
	public List<ProductInfoDTO> productInfoDto() {
		// TODO Auto-generated method stub
		return productDao.productInfoDto();
	}

}
