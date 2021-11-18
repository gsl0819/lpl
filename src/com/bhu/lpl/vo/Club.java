package com.bhu.lpl.vo;
/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: Club.java
* @Package com.bhu.lpl.vo
* @Description: TODO()
* @author: Apple
* @date: 2021年5月2日 下午7:31:47
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class Club {
	private int clubid;
	private String clubname;
	public Club() {
		super();
	}
	public Club(int clubid, String clubname) {
		super();
		this.clubid = clubid;
		this.clubname = clubname;
	}
	public int getClubid() {
		return clubid;
	}
	public void setClubid(int clubid) {
		this.clubid = clubid;
	}
	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	@Override
	public String toString() {
		return "Club [clubid=" + clubid + ", clubname=" + clubname + "]";
	}
	
}
