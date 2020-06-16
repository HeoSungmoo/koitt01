package com.koitt.jardin.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.product.ProductDAO;
import com.koitt.jardin.dto.product.CategoryDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.ReviewDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;

//	@Autowired
//	ProductTestMapper productMapper;

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
	public void review(ReviewDTO reviewDto) {

		productDao.review(reviewDto);

	}
//	@Override
//	public void categoryList(Model model) {
//
//		String category1 = model.asMap().get("category1").toString();
//		String category2 = model.asMap().get("category2").toString();
//		// TODO Auto-generated method stub
//
//		model.addAttribute("categoryTest", productDao.categoryList(category1, category2));
//	}

	@Override
	public List<ReviewDTO> review_view(int product_no) {
		// TODO Auto-generated method stub
		return productDao.review_view(product_no);
	}

	@Override
	public void review_delete(int review_no) {

		productDao.review_delete(review_no);

	}

}
