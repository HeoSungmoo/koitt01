package com.koitt.jardin.dto.member;

import java.sql.Timestamp;

public class MemberDTO {

	// membership - 회원가입 입력

	private String id; // 아이디
	private String name; // 이름
	private String password; // 비밀번호
	private String mail; // 이메일
	private String email1;
	private String email2;
	private int mail_send; // 메일 수신
	private String zip; // 우편번호
	private String address; // 주소
	private String phone; // 전화번호 합치기
	private String phone1; // 처음 휴대폰
	private String phone2; // 중간 휴대폰
	private String phone3; // 마지막 핸드폰
	private int sms; // 문자 수신
	private String tel;
	private String tel1; // 첫번째 유선전화
	private String tel2; // 두번째 유선전화
	private String tel3; // 세번째 유선전화
	private Timestamp birth; // 생일
	private String year;
	private String month;
	private String day;
	private int lunar_solar; // 양력,음력
	private Timestamp joinDate; // 회원 가입 날짜
	private Timestamp deleteDate; // 회원 탈퇴 날짜

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

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getMail_send() {
		return mail_send;
	}

	public void setMail_send(int mail_send) {
		this.mail_send = mail_send;
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

	public int getSms() {
		return sms;
	}

	public void setSms(int sms) {
		this.sms = sms;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public Timestamp getBirth() {
		return birth;
	}

	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getLunar_solar() {
		return lunar_solar;
	}

	public void setLunar_solar(int lunar_solar) {
		this.lunar_solar = lunar_solar;
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
