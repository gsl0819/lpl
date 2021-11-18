package com.bhu.lpl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bhu.lpl.vo.Club;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: ClubDao.java
* @Package com.bhu.lpl.dao
* @Description: TODO()
* @author: Apple
* @date: 2021年5月3日 下午4:56:53
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class ClubDao extends BaseDao{
	//增加
	public void insertClub(Club club){
		String sql = "insert into Club values(null,?)";
		try {
			//通过连接对象获得语句对象
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//补全sql语句
			pst.setString(1, club.getClubname());
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
	//ClubID禁止修改
	public void updateClub(Club club){
		String sql = "update Club set Clubname=?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//补全sql语句
			pst.setString(1, club.getClubname());
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
	public void deletClub(int Clubid){
		String sql = "delete from Club where Clubid = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//补全sql语句
			pst.setInt(1, Clubid);
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
	public List<Club> selectAllClub(){
		List<Club> clublist = new ArrayList<Club>();
		String sql = "select * from Club";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			//拿到结果集，放到集合中
			while(rs.next()){
				Club club = new Club(rs.getInt(1),rs.getString(2)); 
				clublist.add(club);
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clublist;
	}
	//查询by ID
	public Club selectClubById(int Clubid){
		Club club = null;
		String sql = "select * from Club where Clubid = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setInt(1, Clubid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				club = new Club(rs.getInt(1),rs.getString(2)); 
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return club;
	}
	//查询by Clubname
	public Club selectClubByClubname(String Clubname){
		Club club = null;
		String sql = "select * from Club where Clubname = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1, Clubname);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				club = new Club(rs.getInt(1),rs.getString(2)); 
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return club;
	}
	//查询by palyername  模糊查询
	public List<Club> selectClubByClubnameMH(String Clubname){
		List<Club> clublist = new ArrayList<Club>();
		String sql = "select * from Club where Clubname like ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1, '%'+Clubname+'%');
			ResultSet rs = pst.executeQuery();
			//拿到结果集，放到集合中
			while(rs.next()){
				Club club = new Club(rs.getInt(1),rs.getString(2));  
				clublist.add(club);
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clublist;
	}
	public static void main(String[] args) {
		ClubDao clubdao = new ClubDao();
//		Club club = new Club(0,"bhu");
//		clubdao.insertClub(club);
		
//		List<Club> clublist = clubdao.selectClubByClubnameMH("g");
//		for(Club Club:clublist){
//			System.out.println(Club);
//		}
		
//		Club club = clubdao.selectClubByClubname("ig");
//		System.out.println(club);
		
//		Club club = clubdao.selectClubById(4);
//		System.out.println(club);
		
//		List<Club> clublist = clubdao.selectAllClub();
//		for(Club Club:clublist){
//			System.out.println(Club);
//		}
	}
}
