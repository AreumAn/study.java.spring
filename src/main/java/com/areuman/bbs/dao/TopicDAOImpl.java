package com.areuman.bbs.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.areuman.bbs.model.Topic;

@Repository
public class TopicDAOImpl implements TopicDAO {

	@Inject
	SqlSession sqlSession;
	@Override
	public List<Topic> selectTopics() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectTopics");
	}

}
