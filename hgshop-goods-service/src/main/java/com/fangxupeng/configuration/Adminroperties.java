package com.fangxupeng.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
/*
 * 配置类  读取属性文件
 */
@Configuration
@PropertySource("classpath:hgshop-admin.properties")
public class Adminroperties {
	
	@Value("${admin.name}")
	String adminName;

	@Value("${admin.pwd}")
	String passWord;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
