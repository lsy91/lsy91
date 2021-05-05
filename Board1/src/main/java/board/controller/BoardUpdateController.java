package board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardUpdateController {
	
	private final String command = "/update.bd";
	private final String getPage = "updateForm";
	private final String gotoPage = "redirect:/list.bd";
	
	@Autowired
	private BoardDao bdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public String doGet(
			@RequestParam("num") int num,
			@RequestParam("pageNumber") int pageNumber,
			Model model
			) {
		
		BoardBean board = bdao.getData(num);
		model.addAttribute("board", board);
		model.addAttribute("pageNumber", pageNumber);
		
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doPost(
			BoardBean board,
			@RequestParam("pageNumber") int pageNumber,
			Model model,
			HttpServletResponse response
			) throws IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
		int cnt = -1;
		
		cnt = bdao.updateBoard(board); 
		
		model.addAttribute("pageNumber", pageNumber);
		
		if(cnt < 1) {
			model.addAttribute("board", board);
			pw.print("<script type='text/javascript'>");
			pw.print("alert('비밀번호를 확인해주세요.')");
			pw.print("</script>");
			pw.flush();
			
			return getPage;
		}
		else {
			return gotoPage;
		}
	}
	
}
