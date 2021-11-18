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
 * Servlet implementation class UpdateMatchServlet
 */
@WebServlet("/UpdateMatchServlet")
public class UpdateMatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String planum = request.getParameter("matchid");
		int matchid = -1;
		if(planum!=null && planum!=""){
			matchid = Integer.parseInt(planum);
		}
		String hometeam = request.getParameter("hometeam");
		String awayteam = request.getParameter("awayteam");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String result = request.getParameter("result");
		String video = request.getParameter("video");
//		int departmentid = -1;
//		
//		if(department!=null && department!=""){
//			departmentid = Integer.parseInt(department);
//		}
		Match pla = new Match(matchid,hometeam,awayteam,starttime,endtime,result,video);
		MatchService plaservice = new MatchService();
		plaservice.updatemat(pla);
		//响应重定向，跳转页面，不传值
		response.sendRedirect("ShowMatchsServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
