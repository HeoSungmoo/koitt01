package com.koitt.jardin.service.guest;

import java.util.List;

import com.koitt.jardin.dto.cart.CartDTO;

public interface GuestService {

	public List<CartDTO> cartList(String guest_ip);// 게스트 장바구니 불러오기

}
