package com.koitt.jardin.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.member.MemberDAO;
import com.koitt.jardin.dto.member.MemberDTO;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Autowired
	private MemberDAO memberDao;

	// 회원가입 입력
	@Override
	public void join(MemberDTO memberDto) {
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

	// 1:1 문의(inquiry) 리스트를 출력
	@Override
	public MemberDTO inquiryList() {
		// TODO Auto-generated method stub
		return null;
	}
}
