package com.koitt.jardin.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	@RequestMapping(method = RequestMethod.GET, value = "step01")
	public String step01(Model model) {

		return "membership/join/step01";
	}

	// 회원 가입 - 약관동의
	@RequestMapping("step02")
	public String step02(Model model) {
		return "membership/join/step02";
	}

	// 회원 가입 - 회원정보입력 폼
	@RequestMapping(method = RequestMethod.GET, value = "step03")
	public String step03(Model model) {

		return "membership/join/step03";
	}

	// 아이디 중복 체크 폼
	@RequestMapping("idCheck")
	public String idCheck() {

		return "membership/join/idCheck";
	}

	// 회원 가입 - 가입완료
	@RequestMapping("userInfo")
	public String step04(Model model, MemberDTO memberDto) {
		System.out.println(memberDto.getId());
		System.out.println(memberDto.getYear());
		System.out.println(memberDto.getMonth());
		System.out.println(memberDto.getDay());
		memberService.join(memberDto);
		return "membership/join/step04";
	}

	// 로그인 창
	@RequestMapping("login")
	public String login(Model model, HttpSession session) {
		if (session.getAttribute("member") == null) {
			return "membership/login";
		}
		return "redirect:/";
	}

	@RequestMapping("loginOk")
	public String loginOk(Model model, MemberDTO memberDto, HttpServletRequest request) {

		System.out.println(memberDto.getId());
		System.out.println(memberDto.getPassword());
		HttpSession session = request.getSession();
		String id = memberService.login(memberDto);

		if (id == null) {
			return "membership/login";
		} else {
			session.setAttribute("member", id);
			return "redirect:/";

		}

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
