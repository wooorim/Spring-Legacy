package edu.global.ex.board.one;

import java.util.List;

import org.springframework.stereotype.Controller;

import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;


public interface IBDao {
	public List<BoardVO> listDao();
	
}
