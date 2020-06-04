package com.koitt.jardin.dto.product;

public class SubCategoryDto {

	private int subCategoryCode;
	private int categoryCode;
	private String name;

	public int getSubCategoryCode() {
		return subCategoryCode;
	}

	public void setSubCategoryCode(int subCategoryCode) {
		this.subCategoryCode = subCategoryCode;
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
