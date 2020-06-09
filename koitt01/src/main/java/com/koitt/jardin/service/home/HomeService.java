package com.koitt.jardin.service.home;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.community.EnjoyCoffeeDTO;
import com.koitt.jardin.dto.home.BannerDTO;
import com.koitt.jardin.dto.home.ProductTypeDTO;

public interface HomeService {
	public void getIp(HttpServletRequest request, HttpSession session); // 아이피 가져오기

	public List<BannerDTO> bannerList();// 배너 리스트 불러오기

	public List<ProductTypeDTO> hitList();// 베스트셀러 리스트 불러오기

	public List<ProductTypeDTO> saleList();// 할인상품 리스트 불러오기

	public String tel();// 고객센터 전화번호 불러오기

	public List<NoticeDTO> notice();// 공지사항 상위글 3개 불러오기

	public List<EnjoyCoffeeDTO> enjoyCoffee();// 인조이 사위글 3개 불러오기
}
