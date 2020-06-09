package com.koitt.jardin.dto.board;

import java.sql.Timestamp;

public class NoticeDTO {
	int rnum;
	int no;
	String title;
	String content;
	int hit;
	Timestamp upload_date;

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

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
