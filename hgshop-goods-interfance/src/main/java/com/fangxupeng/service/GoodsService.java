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

* @date 2020��3��3��
 */
/*
 * ǿ��  Dubbo�ӿں�ʽ����Ҫ�з�void�ķ���ֵ
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
