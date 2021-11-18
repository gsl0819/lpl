package com.bhu.lpl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.PlayerService;
import com.bhu.lpl.vo.Player;

/**
 * Servlet implementation class ShowPlayerXGServlet
 */
@WebServlet("/ShowPlayerXGServlet")
public class ShowPlayerXGServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPlayerXGServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PlayerService plaservice = new PlayerService();
		List<Player> plalist = plaservice.showPlas();
		request.setAttribute("plalist", plalist);
		String Playerid = request.getParameter("Playerid");
		if(Playerid!=null && Playerid!=""){
			request.setAttribute("Playerid", Playerid);
			request.getRequestDispatcher("changepla.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("changeplas.jsp").forward(request, response);
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
