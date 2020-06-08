package com.koitt.jardin.dto.member;

import java.sql.Timestamp;

public class MemberDTO {

	// membership - 회원가입 입력

	private String id; // 아이디
	private String name; // 이름
	private String password; // 비밀번호
	private String mail; // 이메일
	private int mailSend; // 메일 수신
	private String zip; // 우편번호
	private String address; // 주소
	private String phone; // 전화번호 합치기
	private String phone1; // 처음 휴대폰
	private String phone2; // 중간 휴대폰
	private String phone3; // 마지막 핸드폰
	private int sms; // 문자 수신
	private int tel; // 유선 전화
	private Timestamp birth; // 생일
	private int lunarSolar; // 양력,음력
	private Timestamp joinDate; // 회원 가입 날짜
	private Timestamp deleteDate; // 회원 탈퇴 날짜

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getMailSend() {
		return mailSend;
	}

	public void setMailSend(int mailSend) {
		this.mailSend = mailSend;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSms() {
		return sms;
	}

	public void setSms(int sms) {
		this.sms = sms;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public Timestamp getBirth() {
		return birth;
	}

	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	public int getLunarSolar() {
		return lunarSolar;
	}

	public void setLunarSolar(int lunarSolar) {
		this.lunarSolar = lunarSolar;
	}

	public Timestamp getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}

	public Timestamp getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

}
