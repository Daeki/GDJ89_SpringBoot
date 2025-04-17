package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardVO;
import com.winter.app.home.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@Value("${menu.board.notice.name}")
	private String name;
	
	@ModelAttribute("kind")
	public String getName() {
		return this.name;
	}
	
	@GetMapping("list")
	public String getList(Pager pager, Model model)throws Exception{
		
		List<BoardVO> ar = noticeService.getList(pager);
		model.addAttribute("list", ar);
		model.addAttribute("pager", pager);
		
		return "board/list";
	}
	
	@GetMapping("detail")
	public String getDetail(BoardVO boardVO, Model model)throws Exception{
		boardVO = noticeService.getDetail(boardVO);
		
		if(boardVO == null) {
			
		}
		
		model.addAttribute("vo", boardVO);
		
		return "board/detail";
	}
	
	@GetMapping("add")
	public String add()throws Exception{
		return "board/add";
	}
	
	@PostMapping("add")
	public String add(NoticeVO noticeVO)throws Exception{
		int result = noticeService.add(noticeVO);
		
		
		return "redirect:./list";
	}

}
