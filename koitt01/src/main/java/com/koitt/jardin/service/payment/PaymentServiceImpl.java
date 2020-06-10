package com.koitt.jardin.service.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.payment.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentDAO paymentDao;

}