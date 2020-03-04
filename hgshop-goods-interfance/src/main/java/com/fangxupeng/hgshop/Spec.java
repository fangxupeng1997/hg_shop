package com.fangxupeng.hgshop;

import java.io.Serializable;
import java.util.List;
/*
 * 商品规格
 */
public class Spec implements Serializable{
	
	/** serialVersionUID*/  
	private static final long serialVersionUID = 6958989483893990145L;

	private Integer id;
	
	private String specName;
	
	private List<SpecOption> option;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public List<SpecOption> getOption() {
		return option;
	}

	public void setOption(List<SpecOption> option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "Spec [id=" + id + ", specName=" + specName + ", option=" + option + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((option == null) ? 0 : option.hashCode());
		result = prime * result + ((specName == null) ? 0 : specName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spec other = (Spec) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (option == null) {
			if (other.option != null)
				return false;
		} else if (!option.equals(other.option))
			return false;
		if (specName == null) {
			if (other.specName != null)
				return false;
		} else if (!specName.equals(other.specName))
			return false;
		return true;
	}
	
	
}
