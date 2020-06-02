package com.koitt.jardin.service.member;

import java.util.List;

import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

public interface MyPageService {

	public abstract List<InquiryDTO> inquiryList();
}
