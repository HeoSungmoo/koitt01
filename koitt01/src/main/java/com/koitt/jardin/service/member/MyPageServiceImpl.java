package com.koitt.jardin.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.member.MyPageDAO;
import com.koitt.jardin.dto.member.MemberDTO;
import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

@Service
public class MyPageServiceImpl implements MyPageService {

	@Autowired
	private MyPageDAO myPageDao;

	// 1:1 문의 리스트 출력
	@Override
	public List<InquiryDTO> inquiryList() {

		// 페이지 네이션
		return myPageDao.inquiryList();
	}

	// 1:1 문의 글보기 출력
	@Override
	public InquiryDTO inquiryView(int no) {

		return myPageDao.inquiryView(no);
	}

	// 1:1 문의 글등록
	@Override
	public void writeComplete(InquiryDTO inquiryDto) {
		myPageDao.writeComplete(inquiryDto);

	}

	// 회원 수정 정보출력
	@Override
	public MemberDTO changeInfoView(MemberDTO memberDto) {

		return myPageDao.changeInfoView(memberDto);
	}

	// 회원 수정
	@Override
	public void changeInfo(String id) {
		myPageDao.changeInfo(id);

	}

	// 회원 탈퇴
	@Override
	public void delete(MemberDTO memberDto) {
		myPageDao.delete(memberDto);

	}
}
