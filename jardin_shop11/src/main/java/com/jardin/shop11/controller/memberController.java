package com.jardin.shop11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class memberController {

	@RequestMapping("join1")
	public String join1() {

		return "member/join1";
	}

	@RequestMapping("step03")
	public String jo1() {

		return "member/step03";
	}

	@RequestMapping("join")
	public String join() {

		return "member/join";
	}

	@RequestMapping("userInfo")
	public String userInfo() {

		return "member/userInfo";
	}

}
