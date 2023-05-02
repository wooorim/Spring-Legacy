package edu.global.ex.board.two;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.global.ex.vo.BoardVO;

@Service

public class BService2 {
	
	  @Inject
	   private SqlSession sqlSession; //MyBatis
	   
	    public List<BoardVO> selectBoardList() throws Exception {
	       return sqlSession.selectList("board.selectBoardList"); //board = board2.xml의 mapper namespace이름
	    }
	
}
