package com.bhu.lpl.vo;
/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: Administrator.java
* @Package com.bhu.lpl.vo
* @Description: TODO()
* @author: Apple
* @date: 2021年5月3日 下午7:07:26
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class Administrator {
	private int id;
	private String name;
	private String password;
	public Administrator() {
		super();
	}
	public Administrator(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administrator [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
