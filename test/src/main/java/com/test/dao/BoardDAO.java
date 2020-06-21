package com.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.vo.BoardVO;

@Repository
public class BoardDAO {
	
		@Autowired
		SqlSession session;
		
		final static String NAMESPACE = "boardNamespace";
	
		
		public List<BoardVO> listAll() throws Exception{
			return session.selectList(NAMESPACE+".boardList");
		}
	
}
