package com.bhu.lpl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.bhu.lpl.vo.Match;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: MatchDao.java
* @Package com.bhu.lpl.dao
* @Description: TODO()
* @author: Apple
* @date: 2021年5月4日 下午7:36:07
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class MatchDao extends BaseDao{
	//增加
		public void insertmat(Match mat){
			String sql = "insert into bisai values(null,?,?,?,?,?,?)";
			try {
				//通过连接对象获得语句对象
				PreparedStatement pst = getConnection().prepareStatement(sql);
				//补全sql语句
				pst.setString(1, mat.getHometeam());
				pst.setString(2, mat.getAwayteam());
				pst.setString(3, mat.getStarttime());
				pst.setString(4, mat.getEndtime());
				pst.setString(5, mat.getResult());
				pst.setString(6, mat.getVideo());
				//执行sql语句
				pst.executeUpdate();
				//关闭资源
				pst.close();
				closeConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//修改
		//MatchID禁止修改
		public void updatemat(Match mat){
			String sql = "update bisai set hometeam=?,awayteam=?,starttime=?,endtime=?,result=?,video=? where matchid = ?";
			try {
				PreparedStatement pst = getConnection().prepareStatement(sql);
				//补全sql语句
				
				pst.setString(1, mat.getHometeam());
				pst.setString(2, mat.getAwayteam());
				pst.setString(3, mat.getStarttime());
				pst.setString(4, mat.getEndtime());
				pst.setString(5, mat.getResult());
				pst.setString(6, mat.getVideo());
				pst.setInt(7, mat.getMatchid());
				//执行sql语句
				pst.executeUpdate();
				//关闭资源
				pst.close();
				closeConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//删除
		public void deletmat(int Matchid){
			String sql = "delete from bisai where matchid = ?";
			try {
				PreparedStatement pst = getConnection().prepareStatement(sql);
				//补全sql语句
				pst.setInt(1, Matchid);
				//执行sql语句
				pst.executeUpdate();
				//关闭资源
				pst.close();
				closeConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//查询全部
		public List<Match> selectAllmat(){
			List<Match> matlist = new ArrayList<Match>();
			String sql = "select * from bisai";
			try {
				PreparedStatement pst = getConnection().prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				//拿到结果集，放到集合中
				while(rs.next()){
					java.util.Date starttime = (java.util.Date)rs.getTimestamp(4);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String sttime = sdf.format(starttime);
//					java.util.Date endtime = (java.util.Date)rs.getDate(5);
//					String edtime = sdf.format(starttime);
//					System.out.println("111111"+sttime);
					Match mat = new Match(rs.getInt(1),rs.getString(2)
							,rs.getString(3),sttime,rs.getString(5),
							rs.getString(6),rs.getString(7)); 
					matlist.add(mat);
				}
				//关闭资源
				rs.close();
				pst.close();
				closeConn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return matlist;
		}
		//查询by ID
		public Match selectmatById(int Matchid){
			Match mat = null;
			String sql = "select * from bisai where matchid = ?";
			try {
				PreparedStatement pst = getConnection().prepareStatement(sql);
				pst.setInt(1, Matchid);
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					mat = new Match(rs.getInt(1),rs.getString(2)
							,rs.getString(3),rs.getString(4),rs.getString(5),
							rs.getString(6),rs.getString(7));
				//关闭资源
				rs.close();
				pst.close();
				closeConn();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mat;
		}
//		public List<Match> selectmatBytemaJQ(String home,String away){
//			List<Match> matlist = new ArrayList<Match>();
//			String sql = "select * from bisai where hometeam = ? and awayteam = ?";
//			try {
//				PreparedStatement pst = getConnection().prepareStatement(sql);
//				pst.setString(1, home);
//				pst.setString(2, away);
//				ResultSet rs = pst.executeQuery();
//				//拿到结果集，放到集合中
//				while(rs.next()){
//					Match mat = new Match(rs.getInt(1),rs.getString(2)
//							,rs.getString(3),rs.getString(4),rs.getString(5),
//							rs.getString(6),rs.getString(7)); 
//					matlist.add(mat);
//				}
//				//关闭资源
//				rs.close();
//				pst.close();
//				closeConn();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
			public List<Match> selectmatBytemaMH(String name){
				List<Match> matlist = new ArrayList<Match>();
				String sql = "select * from bisai where hometeam = ? or awayteam = ?";
				try {
					PreparedStatement pst = getConnection().prepareStatement(sql);
					pst.setString(1, name);
					pst.setString(2, name);
					ResultSet rs = pst.executeQuery();
					//拿到结果集，放到集合中
					while(rs.next()){
						Match mat = new Match(rs.getInt(1),rs.getString(2)
								,rs.getString(3),rs.getString(4),rs.getString(5),
								rs.getString(6),rs.getString(7)); 
						matlist.add(mat);
					}
					//关闭资源
					rs.close();
					pst.close();
					closeConn();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return matlist;
			}
		public static void main(String[] args) {
			MatchDao matdao = new MatchDao();
//			Match mat = new Match(0,"EDG","FPX","2021-05-03 20:30:00","2021-05-02 20:30:00","FPX","www.jd.com");
//			matdao.insertmat(mat);
			
//			List<Match> matlist = (List<Match>) matdao.selectmatBytemaJQ("IG", "RNG");
//			for(Match match:matlist){
//				System.out.println(match);
//			}
			
//			List<Match> matlist = matdao.selectmatBytemaJQ("IG", "RNG");
//			for(Match mat:matlist){
//				System.out.println(mat);
//			}
			
//			Match mat = matdao.selectmatByMatchname("gsl");
//			System.out.println(mat);
			
//			Match mat = matdao.selectmatById(4);
//			System.out.println(mat);
			
//			List<Match> matlist = matdao.selectAllmat();
//			for(Match Match:matlist){
//				System.out.println(Match);
//			}
//			Match mat = new Match(,"ES","BHU","2021-05-09 17:00:00","2021-05-09 20:30:00","FPX","www.jd.com");
//			matdao.updatemat(mat);
		}
}
