package com.bhu.lpl.service;

import java.util.List;

import com.bhu.lpl.dao.PlayerDao;
import com.bhu.lpl.vo.Player;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: PlayerService.java
* @Package com.bhu.lpl.service
* @Description: TODO()
* @author: Apple
* @date: 2021年5月2日 下午7:56:46
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class PlayerService {
	PlayerDao pladao = new PlayerDao();
//	public int login(String playername,String password){
//		int result = 0;
//		Player pla = pladao.selectPlaByPlayername(playername);
//		if(pla == null){
//			result = 0;
//		}else{
//			if(password.equals(pla.getPassword())){
//				result = 1;
//			}else{
//				result = 0;
//			}
//		}
//		return result;
//	}
	public int regist(Player pla){
		int result = 0;
		Player pla2 = pladao.selectPlaByPlayername(pla.getPlayername());
		if(pla2 != null){
			result = 0;
		}else{
			pladao.insertPla(pla);
			result = 1;
		}
		return result;
	}
	//展示所有员工信息
	public List<Player> showPlas(){
		List<Player> plalist = pladao.selectAllPla();
		return plalist;
	}
	public void deletePla(int Playerid){
		pladao.deletPla(Playerid);
	}
	public void updatePla(Player pla){
		pladao.updatePla(pla);
	}
	public Player selectByName(String planame){
		Player pla = new Player();
		pla = pladao.selectPlaByPlayername(planame);
		return pla;
	}
}
