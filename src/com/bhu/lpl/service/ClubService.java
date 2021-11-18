package com.bhu.lpl.service;

import java.util.List;

import com.bhu.lpl.dao.ClubDao;
import com.bhu.lpl.vo.Club;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: ClubService.java
* @Package com.bhu.lpl.service
* @Description: TODO()
* @author: Apple
* @date: 2021年5月3日 下午4:55:22
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class ClubService {
	ClubDao clubdao = new ClubDao();
//	public int login(String Clubname,String password){
//		int result = 0;
//		Club club = clubdao.selectclubByClubname(Clubname);
//		if(club == null){
//			result = 0;
//		}else{
//			if(password.equals(club.getPassword())){
//				result = 1;
//			}else{
//				result = 0;
//			}
//		}
//		return result;
//	}
	public int regist(Club club){
		int result = 0;
		Club club2 = clubdao.selectClubByClubname(club.getClubname());
		if(club2 != null){
			result = 0;
		}else{
			clubdao.insertClub(club);
			result = 1;
		}
		return result;
	}
	//展示所有员工信息
	public List<Club> showclubs(){
		List<Club> clublist = clubdao.selectAllClub();
		return clublist;
	}
	public void deleteclub(int Clubid){
		clubdao.deletClub(Clubid);
	}
	public void updateclub(Club club){
		clubdao.updateClub(club);
	}
	public Club selectByName(String name){
		Club club = new Club();
		clubdao.selectClubByClubnameMH(name);
		return club;
	}
}
