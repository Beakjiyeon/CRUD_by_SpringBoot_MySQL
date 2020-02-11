package com.example.starter;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.starter.board.mapper.BoardMapper;

@Controller
public class JspTest {
	@Resource(name="com.example.starter.board.mapper.BoardMapper")
	BoardMapper mBoardMapper;
	@RequestMapping("/test")
	private String jspTest() throws Exception {
		
		System.out.println(mBoardMapper.boardCount());
		return "test";
	}
}
