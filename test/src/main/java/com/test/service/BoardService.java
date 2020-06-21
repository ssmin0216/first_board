package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.BoardDAO;
import com.test.vo.BoardVO;

@Service
public class BoardService {

		@Autowired
		BoardDAO dao;
		
		public List<BoardVO> listAll() throws Exception{
			return dao.listAll();
		}
}
