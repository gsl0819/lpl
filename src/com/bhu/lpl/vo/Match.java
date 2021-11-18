package com.bhu.lpl.vo;
/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: Match.java
* @Package com.bhu.lpl.vo
* @Description: TODO()
* @author: Apple
* @date: 2021年5月2日 下午7:37:49
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class Match {	
	private int matchid;
	private String hometeam;
	private String awayteam;
	private String starttime;
	private String endtime;
	private String result;
	private String video;
	public Match() {
		super();
	}
	public Match(int matchid, String hometeam, String awayteam, String starttime, String endtime, String result,
			String video) {
		super();
		this.matchid = matchid;
		this.hometeam = hometeam;
		this.awayteam = awayteam;
		this.starttime = starttime;
		this.endtime = endtime;
		this.result = result;
		this.video = video;
	}
	public int getMatchid() {
		return matchid;
	}
	public void setMatchid(int matchid) {
		this.matchid = matchid;
	}
	public String getHometeam() {
		return hometeam;
	}
	public void setHometeam(String hometeam) {
		this.hometeam = hometeam;
	}
	public String getAwayteam() {
		return awayteam;
	}
	public void setAwayteam(String awayteam) {
		this.awayteam = awayteam;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	@Override
	public String toString() {
		return "Match [matchid=" + matchid + ", hometeam=" + hometeam + ", awayteam=" + awayteam + ", starttime="
				+ starttime + ", endtime=" + endtime + ", result=" + result + ", video=" + video + "]";
	}
	
}
