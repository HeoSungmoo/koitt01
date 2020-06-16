package com.koitt.jardin.dto.product;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

	public ArrayList<ProductDTO> categoryTest(String category1, String category2);

}