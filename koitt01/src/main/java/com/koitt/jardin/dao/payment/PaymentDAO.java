package com.koitt.jardin.dao.payment;

import java.util.List;

import com.koitt.jardin.dto.member.MemberCouponDTO;
import com.koitt.jardin.dto.member.MemberDTO;

public interface PaymentDAO {

	public MemberDTO memberInfo(String id);

	public List<MemberCouponDTO> memberCoupon(String id);

	public int memberPoint(String id);
}
