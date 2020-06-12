package com.koitt.jardin.service.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.home.HomeDAO;
import com.koitt.jardin.dto.board.NoticeDTO;
import com.koitt.jardin.dto.community.EnjoyCoffDTO;
import com.koitt.jardin.dto.home.BannerDTO;
import com.koitt.jardin.dto.home.ProductTypeDTO;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDAO homeDao;

	// 배너 리스트 불러오기
	@Override
	public List<BannerDTO> bannerList() {
		return homeDao.bannerList();
	}

	// 베스트셀러 리스트 불러오기
	@Override
	public List<ProductTypeDTO> hitList() {
		return homeDao.hitList();
	}

	// 할인상품 리스트 불러오기
	@Override
	public List<ProductTypeDTO> saleList() {
		List<ProductTypeDTO> list = homeDao.saleList();
		for (int i = 0; i < list.size(); i++) {// 할인액 계산
			list.get(i).setPrice(
					((int) (list.get(i).getPrice() - list.get(i).getPrice() * list.get(i).getSale() / 100) / 10) * 10);
		}
		return list;
	}

	// 고객센터 전화번호 불러오기
	@Override
	public String tel() {
		return homeDao.tel();
	}

	// 공지사항 상위글 3개 불러오기
	@Override
	public List<NoticeDTO> notice() {
		return homeDao.notice();
	}

	// 인조이 사위글 3개 불러오기
	@Override
	public List<EnjoyCoffDTO> enjoyCoffee() {
		return homeDao.enjoyCoffee();
	}

}
