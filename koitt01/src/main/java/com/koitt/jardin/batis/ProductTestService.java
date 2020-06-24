package com.koitt.jardin.batis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.koitt.jardin.service.product.ProductService;

@Service
public class ProductTestService {
	@Autowired
	ProductTestMapper productTestMapper;

	@Autowired
	ProductService productService;

	public void categoryList(String category1, String category2, Model model, int page) {
		model.addAttribute("productList", productTestMapper.categoryTest(category1, category2, page));

	}
}
