package com.bhu.lpl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.MatchService;
import com.bhu.lpl.vo.Match;


/**
 * Servlet implementation class ShowMatUpdateServlet
 */
@WebServlet("/ShowMatUpdateServlet")
public class ShowMatUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMatUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MatchService plaservice = new MatchService();
		List<Match> plalist = plaservice.showmats();
		request.setAttribute("plalist", plalist);
		String Playerid = request.getParameter("Matchid");
		if(Playerid!=null && Playerid!=""){
			request.setAttribute("Playerid", Playerid);
			request.getRequestDispatcher("changemats.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("changemat.jsp").forward(request, response);
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
