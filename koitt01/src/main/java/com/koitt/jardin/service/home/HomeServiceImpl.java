package com.koitt.jardin.service.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.home.HomeDAO;
import com.koitt.jardin.dto.home.BannerDTO;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDAO homeDao;

	@Override
	public List<BannerDTO> bannerList() {
		return homeDao.bannerList();
	}
}
