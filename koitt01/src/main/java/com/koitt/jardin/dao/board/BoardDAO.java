package com.koitt.jardin.dao.board;

import java.util.List;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;

public interface BoardDAO {

	// 공지사항 글 리스트
	public List<NoticeDTO> notice();

	// 공지사항 글 보기
	public NoticeDTO noticeView(int No);

	// 1:1문의
	public void inquiry();

	// FAQ 글리스트
	public List<FaqDTO> faq();

	// 이용안내
	public GuideDTO guide();

}
