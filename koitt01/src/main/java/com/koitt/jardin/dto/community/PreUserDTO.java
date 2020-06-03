package com.koitt.jardin.dto.community;

import java.sql.Timestamp;

public class PreUserDTO {

	String title; // 체험단 제목
	String content; // 체험단 내용
	String thumbnail; // 썸네일
	int personnel; // 모집 인원
	Timestamp applyStartDate; // 신청 시작일
	Timestamp applyEndDate; // 신청 종료일
	Timestamp reviewStartDate; // 리뷰 시작일
	Timestamp reviewEndDate; // 리뷰 종료일
	Timestamp announcementDate; // 체험단 발표
	int grade; // 체험단 평점

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

	public Timestamp getApplyStartDate() {
		return applyStartDate;
	}

	public void setApplyStartDate(Timestamp applyStartDate) {
		this.applyStartDate = applyStartDate;
	}

	public Timestamp getApplyEndDate() {
		return applyEndDate;
	}

	public void setApplyEndDate(Timestamp applyEndDate) {
		this.applyEndDate = applyEndDate;
	}

	public Timestamp getReviewStartDate() {
		return reviewStartDate;
	}

	public void setReviewStartDate(Timestamp reviewStartDate) {
		this.reviewStartDate = reviewStartDate;
	}

	public Timestamp getReviewEndDate() {
		return reviewEndDate;
	}

	public void setReviewEndDate(Timestamp reviewEndDate) {
		this.reviewEndDate = reviewEndDate;
	}

	public Timestamp getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(Timestamp announcementDate) {
		this.announcementDate = announcementDate;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
