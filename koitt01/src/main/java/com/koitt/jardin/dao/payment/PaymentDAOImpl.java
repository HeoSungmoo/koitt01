package com.koitt.jardin.dao.payment;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.member.MemberCouponDTO;
import com.koitt.jardin.dto.member.MemberDTO;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public MemberDTO memberInfo(String id) {
		return sqlSession.selectOne("payment.memberInfo", id);
	}

	@Override
	public List<MemberCouponDTO> memberCoupon(String id) {
		return sqlSession.selectList("payment.memberCoupon", id);
	}

	@Override
	public int memberPoint(String id) {
		return sqlSession.selectOne("payment.memberPoint", id);
	}

}