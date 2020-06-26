package com.koitt.jardin.dao.guest;

import java.util.List;

import com.koitt.jardin.dto.cart.CartDTO;

public interface GuestDAO {

	public List<CartDTO> cartList(String guest_ip);// 게스트 장바구니 불러오기

}
