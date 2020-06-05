package com.koitt.jardin.dto.community;

import java.sql.Timestamp;

public class PreUserDTO {
	int preuser_no;
	String title; // 체험단 제목
	String content; // 체험단 내용
	String thumbnail; // 썸네일
	int personnel; // 모집 인원
	Timestamp apply_start_date; // 신청 시작일
	Timestamp apply_end_date; // 신청 종료일
	Timestamp review_start_date; // 리뷰 시작일
	Timestamp review_end_date; // 리뷰 종료일
	Timestamp announcement_date; // 체험단 발표
	int grade; // 체험단 평점

	public int getPreuser_no() {
		return preuser_no;
	}

	public void setPreuser_no(int preuser_no) {
		this.preuser_no = preuser_no;
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

	public int getPersonnel() {
		return personnel;
	}

	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}

	public Timestamp getApply_start_date() {
		return apply_start_date;
	}

	public void setApply_start_date(Timestamp apply_start_date) {
		this.apply_start_date = apply_start_date;
	}

	public Timestamp getApply_end_date() {
		return apply_end_date;
	}

	public void setApply_end_date(Timestamp apply_end_date) {
		this.apply_end_date = apply_end_date;
	}

	public Timestamp getReview_start_date() {
		return review_start_date;
	}

	public void setReview_start_date(Timestamp review_start_date) {
		this.review_start_date = review_start_date;
	}

	public Timestamp getReview_end_date() {
		return review_end_date;
	}

	public void setReview_end_date(Timestamp review_end_date) {
		this.review_end_date = review_end_date;
	}

	public Timestamp getAnnouncement_date() {
		return announcement_date;
	}

	public void setAnnouncement_date(Timestamp announcement_date) {
		this.announcement_date = announcement_date;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
