package com.bhu.lpl.service;

import java.util.List;

import com.bhu.lpl.dao.MatchDao;
import com.bhu.lpl.vo.Match;


/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: MatchService.java
* @Package com.bhu.lpl.service
* @Description: TODO()
* @author: Apple
* @date: 2021年5月4日 下午7:35:17
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class MatchService {
	MatchDao matdao = new MatchDao();
//	public int login(String Matchname,String password){
//		int result = 0;
//		Match pla = pladao.selectPlaByMatchname(Matchname);
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
	public int regist(Match pla){
		int result = 0;
		
			matdao.insertmat(pla);
			result = 1;
		return result;
	}
	//展示所有员工信息
	public List<Match> showmats(){
		List<Match> plalist = matdao.selectAllmat();
		return plalist;
	}
	public void deletemat(int Matchid){
		matdao.deletmat(Matchid);
	}
	public void updatemat(Match pla){
		matdao.updatemat(pla);
	}
	public Match yg(int Matchid){
		Match mat = matdao.selectmatById(Matchid);
		return mat;
	}
	public List<Match> mhcx(String name){
		List<Match> plalist = matdao.selectmatBytemaMH(name);
		return plalist;
	}
}
