package com.areuman.bbs.dao;

import java.util.List;

import com.areuman.bbs.model.Category;


public interface CategoryDAO {
	
	List<Category> selectCategories();
}
