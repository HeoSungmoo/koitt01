package com.koitt.jardin.controller.home;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.service.home.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService homeService;

	@RequestMapping("/")
	public String home(Locale locale, Model model) {

		model.addAttribute("banner", homeService.bannerList());
		return "home/home";

	}

}
