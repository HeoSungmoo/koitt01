package com.koitt.jardin.controller.product;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.page.PhotoReviewPageNationDTO;
import com.koitt.jardin.dto.page.ProductPageNationDTO;
import com.koitt.jardin.dto.page.QnaPageNationDTO;
import com.koitt.jardin.dto.page.ReviewPageNationDTO;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.QnaDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;
import com.koitt.jardin.service.product.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	// 제품리스트 목록페이지
	@RequestMapping("list")
	public String list(Model model, SearchValue sv) {
		ProductPageNationDTO pDto = productService.productPageNation(sv);
		List<ProductDTO> list = productService.productPageNationList(sv);
		
		model.addAttribute("list", list);
		model.addAttribute("pDto", pDto);
		model.addAttribute("sv", sv);

		return "product/list";
	}

	// 카테고리 분류
	@RequestMapping("category")
	public String category(Model model, SearchValue sv, HttpServletRequest request) {
		String category1 = request.getParameter("category1");
		String category2 = request.getParameter("category2");
		List<ProductDTO> categoryAllList = productService.categoryAllList(sv);
		List<ProductDTO> categoryList = productService.categoryList(sv);
		ProductPageNationDTO pDtoAll = productService.categoryPageNationListDTO(sv);
		ProductPageNationDTO pDto = productService.categoryPageNationDTO(sv);

		if (request.getParameter("category2") == null) {
			System.out.println("카테고리2가 null일때 :" + category2);
			model.addAttribute("product", categoryAllList);
			model.addAttribute("pDto", pDtoAll);

		} else {
			System.out.println("카테고리2가 null이아닐때 :" + category2);
			model.addAttribute("product", categoryList);
			model.addAttribute("pDto", pDto);
		}

		model.addAttribute("sv", sv);
		model.addAttribute("category1", category1);
		model.addAttribute("category2", category2);

		return "product/categoryList";
	}

	// 제품 카테고리
