package com.koitt.jardin.dao.member;

import com.koitt.jardin.dto.member.MemberDTO;

public interface MemberDAO {

	// 회원가입 정보 입력
	public abstract void join(MemberDTO memberDto);

	// 아이디 찾기
	public abstract MemberDTO findId(MemberDTO memberDto);

	// 비밀번호 찾기
	public abstract MemberDTO findPw(MemberDTO memberDto);
}
