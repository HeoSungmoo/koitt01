package com.koitt.jardin.service.board;

import java.util.List;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;

public interface BoardService {

	// 공지사항 글 리스트
	public List<NoticeDTO> notice();

	// 공지사항 글 보기
	public NoticeDTO noticeView(int No);

	// 1:1문의
	public void inquiry();

	// FAQ
	public List<FaqDTO> faq();

	// 이용안내
	public GuideDTO guide();
}
