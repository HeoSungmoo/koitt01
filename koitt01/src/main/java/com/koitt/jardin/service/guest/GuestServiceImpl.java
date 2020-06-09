package com.koitt.jardin.service.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.guest.GuestDAO;
import com.koitt.jardin.dto.cart.CartDTO;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	GuestDAO guestDao;

	// 게스트 장바구니 불러오기
	@Override
	public List<CartDTO> cartList(String guest_ip) {
		return guestDao.cartList(guest_ip);
	}

}
