package com.koitt.jardin.dao.community;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.community.PreUserDTO;

@Repository
public class CommunityDAOImpl implements CommunityDAO {

	@Autowired
	SqlSession sqlSession;

	// 체험단 글 리스트
	@Override
	public List<PreUserDTO> expr() {
		sqlSession.selectList("community.expr");
		return null;
	}

	// 체험단 글 보기
	@Override
	public PreUserDTO exprReview(int preUserNo) {

		return sqlSession.selectOne("community.exprReview", preUserNo);
	}

	// 체험단 리뷰 글 쓰기
	@Override
	public void preUserReview(int preUserApplyNo) {
		sqlSession.insert("community.preUserReview", preUserApplyNo);

	}

	// 체험단 신청 글쓰기
	@Override
	public void preUserApply(int preUserApplyNo) {
		sqlSession.insert("community.preUserApply", preUserApplyNo);

	}

}
