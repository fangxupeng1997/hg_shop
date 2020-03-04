package com.fangxupeng.service;
/**
 * 

* <p>Title: SpecService</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2020年3月4日
 */

import com.fangxupeng.hgshop.Spec;
import com.github.pagehelper.PageInfo;

public interface SpecService {
	
	PageInfo<Spec> list(String name,int page);
	
	int add(Spec spec);
	
	int update(Spec spec);
	
	int delete(int id);
	/*
	 * 根据id查找 用于修改回显
	 */
	Spec findById(int id);
	
	/*
	 * 批量删除
	 */
	int deleteSatch(int[] id);
	
	
}
