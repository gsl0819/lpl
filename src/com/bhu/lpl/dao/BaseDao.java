package com.bhu.lpl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: BaseDao.java
* @Package com.bhu.meeting.dao
* @Description: TODO()
* @author: Apple
* @date: 2021年4月21日 下午5:14:38
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class BaseDao {
	private String drivername = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/lpl";
	private String username = "root";
	private String password = "123456";
	Connection conn = null;
	//获得连接
	public Connection getConnection(){
		try {
			Class.forName(drivername);
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//关闭连接
	public void closeConn(){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	public static void main(String[] args) {
//		BaseDao basedao = new BaseDao();
//		Connection conn = basedao.getConnection();
//		System.out.println(conn);
//		basedao.closeConn();
//		System.out.println("连接关闭");
//	}
}
