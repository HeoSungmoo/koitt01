package com.koitt.jardin.service.payment;

import java.util.List;

import com.koitt.jardin.dto.member.MemberCouponDTO;
import com.koitt.jardin.dto.member.MemberDTO;

public interface PaymentService {

	public MemberDTO memberInfo(String id);

	public List<MemberCouponDTO> memberCoupon(String id);

	public int memberPoint(String id);
}
