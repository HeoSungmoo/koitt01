package com.koitt.jardin.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.product.ProductDAO;
import com.koitt.jardin.dto.product.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO PDao;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {

		return PDao.list();
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int product_No) {
		// TODO Auto-generated method stub
		return PDao.detail(product_No);
	}

	// 구매후기 작성란
	@Override
	public void photo(ProductDTO ProductDto) {

		PDao.photo(ProductDto);
	}

	@Override
	public void review(ProductDTO ProductDto) {

		PDao.review(ProductDto);
	}

	@Override
	public ProductDTO search(int product_No) {

		return PDao.search(product_No);
	}

}
