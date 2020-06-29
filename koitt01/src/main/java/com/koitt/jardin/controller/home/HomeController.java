package com.koitt.jardin.controller.home;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public String home(Locale locale, Model model, HttpServletRequest request, HttpSession session) {

		model.addAttribute("bannerList", homeService.bannerList());// 배너 리스트 불러오기
		model.addAttribute("hitList", homeService.hitList());// 베스트셀러 리스트 불러오기
		model.addAttribute("saleList", homeService.saleList());// 할인상품 리스트 불러오기
		model.addAttribute("tel", homeService.tel());// 고객센터 전화번호 불러오기
		model.addAttribute("notice", homeService.notice());// 공지사항 상위글 3개 불러오기
		model.addAttribute("enjoyCoffee", homeService.enjoyCoffee());// 인조이 사위글 3개 불러오기
		model.addAttribute("list", homeService.list());
		model.addAttribute("homeBannerList", homeService.homeBannerList());

		return "home/home";

	}

}
