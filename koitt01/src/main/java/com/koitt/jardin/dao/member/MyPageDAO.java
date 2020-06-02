package com.koitt.jardin.dao.member;

import java.util.List;

import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

public interface MyPageDAO {

	public abstract List<InquiryDTO> inquiryList();
}
