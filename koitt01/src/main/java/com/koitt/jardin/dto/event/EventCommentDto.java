package com.koitt.jardin.dto.event;

import java.security.Timestamp;

public class EventCommentDto {

	private int comment_no;
	private int event_no;
	private String comment_content;
	private Timestamp comment_data;
	private int secret;

	public int getComment_no() {
		return comment_no;
	}

	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}

	public int getEvent_no() {
		return event_no;
	}

	public void setEvent_no(int event_no) {
		this.event_no = event_no;
	}

	public String getComment_content() {
		return comment_content;
	}

	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

	public Timestamp getComment_data() {
		return comment_data;
	}

	public void setComment_data(Timestamp comment_data) {
		this.comment_data = comment_data;
	}

	public int getSecret() {
		return secret;
	}

	public void setSecret(int secret) {
		this.secret = secret;
	}

}
