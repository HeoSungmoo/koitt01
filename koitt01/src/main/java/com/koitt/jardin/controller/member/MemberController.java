package com.koitt.jardin.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koitt.jardin.dto.member.MemberDTO;
import com.koitt.jardin.service.member.MembershipService;

@Controller
public class MemberController {

	@Autowired
	private MembershipService memberService;
	// membership

	// 회원가입 - 실명확인
	@RequestMapping(method = RequestMethod.POST, value = "step01")
	public String step01(Model model) {

		return "membership/step01";
	}

	// 회원 가입 - 약관동의
	@PostMapping("step02")
	public String step02(Model model) {
		return "membership/step02";
	}

	// 회원 가입 - 회원정보입력 폼
	@RequestMapping(method = RequestMethod.POST, value = "step03")
	public String step03(Model model) {

		return "membership/step03";
	}

	// 회원 가입 - 가입완료
	@PostMapping("step04")
	public String step04(Model model, MemberDTO memberDto) {
		memberService.join(memberDto);
		return "membership/step04";
	}

	// 로그인 창
	@PostMapping("login")
	public String login(Model model) {

		return "membership/login";
	}

	@RequestMapping(method = RequestMethod.POST, value = "idSearch")
	public String idSearch(Model model) {

		return "membership/idSearch";
	}

	// 아이디 찾기 idSearch.jsp <a href = "findId">에서 넘어옴
	@PostMapping("findId")
	public String findId(Model model, MemberDTO memberDto) {
		model.addAttribute("findId", memberService.findId(memberDto));

		return "membership/id";
	}

	// 비밀번호 찾기 idSearch.jsp <a href = "findPw">에서 넘어옴
	@PostMapping("findPw")
	public String findPw(Model model, MemberDTO memberDto) {

		model.addAttribute("findPw", memberService.findPw(memberDto));
		return "membership/password";

	}

	// ------------------------------------------membership
	// 끝--------------------------------------------

	// myPage

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
	@PostMapping("inquiry")
	public String inquiry(Model model) {
		memberService.inquiryList();
		return "mypage/inquiry";
	}

	// 1:1문의 글쓰기
	@PostMapping("inquiryWrite")
	public String inquiryWrite(Model model) {

		return "mypage/inquiryWrite";
	}

	// 1:1문의 글보기
	@PostMapping("inquiryView")
	public String inquiryView(Model model) {

		return "mypage/inquiryView";
	}

	// 회원정보수정
	@PostMapping("changeInfo")
	public String changeInfo(Model model) {

		return "mypage/changeInfo";
	}

	// 회원 탈퇴
	@PostMapping("getLeave")
	public String getLeave(Model model) {

		return "mypage/getLeave";
	}

	// -------------------------myPage 끝------------------------

	// 메일링

	// 아이디 찾기 발급 페이지
	@PostMapping("id")
	public String id(Model model) {

		return "mypage/id";
	}

	// 임시 비밀번호 발급 페이지
	@PostMapping("password")
	public String password(Model model) {

		return "mypage/password";
	}

	// 회원가입 축하 페이지
	@PostMapping("join")
	public String join(Model model) {

		return "mypage/join";
	}

	// ----------------------------메일링 끝-------------------------

}
