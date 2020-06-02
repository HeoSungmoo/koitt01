package com.koitt.jardin.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.member.MyPageDAO;
import com.koitt.jardin.dto.member.inquiry.InquiryDTO;

@Service
public class MyPageServiceImpl implements MyPageService {

	@Autowired
	private MyPageDAO myPageDao;

	// 1:1 문의 리스트 출력
	@Override
	public List<InquiryDTO> inquiryList() {

		return myPageDao.inquiryList();
	}

	// 1:1 문의 글보기 출력
	@Override
	public InquiryDTO inquiryView(int no) {
		myPageDao.inquiryView(no);
		return null;
	}
}
