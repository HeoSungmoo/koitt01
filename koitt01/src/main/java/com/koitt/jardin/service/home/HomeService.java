package com.koitt.jardin.service.home;

import java.util.List;

import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.home.BannerDTO;
import com.koitt.jardin.dto.home.ProductTypeDTO;

public interface HomeService {

	public List<BannerDTO> bannerList();// 배너 리스트 불러오기

	public List<ProductTypeDTO> hitList();// 베스트셀러 리스트 불러오기

	public List<ProductTypeDTO> saleList();// 할인상품 리스트 불러오기

	public String tel();// 고객센터 전화번호 불러오기

	public List<NoticeDTO> notice();// 공지사항 상위글 3개 불러오기
}
