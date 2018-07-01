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
	@Override
	public List<Topic> selectTopicsByAsc() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectTopicsByAsc");
	}
	@Override
	public List<Topic> selectTopicsByDesc() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectTopicsByDesc");
	}
	@Override
	public List<Topic> selectTopicsByDate() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectTopicsByDate");
	}
	@Override
	public void insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		sqlSession.insert("insertTopic", topic);
	}

}
