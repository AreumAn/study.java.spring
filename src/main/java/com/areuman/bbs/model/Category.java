package com.areuman.bbs.model;


public class Category {
	String cName;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Category [cName=" + cName + "]";
	}
	

}