//	@RequestMapping({ "/product/{category1}/{category2}", "/product/{category1}/{category2}/{page_}" })
//	public String category_list(@PathVariable("category1") String category1,
//			@PathVariable("category2") String category2, @PathVariable Optional<Integer> page_, Model model) {
//		int page = page_.isPresent() ? page_.get() : 1;
//
//		productTestService.categoryList(category1, category2, model, page);
//
//		return "product/categoryList";
//	}

	// 페이지 상단 헤더
	@RequestMapping("header")

	public String header(Model model, String name) {
		model.addAttribute("list", productService.list());

		return "include/header";
	}

	// 제품의 상세내용 (condent_view)
	@RequestMapping("/detail")

	public String detail(Model model, int product_no, SearchValue sv,
			@RequestParam(value = "initVal", defaultValue = "0") int initVal) {
//		model.addAttribute("review_view", productService.reviewPageNationList(sv));
		model.addAttribute("detail", productService.detail(product_no));
		model.addAttribute("ProductInfoDto", productService.productInfoDto(product_no));
		// 포토리뷰 뿌려주기
		List<ReviewDTO> PhotoReview_list = productService.PhotoReviewPageNationList(sv);
		PhotoReviewPageNationDTO PhotoRdto = productService.PhotoReviewPageNation(sv);
		model.addAttribute("PhotoReview_view", PhotoReview_list);
		model.addAttribute("PhotoRdto", PhotoRdto);
		// 리뷰 뿌려주기
		List<ReviewDTO> Review_list = productService.ReviewPageNationList(sv);
		ReviewPageNationDTO rdto = productService.ReviewPageNation(sv);
		model.addAttribute("review_view", Review_list);
		model.addAttribute("rDto", rdto);

		// 질문과 답변 뿌려주기
		List<QnaDTO> QnapageNationList = productService.QnApageNationList(sv);
		QnaPageNationDTO qDto = productService.QnApageNation(sv);
		model.addAttribute("qna_view", QnapageNationList);
		model.addAttribute("qDto", qDto);

		model.addAttribute("initVal", initVal);
		model.addAttribute("sv", sv);
		return "product/detail";
	}

	// 구매후기 작성란 보기
	@RequestMapping("review_view")
	public String review_view(int product_no, Model model) {
		model.addAttribute("product_no", product_no);

		return "product/review";
	}

	// 구매후기 작성
	@RequestMapping("/review")
	public String review(ReviewDTO reviewDto, int product_no, Model model, HttpSession session) {
		reviewDto.setId((String) session.getAttribute("member"));
		productService.review(reviewDto);

		model.addAttribute("product_no", product_no);
		return "redirect:/detail?product_no=" + product_no;
	}

	// 후기리뷰 삭제
	@RequestMapping("/review_delete")
	public String review_delete(HttpSession session, ReviewDTO reviewDto, int review_no, int product_no) {
		reviewDto.setId((String) session.getAttribute("member"));
		productService.review_delete(review_no);

		return "redirect:/detail?product_no=" + product_no;
	}

	// 후기리뷰 수정
	@RequestMapping("/review_modify")
	public String review_modify(HttpSession session, ReviewDTO reviewDto, int review_no, int product_no) {
		reviewDto.setId((String) session.getAttribute("member"));
		productService.review_modify(reviewDto);

		return "redirect:/detail?product_no=" + product_no;
	}

	// 후기리뷰 수정란 보기
	@RequestMapping("/review_modify_view")
	public String review_modify_view(int product_no, Model model, int review_no, HttpSession session,
			ReviewDTO reviewDto) {
		reviewDto.setId((String) session.getAttribute("member"));
		model.addAttribute("review_modify_view", productService.review_modify_view(review_no));
		model.addAttribute("product_no", product_no);
		model.addAttribute("review_no", review_no);
		return "product/review_modify_view";
	}

	// 포토리뷰 작성란 보기
	@RequestMapping("photo_view")
	public String photo_view(int product_no, Model model) {
		model.addAttribute("product_no", product_no);

		return "product/photo";
	}

	// 포토리뷰 작성
	@RequestMapping(method = RequestMethod.POST, value = "photo")
	public String photo(HttpSession session, Model model, int product_no, String title, String content, int grade,
			MultipartFile thumbnail) throws Exception {

		productService.photo(product_no, title, content, grade, thumbnail, (String) session.getAttribute("member"));
		model.addAttribute("product_no", product_no);
		return "redirect:/detail?product_no=" + product_no;
	}

	// 해당제품 질문과 답변 작성란 보기
	@RequestMapping("inquiry_view")
	public String inquiry_view(Model model, int product_no) {

		model.addAttribute("product_no", product_no);
		return "product/inquiry";
	}

	// 해당제품 질문과 답변 작성란 보기
	@RequestMapping("product_inquiry")
	public String inquiry(Model model, QnaDTO qnaDto, HttpSession session) {
		qnaDto.setId((String) session.getAttribute("member"));
		productService.inquiry(qnaDto);
		model.addAttribute("product_no", qnaDto.getProduct_no());
		System.out.println(qnaDto.getProduct_no() + "상품번호");
		return "redirect:/detail?product_no=" + qnaDto.getProduct_no();
	}

	// 해당제품 질문과 답변 삭제
	@RequestMapping("qna_delete")
	public String qna_delete(QnaDTO qnaDto, HttpSession session, int qna_no) {
		qnaDto.setId((String) session.getAttribute("member"));
		productService.QnA_delete(qna_no);

		return "redirect:/detail?product_no=" + qnaDto.getProduct_no();
	}

	// 해당제품 질문과 답변 작성란 보기
	@RequestMapping("qna_modify_view")
	public String qna_modify_view(Model model, int product_no, int qna_no) {
		model.addAttribute("product_no", product_no);
		model.addAttribute("qna_no", qna_no);
		model.addAttribute("qna_modify_view", productService.QnA_modify_view(qna_no));
		return "product/QnA_modify_view";
	}

	// 해당제품 질문과 답변 수정
	@RequestMapping("qna_modify")
	public String qna_modify(Model model, QnaDTO qnaDto, HttpSession session, int qna_no, int product_no) {
		qnaDto.setId((String) session.getAttribute("member"));

		model.addAttribute("product_no", product_no);
		model.addAttribute("qna_no", qna_no);

		productService.QnA_modify(qnaDto);
		return "redirect:/detail?product_no=" + qnaDto.getProduct_no();
	}

	// 제품 검색
	@RequestMapping("product_search")
	public String search(Model model, SearchValue sv, HttpServletRequest request) {

		// 제품 신상품순 정렬
		List<ProductDTO> Psearch = productService.productSearchPageNationList(sv);
		// 제품 높은가격순 정렬
		List<ProductDTO> HighPircePageNationList = productService.HighPircePageNationList(sv);
		// 제품 낮은가격순 정렬
		List<ProductDTO> LowPircePageNationList = productService.LowPircePageNationList(sv);
		ProductPageNationDTO pDto = productService.productSearchPageNation(sv);

		if (sv.getSelectPrice().equals("2")) {
			model.addAttribute("product_search", HighPircePageNationList);
			model.addAttribute("pDto", pDto);
			model.addAttribute("selectPrice", sv.getSelectPrice());

		} else if (sv.getSelectPrice().equals("1")) {
			model.addAttribute("product_search", LowPircePageNationList);
			model.addAttribute("pDto", pDto);
			model.addAttribute("selectPrice", sv.getSelectPrice());
		} else {
			model.addAttribute("product_search", Psearch);
			model.addAttribute("pDto", pDto);
			model.addAttribute("selectPrice", sv.getSelectPrice());
		}

		model.addAttribute("sv", sv);

		return "product/search";
	}

}
