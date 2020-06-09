package com.koitt.jardin.dao.home;

import java.util.List;

import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.community.EnjoyCoffeeDTO;
import com.koitt.jardin.dto.home.BannerDTO;
import com.koitt.jardin.dto.home.ProductTypeDTO;

public interface HomeDAO {

	public List<BannerDTO> bannerList();// 배너 리스트 불러오기

	public List<ProductTypeDTO> hitList();// 베스트셀러 리스트 불러오기

	public List<ProductTypeDTO> saleList();// 할인상품 리스트 불러오기

	public String tel();// 고객센터 전화번호 불러오기

	public List<NoticeDTO> notice();// 공지사항 상위글 3개 불러오기

	public List<EnjoyCoffeeDTO> enjoyCoffee();// 인조이 사위글 3개 불러오기
}
