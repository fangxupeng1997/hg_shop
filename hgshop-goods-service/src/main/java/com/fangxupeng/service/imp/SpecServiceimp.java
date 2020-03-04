package com.fangxupeng.service.imp;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.fangxupeng.hgshop.Spec;
import com.fangxupeng.hgshop.SpecOption;
import com.fangxupeng.mapper.SpecMapper;
import com.fangxupeng.service.SpecService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass = SpecService.class)
public class SpecServiceimp implements SpecService{

	@Autowired
	SpecMapper specMapper;
	
	@Override
	public PageInfo<Spec> list(String name, int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 3);
		
		return new PageInfo<Spec>(specMapper.list(name));
	}

	@Override
	public int add(Spec spec) {
		// TODO Auto-generated method stub
		//添加主表
		specMapper.addSpec(spec);
		//这里获取主键 并添加到子表
		List<SpecOption> option = spec.getOption();
		//循环添加
		int n=1;
		for (SpecOption specOption : option) {
			
			specOption.setId(spec.getId());
			
			specMapper.addOption(specOption);
			
			n++;
		}
		
		return n;
	}

	@Override
	public int update(Spec spec) {
		// TODO Auto-generated method stub
		return specMapper.updateSpec(spec);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		specMapper.deleteSpecOption(id);
		
		specMapper.deleteSpec(id);
		
		return 0;
	}

	@Override
	public Spec findById(int id) {
		// TODO Auto-generated method stub
		return specMapper.get(id);
	}

	@Override
	public int deleteSatch(int[] ids) {
		// TODO Auto-generated method stub
		//删除子表
		specMapper.deleteSpecOptionBatch(ids);
		
		specMapper.deleteSpecBatch(ids);
		
		
		return 1;
	}

}
