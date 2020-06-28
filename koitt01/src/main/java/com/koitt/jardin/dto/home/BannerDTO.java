package com.koitt.jardin.dto.home;

public class BannerDTO {

	private int no;
	private int product_no;
	private String image;
	private int exposure_state;
	private String category1;

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getExposure_state() {
		return exposure_state;
	}

	public void setExposure_state(int exposure_state) {
		this.exposure_state = exposure_state;
	}

}
