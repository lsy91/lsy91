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
public class BoardDeleteController {
	
	private final String command = "deleteForm.bd";
	private final String getPage = "deleteForm";
	private final String gotoPage = "redirect:/list.bd";
	
	@Autowired
	private BoardDao dao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doAction(
			@RequestParam(value="num", required=true) int num,
			@RequestParam(value="pageNumber", required=true) int pageNumber,
			Model model) {
		
		BoardBean board = dao.getData(num);
		
		model.addAttribute("board", board);
		model.addAttribute("pageNumber", pageNumber);
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doActionPost(
			@RequestParam(value="pageNumber", required=true) int pageNumber,
			@RequestParam(value="passwd", required=true) String passwd,
			BoardBean board,
			HttpServletResponse response,
			Model model) throws IOException {
		
		System.out.println("passwd : " + passwd);
		System.out.println("pageNumber : " + pageNumber);
		System.out.println("글번호 : " + board.getNum());
		int num = board.getNum();
		
		int cnt = dao.deleteArticle(num, passwd);
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
		if(cnt > 0) {
			int recordcount = dao.getArticleCount();
			int pageCount = recordcount / 10 + (recordcount % 10 == 0 ? 0 : 1);
			
			model.addAttribute("pageCount", pageCount);
			return gotoPage + "?pageNumber=" + pageNumber;
		}
		else {
			pw.print("<script type='text/javascript'>");
			pw.print("alert('비밀번호가 일치하지 않습니다.')");
			pw.print("</script>");
			pw.print("<script type='text/javascript'>");
			pw.print("history.back()");
			pw.print("</script>");
			pw.flush();
			
			return null;
		}
		
	}
}
