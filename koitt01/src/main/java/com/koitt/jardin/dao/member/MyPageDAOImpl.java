package com.koitt.jardin.dao.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

@Repository
public class MyPageDAOImpl implements MyPageDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<InquiryDTO> inquiryList() {

		return sqlSession.selectList("myPage.inquiryList");
	}

	@Override
	public InquiryDTO inquiryView(int no) {

		return sqlSession.selectOne("myPage.inquiryView", no);
	}

}
