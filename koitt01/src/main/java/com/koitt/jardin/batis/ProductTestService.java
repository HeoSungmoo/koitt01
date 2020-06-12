package com.koitt.jardin.batis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class ProductTestService {
	@Autowired
	ProductTestMapper productTestMapper;

	public void categoryList(String category1, String category2, Model model) {
		model.addAttribute("productList", productTestMapper.categoryTest(category1, category2));

	}
}
