package com.koitt.jardin.dao.guest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.jardin.dto.cart.CartDTO;

@Repository
public class GuestDAOImpl implements GuestDAO {

	@Autowired
	SqlSession sqlSession;

	// 게스트 장바구니 불러오기
	@Override
	public List<CartDTO> cartList(String guest_ip) {
		return sqlSession.selectList("guest.cartList", guest_ip);
	}

}
