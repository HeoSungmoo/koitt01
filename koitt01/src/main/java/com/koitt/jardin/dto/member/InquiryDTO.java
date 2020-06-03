package com.koitt.jardin.dto.member;

import java.sql.Timestamp;

public class InquiryDTO {

	private int no; // 1:1 문의리스트 넘버
	private String id; // 아이디
	private String category; // 분류
	private String title; // 제목
	private String content; // 내용
	private String fileName; // 첨부파일
	private Timestamp uploadDate; // 첨부파일등록일
	private String answer; // 답글
	private Timestamp answerDate;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Timestamp uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Timestamp getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Timestamp answerDate) {
		this.answerDate = answerDate;
	}

}
