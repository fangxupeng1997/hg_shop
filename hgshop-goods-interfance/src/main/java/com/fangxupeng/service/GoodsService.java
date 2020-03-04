package com.fangxupeng.service;

import java.util.List;

import com.fangxupeng.hgshop.Brand;
import com.fangxupeng.hgshop.Category;
import com.github.pagehelper.PageInfo;

/**
 * 

* <p>Title: GoodsService</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2020年3月3日
 */
/*
 * 强调  Dubbo接口韩式必须要有非void的返回值
 */
public interface GoodsService {
	
	int  addBrand(Brand brand);
	
	int  updateBrand(Brand brand);
	
	int  deleteBrand(Integer id);
	
	PageInfo<Brand> listBrand(String firstChar,int page);
	
	int  addCategory(Category category);
	
	int  updateCategory(Category category);
	
	int  deleteCategory(Integer id);
	
	PageInfo<Category> listCategory(String firstChar,int page);

	List<Category> treeCategory();

}
