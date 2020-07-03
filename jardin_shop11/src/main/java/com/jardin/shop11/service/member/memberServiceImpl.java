package com.jardin.shop11.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardin.shop11.dao.member.memberDao;

@Service
public class memberServiceImpl implements memberService {

	@Autowired
	memberDao memberDao;

}
