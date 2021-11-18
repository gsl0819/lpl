package com.bhu.lpl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.ClubService;
import com.bhu.lpl.vo.Club;

/**
 * Servlet implementation class ShowClubsServlet
 */
@WebServlet("/ShowClubsServlet")
public class ShowClubsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowClubsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClubService clubservice = new ClubService();
		List<Club> clublist = clubservice.showclubs();
		request.setAttribute("clublist", clublist);
		String Clubid = request.getParameter("Clubid");
		if(Clubid!=null && Clubid!=""){
			request.setAttribute("Clubid", Clubid);
			request.getRequestDispatcher("changeclub.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("showclubs.jsp").forward(request, response);
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
