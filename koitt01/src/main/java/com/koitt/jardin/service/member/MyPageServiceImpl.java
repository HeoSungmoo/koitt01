package com.koitt.jardin.service.member;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dao.member.MyPageDAO;
import com.koitt.jardin.dto.member.InquiryDTO;
import com.koitt.jardin.dto.member.MemberDTO;

@Service
public class MyPageServiceImpl implements MyPageService {

	@Autowired
	private MyPageDAO myPageDao;

	// 1:1 문의 리스트 출력
	@Override
	public List<InquiryDTO> inquiryList(String id) {

		// 페이지 네이션
		return myPageDao.inquiryList(id);
	}

	// 1:1 문의 글보기 출력
	@Override
	public InquiryDTO inquiryView(int no) {

		return myPageDao.inquiryView(no);
	}

	// 1:1 문의 글등록
	@Override
	public void writeComplete(String id, String category, String title, String content, MultipartFile file_name)
			throws Exception {
		String path = "C:/Users/user/git/koitt01/koitt01/src/main/webapp/resources/images/inquiryImage";
		String fileName = file_name.getOriginalFilename();
		file_name.transferTo(new File(path + fileName));

		InquiryDTO inquiryDto = new InquiryDTO();
		inquiryDto.setId(id);
		inquiryDto.setCategory(category);
		inquiryDto.setTitle(title);
		inquiryDto.setContent(content);
		inquiryDto.setFile_name(fileName);
		System.out.println(inquiryDto.getFile_name());
		System.out.println(inquiryDto.getId());
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
