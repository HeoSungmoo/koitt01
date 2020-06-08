package com.koitt.jardin.service.member;

import com.koitt.jardin.dto.member.MemberDTO;

public interface MembershipService {
	// 회원가입 정보 입력
	public abstract void join(MemberDTO memberDto);

	// 아이디 찾기
	public abstract MemberDTO findId(MemberDTO memberDto);

	// 비밀번호 찾기
	public abstract MemberDTO findPw(MemberDTO memberDto);

	// 로그인
	public abstract MemberDTO login(MemberDTO memberDto);

}
