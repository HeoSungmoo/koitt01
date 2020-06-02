package com.koitt.jardin.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("list")
	public String List() {

		return "product/List";
	}

	@RequestMapping("detail")
	public String Detail() {

		return "product/Detail";
	}

}
