package com.koitt.jardin.service.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koitt.jardin.dao.community.CommunityDAO;
import com.koitt.jardin.dto.community.PreUserDTO;

@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	CommunityDAO communityDAO;

	@Override
	public List<PreUserDTO> expr() {

		return communityDAO.expr();
	}
}
