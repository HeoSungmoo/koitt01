package com.jardin.shop11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jardin.shop11.service.board.boardService;

@Controller
public class boardController {

	@Autowired
	boardService boardService;

	@RequestMapping("list")
	public String list(Model model) {

		model.addAttribute("list", boardService.list());

		return "board/list";
	}

}
