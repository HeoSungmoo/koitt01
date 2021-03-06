package com.koitt.jardin.service.member;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.member.InquiryDTO;
import com.koitt.jardin.dto.member.MemberDTO;

public interface MyPageService {
	// 1:1 문의 리스트 출력
	public abstract List<InquiryDTO> inquiryList(String id);

	// 1:1 문의 내용 출력
	public abstract InquiryDTO inquiryView(int no);

	// 1:1 문의 글등록
	public abstract void writeComplete(String id, String category, String title, String content,
			MultipartFile file_name) throws Exception;

	// 회원정보 수정을 위한 정보 출력
	public abstract MemberDTO changeInfoView(MemberDTO memberDto);

	// 회원정보 수정
	public abstract void changeInfo(String id);

	// 회원탈퇴
	public abstract void delete(MemberDTO memberDto);

}
