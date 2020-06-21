package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.BoardService;
import com.test.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService service;
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public ModelAndView list() throws Exception {
		List<BoardVO> list = service.listAll();
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		mv.addObject("list", list);	//view에서  foreach item으로 받는다.
		return mv;
	}
}
