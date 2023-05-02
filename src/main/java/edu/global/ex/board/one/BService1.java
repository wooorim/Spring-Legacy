package edu.global.ex.board.one;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.global.ex.vo.BoardVO;

@Service

public class BService1 {
	
	  @Inject
	   private SqlSession sqlSession; //MyBatis
	   
	    public List<BoardVO> selectBoardList() throws Exception {
	       
	       IBDao dao = sqlSession.getMapper(IBDao.class); //.class -> dao에 담을 클래스(IBDao = 인터페이스) 원형을 알려주는 역할	      
	       return dao.listDao();
	    }
}
