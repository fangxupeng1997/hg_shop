package com.fangxupeng.mapper;

import java.util.List;

import com.fangxupeng.hgshop.Spec;
import com.fangxupeng.hgshop.SpecOption;

public interface SpecMapper {

	List<Spec> list(String name);

	int addSpec(Spec spec);

	int addOption(SpecOption specOption);

	int updateSpec(Spec spec);

	int deleteSpecOption(int id);

	void deleteSpec(int id);

	Spec get(int id);

	int deleteSpecOptionBatch(int[] ids);

	int deleteSpecBatch(int[] ids);

}
