package com.bhu.lpl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.PlayerService;
import com.bhu.lpl.vo.Player;


/**
 * Servlet implementation class UpdatePlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String planum = request.getParameter("playerid");
		int employeeid = -1;
		if(planum!=null && planum!=""){
			employeeid = Integer.parseInt(planum);
		}
		String playername = request.getParameter("playername");
		String playerage = request.getParameter("playerage");
		String club = request.getParameter("clubid");
		String role = request.getParameter("role");
		int a = Integer.parseInt(playerage);
		int b = Integer.parseInt(club);
		int c = Integer.parseInt(role);
//		int departmentid = -1;
//		
//		if(department!=null && department!=""){
//			departmentid = Integer.parseInt(department);
//		}
		Player pla = new Player(employeeid,playername,a,b,c);
		PlayerService plaservice = new PlayerService();
		plaservice.updatePla(pla);
		//响应重定向，跳转页面，不传值
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
