package com.koitt.jardin.dto.product;

public class SubCategoryDto {

	private int sub_category_code;
	private int categoryCode;
	private String name;

	public int getSub_category_code() {
		return sub_category_code;
	}

	public void setSub_category_code(int sub_category_code) {
		this.sub_category_code = sub_category_code;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
