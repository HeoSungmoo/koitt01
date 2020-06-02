package com.koitt.jardin.dao.member;

import java.util.List;

import com.koitt.jardin.dto.member.MemberDTO;
import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

public interface MyPageDAO {
	// 1:1문의 리스트 출력
	public abstract List<InquiryDTO> inquiryList();

	// 1:1문의 내용 출력
	public abstract InquiryDTO inquiryView(int no);

	// 1:1문의 글등록
	public abstract void writeComplete(InquiryDTO inquiryDto);

	// 회원정보 수정을 위한 정보 출력
	public abstract MemberDTO changeInfoView(MemberDTO memberDto);

	// 회원정보 수정
	public abstract void changeInfo(String id);

	// 회원탈퇴
	public abstract void delete(MemberDTO memberDto);
}
