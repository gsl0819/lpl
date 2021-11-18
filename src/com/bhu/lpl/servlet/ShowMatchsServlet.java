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
 * Servlet implementation class ShowMatchsServlet
 */
@WebServlet("/ShowMatchsServlet")
public class ShowMatchsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMatchsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MatchService matservice = new MatchService();
		List<Match> matlist = matservice.showmats();
		request.setAttribute("matlist", matlist);
		String Matchid = request.getParameter("Matchid");
		if(Matchid!=null && Matchid!=""){
			request.setAttribute("Matchid", Matchid);
			request.getRequestDispatcher("changepla.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("showmat.jsp").forward(request, response);
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
