package com.bhu.lpl.vo;
/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: Player.java
* @Package com.bhu.lpl.vo
* @Description: TODO()
* @author: Apple
* @date: 2021年5月2日 下午7:31:58
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class Player {
	private int playerid;
	private String playername;
	private int playerage;
	private int clubid;
	private int role;
	public Player() {
		super();
	}
	public Player(int playerid, String playername, int playerage, int clubid, int role) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.playerage = playerage;
		this.clubid = clubid;
		this.role = role;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getPlayerage() {
		return playerage;
	}
	public void setPlayerage(int playerage) {
		this.playerage = playerage;
	}
	public int getClubid() {
		return clubid;
	}
	public void setClubid(int clubid) {
		this.clubid = clubid;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", playerage=" + playerage + ", clubid="
				+ clubid + ", role=" + role + "]";
	}
	
}
