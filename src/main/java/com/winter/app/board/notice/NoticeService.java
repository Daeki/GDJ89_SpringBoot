package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.board.BoardService;
import com.winter.app.board.BoardVO;
import com.winter.app.home.util.Pager;

@Service
public class NoticeService implements BoardService{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.make(noticeDAO.getTotalCount(pager));
		pager.makeNum();
		List<BoardVO> ar = noticeDAO.getList(pager); 
		return ar;
	}

	@Override
	public BoardVO getDetail(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardVO);
	}

	@Override
	public int add(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.add(boardVO);
	}
	
	

}
