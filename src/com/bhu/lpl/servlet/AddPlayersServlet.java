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
 * Servlet implementation class AddPlayersServlet
 */
@WebServlet("/AddPlayersServlet")
public class AddPlayersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlayersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String playername = request.getParameter("playername");
		String playerage = request.getParameter("playerage");
		String club = request.getParameter("club");
		String role = request.getParameter("role");
		int clubid = -1;
		if(club!=null && club!=""){
			clubid = Integer.parseInt(club);
		}
		int age = Integer.parseInt(playerage);
		int r = Integer.parseInt(role);
		Player emp = new Player(0,playername,age,clubid,r);
		PlayerService empservice = new PlayerService();
		int result = empservice.regist(emp);
		if(result==0){
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
