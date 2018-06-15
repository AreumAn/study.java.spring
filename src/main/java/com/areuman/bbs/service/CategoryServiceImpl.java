package com.areuman.bbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.areuman.bbs.dao.CategoryDAO;
import com.areuman.bbs.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Inject
	CategoryDAO categoryDAO;

	@Override
	public List<Category> selectCategories() {
		// TODO Auto-generated method stub
		return categoryDAO.selectCategories();
	}

}
