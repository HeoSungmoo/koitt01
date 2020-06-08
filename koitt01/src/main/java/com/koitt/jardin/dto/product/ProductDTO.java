package com.koitt.jardin.dto.product;

import java.security.Timestamp;

public class ProductDTO {

	private int product_no;
	private int sub_category_code;
	private String title;
	private int price;
	private int point;
	private String kcal;
	private int grade;
	private int volume;
	private String thumbNail;
	private String image1;
	private String image2;
	private String image3;
	private String detail;
	private Timestamp uploadDate;
	private int product_stock;
	private int exposureState;

	ProductDTO() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKcal() {
		return kcal;
	}

	public void setKcal(String kcal) {
		this.kcal = kcal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getSub_category_code() {
		return sub_category_code;
	}

	public void setSub_category_code(int sub_category_code) {
		this.sub_category_code = sub_category_code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getThumbNail() {
		return thumbNail;
	}

	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Timestamp getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Timestamp uploadDate) {
		this.uploadDate = uploadDate;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public int getExposureState() {
		return exposureState;
	}

	public void setExposureState(int exposureState) {
		this.exposureState = exposureState;
	}

}
