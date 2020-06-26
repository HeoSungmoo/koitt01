package com.koitt.jardin.dto.member;

import java.sql.Timestamp;

public class PointDTO {
	private int point_no;
	private String id;
	private String content;
	private int point_value;
	private Timestamp accumulate_date;
	private Timestamp use_date;
	private int total_point;

	public int getPoint_no() {
		return point_no;
	}

	public void setPoint_no(int point_no) {
		this.point_no = point_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPoint_value() {
		return point_value;
	}

	public void setPoint_value(int point_value) {
		this.point_value = point_value;
	}

	public Timestamp getAccumulate_date() {
		return accumulate_date;
	}

	public void setAccumulate_date(Timestamp accumulate_date) {
		this.accumulate_date = accumulate_date;
	}

	public Timestamp getUse_date() {
		return use_date;
	}

	public void setUse_date(Timestamp use_date) {
		this.use_date = use_date;
	}

	public int getTotal_point() {
		return total_point;
	}

	public void setTotal_point(int total_point) {
		this.total_point = total_point;
	}

}
