package com.koitt.jardin.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.service.product.ProductService;

@Controller
public class ProductController {

	ProductService pService;

	@RequestMapping("list")
	public String List() {

		return "product/list";
	}

	@RequestMapping("detail")
	public String Detail() {

		return "product/detail";
	}

	@RequestMapping("Pinquiry")
	public String Inquiry() {
		return "product/inquiry";
	}

	@RequestMapping("photo")
	public String Photo() {
		return "product/photo";
	}

	@RequestMapping("review")
	public String Review() {
		return "product/review";
	}

	@RequestMapping("search")
	public String Search() {
		return "product/search";
	}

}
