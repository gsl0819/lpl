package com.bhu.lpl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.MatchService;


/**
 * Servlet implementation class DeleteMatServlet
 */
@WebServlet("/DeleteMatServlet")
public class DeleteMatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mat = request.getParameter("matchid");
		int matid = -1;
		if(mat != null && mat != ""){
			matid = Integer.parseInt(mat);
		}
		MatchService empservice = new MatchService();
		empservice.deletemat(matid);
		//响应重定向，跳转页面不传值
		response.sendRedirect("ShowMatDeleteServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
