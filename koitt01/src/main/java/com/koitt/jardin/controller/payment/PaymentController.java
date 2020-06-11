package com.koitt.jardin.controller.payment;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.koitt.jardin.dto.payment.PaymentDTO;
import com.koitt.jardin.service.payment.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@RequestMapping("payment")
	public String payment(@RequestParam(value = "list", required = false) List<PaymentDTO> list, Model model,
			HttpSession session) {
		if (session.getAttribute("member") == null) {
			return "redirect:/login";
		}
		model.addAttribute("list", list);
		model.addAttribute("membarInfo", paymentService.memberInfo((String) session.getAttribute("member")));
		model.addAttribute("counpon", paymentService.memberCoupon((String) session.getAttribute("member")));
		model.addAttribute("point", paymentService.memberPoint((String) session.getAttribute("member")));
		return "payment/payment";
	}

}