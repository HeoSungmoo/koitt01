package com.koitt.jardin.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.service.product.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	// 제품리스트 목록페이지
	@RequestMapping("list")
	public String list(Model model, String name) {

		model.addAttribute("list", productService.list());

		// 제품리스트 카테고리 리스트 제목 표시
		model.addAttribute("categoryList", productService.categoryList(name));
		// 제품리스트 카테고리 뷰 페이지
//		model.addAttribute("SubCategoryList", productService.SubCategoryDto(sub_category_code));

		return "product/list";
	}

	// 제품의 상세내용 (condent_view)
	@RequestMapping("detail")

	public String detail(Model model, int product_no) {

		model.addAttribute("detail", productService.detail(product_no));

		// 제품상세 제품 상세내용
		model.addAttribute("ProductInfoDto", productService.productInfoDto(product_no));
		return "product/detail";
	}

	@RequestMapping("subcategory")
	public String subcategory(Model model, int sub_category_code) {
		model.addAttribute("SubCategoryList", productService.SubCategoryDto(sub_category_code));

		return "product/list";
	}

	@RequestMapping("subcategoryList")
	public String subcategoryList(Model model) {
		model.addAttribute("subcategoryList", productService.SubCategoryDto());

		return "product/list";
	}

	// 질문과 답변 작성란 ::추후에
	@RequestMapping("Pinquiry")
	public String inquiry(ProductDTO ProductDto) {
		productService.inquiry(ProductDto);
		return "product/inquiry";
	}

	// 포토리뷰 작성란
	@RequestMapping("photo")
	public String photo(ProductDTO ProductDto) {
		productService.photo(ProductDto);
		return "product/photo";
	}

	// 구매후기 작성란
	@RequestMapping("review")
	public String review(ProductDTO ProductDto) {
		productService.review(ProductDto);
		return "product/review";
	}

	@RequestMapping("search")

	public String search(Model model, int product_No) {
		model.addAttribute("search", product_No);
		return "product/search";
	}

}
