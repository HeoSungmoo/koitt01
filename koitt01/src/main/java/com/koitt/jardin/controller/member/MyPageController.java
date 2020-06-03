package com.koitt.jardin.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koitt.jardin.dto.member.InquiryDTO;
import com.koitt.jardin.dto.member.MemberDTO;
import com.koitt.jardin.service.member.MyPageService;

@Controller
public class MyPageController {

	// myPage
	@Autowired
	private MyPageService myPageService;

	// 주문/배송 조회
	@RequestMapping(method = RequestMethod.POST, value = "orderCheck")
	public String orderCheck(Model model) {

		return "mypage/orderCheck";
	}

	// 반품/교환 현황
	@PostMapping("takebackDelivery")
	public String takebackDelivery(Model model) {

		return "mypage/takebackDelivery";
	}

	// 반품/교환 현황
	@PostMapping("takebackState")
	public String takebackState(Model model) {

		return "mypage/takebackState";
	}

	// 장바구니
	@PostMapping("cart")
	public String cart(Model model) {

		return "mypage/cart";
	}

	// 쿠폰
	@PostMapping("coupon")
	public String coupon(Model model) {

		return "mypage/coupon";
	}

	// 포인트
	@PostMapping("point")
	public String point(Model model) {

		return "mypage/point";
	}

	// 1:1문의 리스트
	@GetMapping("inquiry")
	public String inquiry(Model model) {

		model.addAttribute("inquiryList", myPageService.inquiryList());
		return "mypage/inquiry";
	}

	// 1:1문의 글쓰기
	@PostMapping("inquiryWrite")
	public String inquiryWrite(Model model) {

		return "mypage/inquiryWrite";
	}

	// 1:1문의 글쓰고 글등록
	@PostMapping("writeComplete")
	public String writeComplete(Model model, InquiryDTO inquiryDto) {

		myPageService.writeComplete(inquiryDto);
		return "redirect:mypage/inquiry";
	}

	// 1:1문의 글보기
	@PostMapping("inquiryView")
	public String inquiryView(Model model, int no) {

		model.addAttribute("inquiryView", myPageService.inquiryView(no));
		return "mypage/inquiryView";
	}

	// 회원정보수정하기위한 정보 출력
	@PostMapping("changeInfoView")
	public String changeInfoView(Model model, MemberDTO memberDto) {
		model.addAttribute("changeInfoView", myPageService.changeInfoView(memberDto));
		return "mypage/changeInfoView";
	}

	// 회원정보수정
	public String changeInfo(String id) {
		myPageService.changeInfo(id);
		return "메인페이지(로그아웃)";
	}

	// 회원 탈퇴 페이지 이동
	@PostMapping("getLeave")
	public String getLeave() {

		return "mypage/getLeave";
	}

	// 아이디와 비밀번호 탈퇴사유 입력후 탈퇴
	public String Delete(MemberDTO memberDto) {
		myPageService.delete(memberDto);
		return "메인페이지(로그아웃)";
	}

	// -------------------------myPage 끝------------------------

}
