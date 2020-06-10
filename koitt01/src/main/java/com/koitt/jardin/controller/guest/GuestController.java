package com.koitt.jardin.controller.guest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.service.guest.GuestService;
import com.koitt.jardin.service.home.HomeService;

@Controller
public class GuestController {

	@Autowired
	GuestService guestService;
	@Autowired
	HomeService homeService;

	@RequestMapping("cart")
	public String cart(HttpSession session, HttpServletRequest request, Model model) {
		return "guest/cart";
	}
}