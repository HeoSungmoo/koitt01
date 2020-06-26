package com.koitt.jardin.dto.community;

import java.sql.Timestamp;

public class PreUserReviewDTO {

	int preUserReview; // 테스터 리뷰 글번호
	int preuser_no; // 리뷰작성할 해당 체험단 번호
	String writerId;//작성자 아이디
	String id;
	String preuser_review_image; // 이미지
	int grade;// 평가
	String title; // 리뷰 제목
	String content;// 리뷰 내용
	int hit;// 조회수
	Timestamp upload_date; // 리뷰 등록일

	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public int getPreUserReview() {
		return preUserReview;
	}

	public void setPreUserReview(int preUserReview) {
		this.preUserReview = preUserReview;
	}

	
	public int getPreuser_no() {
		return preuser_no;
	}

	public void setPreuser_no(int preuser_no) {
		this.preuser_no = preuser_no;
	}

	public String getPreuser_review_image() {
		return preuser_review_image;
	}

	public void setPreuser_review_image(String preuser_review_image) {
		this.preuser_review_image = preuser_review_image;
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
