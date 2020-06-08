package com.koitt.jardin.dto.product;

public class ProductInfoDTO {

	// 상품 번호
	private int product_no;
	// 제조명
	private String name;
	// 제조원
	private String manufacturer;
	// 유통기한
	private String ShelfLife;
	// 식품의 유형
	private String foodType;
	// 영양성분
	private String nutrient;
	// 원재료명 및 함량
	private String rawMaterials;
	// 업소명 및 소재지
	private String location;
	// 내용량
	private String capacity;
	// 포장재질
	private String material;
	// 고객상담실
	private String serviceTel;
	// 유통전문판매원
	private String salesOffice;

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

	public String getShelfLife() {
		return ShelfLife;
	}

	public void setShelfLife(String shelfLife) {
		ShelfLife = shelfLife;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getNutrient() {
		return nutrient;
	}

	public void setNutrient(String nutrient) {
		this.nutrient = nutrient;
	}

	public String getRawMaterials() {
		return rawMaterials;
	}

	public void setRawMaterials(String rawMaterials) {
		this.rawMaterials = rawMaterials;
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

	public String getServiceTel() {
		return serviceTel;
	}

	public void setServiceTel(String serviceTel) {
		this.serviceTel = serviceTel;
	}

	public String getSalesOffice() {
		return salesOffice;
	}

	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}

}
