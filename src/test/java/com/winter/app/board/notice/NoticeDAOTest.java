package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.BoardVO;

import lombok.extern.slf4j.Slf4j;
@SpringBootTest
@Slf4j
class NoticeDAOTest {
	@Autowired
	private NoticeDAO noticeDAO;

	@Test
	void testGetList() throws Exception {
		List<BoardVO> ar = noticeDAO.getList();
		
		for(BoardVO boardVO:ar) {
			log.info("VO : {}", boardVO);
		}
		
	}

	@Test
	void testGetDetail() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

}
