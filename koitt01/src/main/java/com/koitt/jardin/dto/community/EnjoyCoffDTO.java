package com.koitt.jardin.dto.community;

import java.sql.Timestamp;

public class EnjoyCoffDTO {

	int no;
	String title;
	String content;
	String thumbnail;
	int hit;
	Timestamp upload_date;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Timestamp getUpload_date() {
		return upload_date;
	}

	public void setUpload_date(Timestamp upload_date) {
		this.upload_date = upload_date;
	}

}
