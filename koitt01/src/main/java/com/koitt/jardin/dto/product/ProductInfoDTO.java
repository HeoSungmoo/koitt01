package com.koitt.jardin.dto.product;

public class ProductInfoDTO {

	// 상품 번호
	private int product_no;
	// 제조명
	private String name;
	// 제조원
	private String manufacturer;
	// 유통기한
	private String shelf_life;
	// 식품의 유형
	private String food_type;
	// 영양성분
	private String nutrient;
	// 원재료명 및 함량
	private String raw_materials;
	// 업소명 및 소재지
	private String location;
	// 내용량
	private String capacity;
	// 포장재질
	private String material;
	// 고객상담실
	private String service_tel;
	// 유통전문판매원
	private String sales_office;

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getNutrient() {
		return nutrient;
	}

	public void setNutrient(String nutrient) {
		this.nutrient = nutrient;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getShelf_life() {
		return shelf_life;
	}

	public void setShelf_life(String shelf_life) {
		this.shelf_life = shelf_life;
	}

	public String getFood_type() {
		return food_type;
	}

	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}

	public String getRaw_materials() {
		return raw_materials;
	}

	public void setRaw_materials(String raw_materials) {
		this.raw_materials = raw_materials;
	}

	public String getService_tel() {
		return service_tel;
	}

	public void setService_tel(String service_tel) {
		this.service_tel = service_tel;
	}

	public String getSales_office() {
		return sales_office;
	}

	public void setSales_office(String sales_office) {
		this.sales_office = sales_office;
	}

}
