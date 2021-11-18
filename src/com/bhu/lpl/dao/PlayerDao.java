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
* @date: 2021��5��2�� ����7:58:53
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class PlayerDao extends BaseDao{
	//����
	public void insertPla(Player pla){
		String sql = "insert into player values(null,?,?,?,?)";
		try {
			//ͨ�����Ӷ�����������
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//��ȫsql���
			pst.setString(1, pla.getPlayername());
			pst.setInt(2, pla.getPlayerage());
			pst.setInt(3, pla.getClubid());
			pst.setInt(4, pla.getRole());
			//ִ��sql���
			pst.executeUpdate();
			//�ر���Դ
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�޸�
	//playerID��ֹ�޸�
	public void updatePla(Player pla){
		String sql = "update player set playername=?,playerage=?,clubid=?,role=? where playerid=?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//��ȫsql���
			pst.setString(1, pla.getPlayername());
			pst.setInt(2, pla.getPlayerage());
			pst.setInt(3, pla.getClubid());
			pst.setInt(4, pla.getRole());
			pst.setInt(5, pla.getPlayerid());
			//ִ��sql���
			pst.executeUpdate();
			//�ر���Դ
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//ɾ��
	public void deletPla(int playerid){
		String sql = "delete from player where playerid = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			//��ȫsql���
			pst.setInt(1, playerid);
			//ִ��sql���
			pst.executeUpdate();
			//�ر���Դ
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��ѯȫ��
	public List<Player> selectAllPla(){
		List<Player> plalist = new ArrayList<Player>();
		String sql = "select * from Player";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			//�õ���������ŵ�������
			while(rs.next()){
				Player pla = new Player(rs.getInt(1),rs.getString(2)
						,rs.getInt(3),rs.getInt(4),rs.getInt(5)); 
				plalist.add(pla);
			}
			//�ر���Դ
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plalist;
	}
	//��ѯby ID
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
			//�ر���Դ
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pla;
	}
	//��ѯby Playername
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
			//�ر���Դ
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pla;
	}
	//��ѯby palyername  ģ����ѯ
	public List<Player> selectPlaByPlayernameMH(String Playername){
		List<Player> plalist = new ArrayList<Player>();
		String sql = "select * from Player where playername like ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1, '%'+Playername+'%');
			ResultSet rs = pst.executeQuery();
			//�õ���������ŵ�������
			while(rs.next()){
				Player pla = new Player(rs.getInt(1),rs.getString(2)
						,rs.getInt(3),rs.getInt(4),rs.getInt(5));  
				plalist.add(pla);
			}
			//�ر���Դ
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
