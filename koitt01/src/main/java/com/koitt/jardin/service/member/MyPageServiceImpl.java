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

	@Override
	public List<InquiryDTO> inquiryList() {
		myPageDao.inquiryList();
		return null;
	}
}
