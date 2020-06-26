package com.koitt.jardin.controller.payment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koitt.jardin.service.payment.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@RequestMapping("payment")
	public String payment(@RequestParam(value = "list", required = false) List<Integer> product_no, Model model,
			HttpSession session) throws JsonProcessingException {
		/*
		 * if (list == null) { return "redirect:/"; } 테스트 종료시 활성화
		 */
		if (session.getAttribute("member") == null) {
			return "redirect:/login";
		}
		ObjectMapper mapper = new ObjectMapper();
		String memberInfo = mapper
				.writeValueAsString(paymentService.memberInfo((String) session.getAttribute("member")));
		model.addAttribute("memberInfo", memberInfo);
		// model.addAttribute("list", paymentService.productList(product_no.get(i)));
		model.addAttribute("counpon", paymentService.memberCoupon((String) session.getAttribute("member")));
		model.addAttribute("point", paymentService.memberPoint((String) session.getAttribute("member")));
		return "payment/payment";
	}

	@RequestMapping("couponList")
	public String couponList() {
		return "payment/couponList";
	}

}