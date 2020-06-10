package com.koitt.jardin.service.member;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.member.MembershipDAO;
import com.koitt.jardin.dto.member.MemberDTO;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MembershipDAO memberDao;

	// 회원가입 입력
	@Override
	public void join(MemberDTO memberDto) {
		// 휴대전화번호 합치기
		String phone = memberDto.getPhone1() + "-" + memberDto.getPhone2() + "-" + memberDto.getPhone3();
		memberDto.setPhone(phone);

		// 전화번호 합치기
		String tel = memberDto.getTel1() + "-" + memberDto.getTel2() + "-" + memberDto.getTel3();
		memberDto.setTel(tel);

		// 이메일 합치기
		String mail = memberDto.getEmail1() + "@" + memberDto.getEmail2();
		memberDto.setMail(mail);

		String strBirth = memberDto.getYear() + "-" + memberDto.getMonth() + "-" + memberDto.getDay() + " 00:00:00.0";
		System.out.println(strBirth);
		// 생년월일
		Timestamp birth = Timestamp.valueOf(strBirth);
		memberDto.setBirth(birth);
		System.out.println(memberDto.getBirth());

		//
		// memberDto.setBirth(birth);
		memberDao.join(memberDto);

	}

	// 아이디 찾기
	@Override
	public MemberDTO findId(MemberDTO memberDto) {
		return memberDao.findId(memberDto);

	}

	// 비밀번호 찾기
	@Override
	public MemberDTO findPw(MemberDTO memberDto) {
		return memberDao.findPw(memberDto);
	}

	// 로그인
	@Override
	public String login(MemberDTO memberDto) {

		System.out.println(memberDto.getId());
		System.out.println(memberDto.getPassword());

		return memberDao.login(memberDto);
	}

}
