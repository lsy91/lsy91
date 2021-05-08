package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardReplyController {
	
	private final String command = "/reply.bd";
	private final String getPage = "replyForm";
	private final String gotoPage = "redirect:/list.bd";
	
	@Autowired
	private BoardDao bdao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doGet(
			@RequestParam("num") int num,
			@RequestParam("pageNumber") int pageNumber,
			Model model) {
		
		BoardBean board = bdao.getData(num);
		
		model.addAttribute("board", board);
		model.addAttribute("pageNumber", pageNumber);
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doPost(
			@RequestParam("restep") int restep,
			@RequestParam("relevel") int relvel,
			BoardBean board,
			Model model,
			HttpServletRequest request) {
		
		board.setIp(request.getRemoteAddr());
		bdao.insertReply(board);
		return gotoPage; 
	}
}
