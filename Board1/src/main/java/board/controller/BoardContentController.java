package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardContentController {
	
	private final String command = "/content.bd";
	private final String getPage = "content";
	
	@Autowired
	private BoardDao bDao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public ModelAndView content(
			@RequestParam(value="num", required=true) int num,
			@RequestParam(value="pageNumber", required=true) int pageNumber) {
		
		bDao.upCount(num);
		
		BoardBean board = bDao.getData(num);
		ModelAndView mav = new ModelAndView();
		mav.addObject("board", board);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName(getPage);
		return mav; 
	}
			
}
