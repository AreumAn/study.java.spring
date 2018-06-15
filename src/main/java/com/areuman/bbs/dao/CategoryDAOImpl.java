package com.areuman.bbs.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.areuman.bbs.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Inject
	SqlSession sqlSession;

	@Override
	public List<Category> selectCategories() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectCategories");
	}

}
