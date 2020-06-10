package com.koitt.jardin.dto.member;

import java.sql.Timestamp;

public class MemberCouponDTO {

	private int no;
	private int coupon_no;
	private String category;
	private String name;
	private int value;
	private Timestamp issue_date;
	private Timestamp use_date;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCoupon_no() {
		return coupon_no;
	}

	public void setCoupon_no(int coupon_no) {
		this.coupon_no = coupon_no;
	}

	public Timestamp getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Timestamp issue_date) {
		this.issue_date = issue_date;
	}

	public Timestamp getUse_date() {
		return use_date;
	}

	public void setUse_date(Timestamp use_date) {
		this.use_date = use_date;
	}

}
