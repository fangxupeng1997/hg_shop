package com.fangxupeng.service.imp;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.fangxupeng.configuration.Adminroperties;
import com.fangxupeng.mapper.UserMapper;
import com.fangxupeng.service.UserService;
@Service(interfaceClass = UserService.class,version = "1.0.0")
public class UserServiceimp implements UserService{
	
	@Autowired
	Adminroperties adminPro;
	
	@Override
	public boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return adminPro.getAdminName().equals(userName)
				&& adminPro.getPassWord().equals(passWord) ;
	}

}
