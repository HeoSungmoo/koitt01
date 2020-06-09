package com.koitt.jardin.controller.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.koitt.jardin.service.payment.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;
}
