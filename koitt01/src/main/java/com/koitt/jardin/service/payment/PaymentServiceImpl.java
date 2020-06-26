package com.koitt.jardin.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.payment.PaymentDAO;
import com.koitt.jardin.dto.member.MemberCouponDTO;
import com.koitt.jardin.dto.member.MemberDTO;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentDAO paymentDao;

//	

	@Override
	public MemberDTO memberInfo(String id) {
		return paymentDao.memberInfo(id);
	}

	@Override
	public List<MemberCouponDTO> memberCoupon(String id) {
		return paymentDao.memberCoupon(id);
	}

	@Override
	public int memberPoint(String id) {
		return paymentDao.memberPoint(id);
	}

}