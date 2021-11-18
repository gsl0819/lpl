package com.bhu.lpl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.PlayerService;

/**
 * Servlet implementation class DeletePlaServlet
 */
@WebServlet("/DeletePlaServlet")
public class DeletePlaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pla = request.getParameter("playerid");
		int plaid = -1;
		if(pla != null && pla != ""){
			plaid = Integer.parseInt(pla);
		}
		PlayerService empservice = new PlayerService();
		empservice.deletePla(plaid);
		//响应重定向，跳转页面不传值
		response.sendRedirect("ShowPlayersServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
