package com.koitt.jardin.batis;

import java.util.ArrayList;

import com.koitt.jardin.dto.product.ProductDTO;

public interface ProductTestMapper {

	public ArrayList<ProductDTO> categoryTest(String category1, String category2, int page);

}
