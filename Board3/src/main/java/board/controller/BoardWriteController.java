package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardWriteController {
	
	private final String command = "/write.bd";
	private final String getPage = "writeForm";
	private final String gotoPage = "redirect:/list.bd";
	
	@Autowired
	private BoardDao bdao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doGet() {
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doPost(BoardBean board, HttpServletRequest request) {
		board.setIp(request.getRemoteAddr());
		bdao.writeBoard(board);
		return gotoPage;
	}
}
