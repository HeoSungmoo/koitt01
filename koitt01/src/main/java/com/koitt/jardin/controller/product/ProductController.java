package com.koitt.jardin.controller.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.koitt.jardin.batis.ProductTestService;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.service.product.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	ProductTestService productTestService;

	// 제품리스트 목록페이지
	@RequestMapping("list")
	public String list(Model model) {

		model.addAttribute("list", productService.list());
		return "product/list";
	}

//	@RequestMapping("category")
//	public String category(Model model, HttpServletRequest request) {
//		String category1 = request.getParameter("category1");
//		String category2 = null;
//
//		if (request.getParameter("category2") == null) {
//			model.addAttribute("product", productService.categoryList(category1));
//		} else {
//			model.addAttribute("product", productService.categoryList(category2));
//		}
//
//		return "product/list";
//	}

//	@RequestMapping("category")
//	public String category(Model model) {
//		model.addAttribute("categoryList", productService.categoryList());
//
//		return "product/list";
//	}

	@RequestMapping({ "/product/{category1}/{category2}", "/product/{category1}/{category2}/{page_}" })
	public String category_list(@PathVariable("category1") String category1,
			@PathVariable("category2") String category2, @PathVariable Optional<Integer> page_, Model model) {
		int page = page_.isPresent() ? page_.get() : 1;
//		model.addAttribute("product", productService.categoryList(category1, category2, page));

		productTestService.categoryList(category1, category2, model, page);

		return "product/categoryList";
	}

	@RequestMapping("header")

	public String header(Model model, String name) {
		model.addAttribute("list", productService.list());
		model.addAttribute("categoryList", productService.categoryList(name));

		return "include/header";
	}

	// 제품의 상세내용 (condent_view)
	@RequestMapping("/detail")

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
