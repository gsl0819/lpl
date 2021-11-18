package com.bhu.lpl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bhu.lpl.vo.Administrator;
import com.bhu.lpl.vo.Administrator;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: AdministratorsDao.java
* @Package com.bhu.lpl.dao
* @Description: TODO()
* @author: Apple
* @date: 2021年5月3日 下午7:02:11
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class AdministratorsDao extends BaseDao{
	public Administrator selectAdminByname(String name){
		Administrator pla = null;
		String sql = "select * from administrators where name = ?";
		try {
			PreparedStatement pst = getConnection().prepareStatement(sql);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				pla = new Administrator(rs.getInt(1),rs.getString(2),rs.getString(3)); 
			}
			//关闭资源
			rs.close();
			pst.close();
			closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pla;
	}
}
