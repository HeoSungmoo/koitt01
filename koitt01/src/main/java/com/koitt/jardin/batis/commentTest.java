package com.koitt.jardin.batis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.koitt.jardin.dto.product.CommentDto;
import com.koitt.jardin.service.product.ProductService;

@Controller
public class commentTest {

	SqlSession sqlSession;

	@Autowired
	ProductService productService;

	@RequestMapping("comment11") // 댓글달기 페이지
	public String comment() {

		return "product/comment";
	}

	@RequestMapping("comment_List") // 댓글달기 페이지
	@ResponseBody
	public List<CommentDto> comment_List() {

		return productService.comment_List();
	}

	@RequestMapping("comment_delete") // 댓글달기 페이지
	@ResponseBody
	public String comment_delete(int cId) {

		productService.comment_delete(cId);

		return "success";
	}

	@RequestMapping("comment_insert") // 댓글달기 페이지
	@ResponseBody
	public String comment_insert(CommentDto comment) {

		productService.comment_insert(comment);
		System.out.println("댓글내용" + comment.getcContent());

		return "success";
	}

	@RequestMapping("comment_update")
	@ResponseBody
	public String comment_update(CommentDto comment) {

		productService.comment_update(comment);

		return "success";
	}

	@RequestMapping("/comment22")
	public String ex_checkForm22() {

		return "product/comment2";
	}

	@RequestMapping("/ex_checkForm")
	public String ex_checkForm() {

		return "ex_checkForm";
	}

	@RequestMapping("/ex_checkAjax")
	@ResponseBody
	public Map<String, Object> ex_checkAjax(@RequestParam CommentDto comment) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "success");
		map.put("cContent", "데이터");

		return map;
	}

}
