package com.koitt.jardin.dao.board;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dto.board.FaqDTO;
import com.koitt.jardin.dto.board.GuideDTO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.member.InquiryDTO;
import com.koitt.jardin.dto.page.PageNationDTO;
import com.koitt.jardin.dto.search.SearchValue;

public interface BoardDAO {

	// 공지사항 글 보기
	public NoticeDTO noticeView(int no);

	// 공지사항 조회수
	public void noticeViewHit(int rnum);

	// 공지사항 글보기 이전 글
	public NoticeDTO noticeViewPre(int no);
	// 공지사항 글보기 다음 글

	public NoticeDTO noticeViewNext(int no);

	// 1:1문의
	public void inquiryWrite(InquiryDTO iDto);


	// FAQ검색
	public List<FaqDTO> faqSearch(String search);

	// 이용안내
	public GuideDTO guide();

//공지사항 페이징-----------------------------------------------------------------
	// 페이징 게시글 수
	public PageNationDTO pageNation(SearchValue sv);

	// 페이징 글 리스트 가져오기
	public List<NoticeDTO> pageNationList(SearchValue sv);

//FAQ 페이징-----------------------------------------------------------------
	// FAQ 페이징 게시글 수
	public PageNationDTO faqPageNation(SearchValue sv);

	// FAQ 페이징 글 리스트 가져오기
	public List<FaqDTO> faqPageNationList(SearchValue sv);

}
