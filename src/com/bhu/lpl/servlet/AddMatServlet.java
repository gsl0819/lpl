package com.bhu.lpl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.MatchService;
import com.bhu.lpl.vo.Match;


/**
 * Servlet implementation class AddMatServlet
 */
@WebServlet("/AddMatServlet")
public class AddMatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hometeam = request.getParameter("hometeam");
		String awayteam = request.getParameter("awayteam");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String result = request.getParameter("result");
		String video = request.getParameter("video");
		Match mat = new Match(0,hometeam,awayteam,starttime,endtime,result,video);
		MatchService matservice = new MatchService();
		int result1 = matservice.regist(mat);
		if(result1==0){
			System.out.println("添加失败");
		}else{
			System.out.println("添加成功");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
