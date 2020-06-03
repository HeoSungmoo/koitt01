package com.koitt.jardin.dto.community;

import java.sql.Timestamp;

public class PreUserReviewDTO {

	int preUserReview; // 테스터 리뷰 글번호
	int preUserApplyNo; // 체험단 신청 번호
	String preUserReviewImage; // 이미지
	int grade;// 평가
	String title; // 리뷰 제목
	String content;// 리뷰 내용
	int hit;// 조회수
	Timestamp upload_date; // 리뷰 등록일

	public int getPreUserReview() {
		return preUserReview;
	}

	public void setPreUserReview(int preUserReview) {
		this.preUserReview = preUserReview;
	}

	public int getPreUserApplyNo() {
		return preUserApplyNo;
	}

	public void setPreUserApplyNo(int preUserApplyNo) {
		this.preUserApplyNo = preUserApplyNo;
	}

	public String getPreUserReviewImage() {
		return preUserReviewImage;
	}

	public void setPreUserReviewImage(String preUserReviewImage) {
		this.preUserReviewImage = preUserReviewImage;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
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
