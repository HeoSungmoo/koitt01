package com.koitt.jardin.dao.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.member.InquiryDTO;
import com.koitt.jardin.dto.member.MemberDTO;

@Repository
public class MyPageDAOImpl implements MyPageDAO {

	@Autowired
	private SqlSession sqlSession;

	// 1:1 문의 리스트 출력
	@Override
	public List<InquiryDTO> inquiryList() {

		return sqlSession.selectList("myPage.inquiryList");
	}

	// 1:1 문의 내용 출력
	@Override
	public InquiryDTO inquiryView(int no) {

		return sqlSession.selectOne("myPage.inquiryView", no);
	}

	// 1:1 문의 글등록
	@Override
	public void writeComplete(InquiryDTO inquiryDto) {
		sqlSession.insert("myPage.writeComplete", inquiryDto);

	}

	// 회원정보 수정을 위한 정보 출력
	@Override
	public MemberDTO changeInfoView(MemberDTO memberDto) {

		return sqlSession.selectOne("myPage.changeInfoView", memberDto);
	}

	// 회원정보 수정
	@Override
	public void changeInfo(String id) {
		sqlSession.update("myPage.chageneInfo", id);

	}

	// 회원탈퇴
	@Override
	public void delete(MemberDTO memberDto) {
		sqlSession.delete("myPage.delete", memberDto);

	}

}
