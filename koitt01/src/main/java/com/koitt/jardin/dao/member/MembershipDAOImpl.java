package com.koitt.jardin.dao.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.member.MemberDTO;

@Repository
public class MembershipDAOImpl implements MembershipDAO {
	@Autowired
	private SqlSession sqlSession;

	// 회원가입 정보 입력
	@Override
	public void join(MemberDTO memberDto) {
		sqlSession.insert("member.join", memberDto);
		sqlSession.insert("member.joinPoint", memberDto);

	}

	// 아이디 찾기
	@Override
	public MemberDTO findId(MemberDTO memberDto) {
		return sqlSession.selectOne("member.findId", memberDto);

	}

	// 비밀번호 찾기
	@Override
	public MemberDTO findPw(MemberDTO memberDto) {

		return sqlSession.selectOne("member.findPw", memberDto);
	}

	// 로그인
	@Override
	public String login(MemberDTO memberDto) {

		System.out.println(memberDto.getId());
		return sqlSession.selectOne("member.login", memberDto);
	}

}
