package com.bhu.lpl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bhu.lpl.vo.Player;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: PlayerDao.java
* @Package com.bhu.lpl.dao
* @Description: TODO()
* @author: Apple
* @date: 2021年5月2日 下午7:58:53
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class PlayerDao extends BaseDao{
	//增加
	public void insertPla(Player pla){
		String sql = "insert into player values(null,?,?,?,?)";
		try {
			//通过连接对象获得语句对象
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//补全sql语句
			pst.setString(1, pla.getPlayername());
			pst.setInt(2, pla.getPlayerage());
			pst.setInt(3, pla.getClubid());
			pst.setInt(4, pla.getRole());
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
	//playerID禁止修改
	public void updatePla(Player pla){
		String sql = "update player set playername=?,playerage=?,clubid=?,role=? where playerid=?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//补全sql语句
			pst.setString(1, pla.getPlayername());
			pst.setInt(2, pla.getPlayerage());
			pst.setInt(3, pla.getClubid());
			pst.setInt(4, pla.getRole());
			pst.setInt(5, pla.getPlayerid());
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
	public void deletPla(int playerid){
		String sql = "delete from player where playerid = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//补全sql语句
			pst.setInt(1, playerid);
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
	public List<Player> selectAllPla(){
		List<Player> plalist = new ArrayList<Player>();
		String sql = "select * from Player";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			//拿到结果集，放到集合中
			while(rs.next()){
				Player pla = new Player(rs.getInt(1),rs.getString(2)
						,rs.getInt(3),rs.getInt(4),rs.getInt(5)); 
				plalist.add(pla);
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plalist;
	}
	//查询by ID
	public Player selectPlaById(int Playerid){
		Player pla = null;
		String sql = "select * from Player where Playerid = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setInt(1, Playerid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				pla = new Player(rs.getInt(1),rs.getString(2)
					,rs.getInt(3),rs.getInt(4),rs.getInt(5)); 
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pla;
	}
	//查询by Playername
	public Player selectPlaByPlayername(String playername){
		Player pla = null;
		String sql = "select * from Player where playername = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1, playername);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				pla = new Player(rs.getInt(1),rs.getString(2)
						,rs.getInt(3),rs.getInt(4),rs.getInt(5)); 
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pla;
	}
	//查询by palyername  模糊查询
	public List<Player> selectPlaByPlayernameMH(String Playername){
		List<Player> plalist = new ArrayList<Player>();
		String sql = "select * from Player where playername like ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1, '%'+Playername+'%');
			ResultSet rs = pst.executeQuery();
			//拿到结果集，放到集合中
			while(rs.next()){
				Player pla = new Player(rs.getInt(1),rs.getString(2)
						,rs.getInt(3),rs.getInt(4),rs.getInt(5));  
				plalist.add(pla);
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plalist;
	}
	public static void main(String[] args) {
		PlayerDao pladao = new PlayerDao();
//		Player pla = new Player(0,"gsl",20,5,4);
//		pladao.insertPla(pla);
		
//		List<Player> plalist = pladao.selectPlaByPlayernameMH("a");
//		for(Player Player:plalist){
//			System.out.println(Player);
//		}
		
//		Player pla = pladao.selectPlaByPlayername("gsl");
//		System.out.println(pla);
		
//		Player pla = pladao.selectPlaById(4);
//		System.out.println(pla);
		
		List<Player> plalist = pladao.selectAllPla();
		for(Player Player:plalist){
			System.out.println(Player);
		}
	}
}
