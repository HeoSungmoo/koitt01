package com.koitt.jardin.dao.member;

import java.util.List;

import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

public interface MyPageDAO {
	// 1:1문의 리스트 출력
	public abstract List<InquiryDTO> inquiryList();

	// 1:1문의 내용 출력
	public abstract InquiryDTO inquiryView(int no);
}
