package com.bhu.lpl.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhu.lpl.service.MatchService;
import com.bhu.lpl.vo.Match;

/**
 * Servlet implementation class MatchYGServlet
 */
@WebServlet("/MatchYGServlet")
public class MatchYGServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchYGServlet() {
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
//
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date today = new java.util.Date(System.currentTimeMillis());
//		String td = formatter.format(today);
//		System.out.println(formatter.format(today));
		int matid = 0;
		for(Match mat:matlist){
			try {
				java.util.Date d = formatter.parse(mat.getStarttime());
//				System.out.print(formatter.format(d)+"\t");
//				System.out.println(formatter.format(today));
				if(d.getTime()>today.getTime()){
//					System.out.println(111);
					matid = mat.getMatchid();
					break;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		Match mat = matservice.yg(matid);
		request.setAttribute("mat", mat);
		String Matchid = request.getParameter("Matchid");
		if(Matchid!=null && Matchid!=""){
			request.setAttribute("Matchid", Matchid);
			request.getRequestDispatcher("changepla.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("ygmat.jsp").forward(request, response);
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
