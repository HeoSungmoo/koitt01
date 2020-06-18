package com.koitt.jardin.dto.product;

import java.sql.Timestamp;

public class QnaDTO {

	private int qna_no;
	private int product_no;
	private String id;
	private String title;
	private String content;
	private Timestamp qna_date;
	private String answer;

	public int getQna_no() {
		return qna_no;
	}

	public void setQna_no(int qna_no) {
		this.qna_no = qna_no;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Timestamp getQna_date() {
		return qna_date;
	}

	public void setQna_date(Timestamp qna_date) {
		this.qna_date = qna_date;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
