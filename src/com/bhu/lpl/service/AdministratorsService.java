package com.bhu.lpl.service;

import com.bhu.lpl.dao.AdministratorsDao;
import com.bhu.lpl.vo.Administrator;

/**
* All rights Reserved, Designed By www.Apple.bhu.com 
* @Title: AdministratorsService.java
* @Package com.bhu.lpl.service
* @Description: TODO()
* @author: Apple
* @date: 2021年5月3日 下午7:01:33
* @version V1.0
* @Copyright: 2021 www.Apple.bhu.com Inc. All rights reserved.
*/
public class AdministratorsService {
	AdministratorsDao admindao = new AdministratorsDao();
	public int login(String name,String password){
		int result = 0;
		Administrator admin = admindao.selectAdminByname(name);
		if(admin == null){
			result = 0;
		}else{
			if(password.equals(admin.getPassword())){
				result = 1;
			}else{
				result = 0;
			}
		}
		return result;
	}
}
