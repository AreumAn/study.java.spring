package com.areuman.bbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.areuman.bbs.dao.TopicDAO;
import com.areuman.bbs.model.Topic;

@Service
public class TopicServiceImpl implements TopicService {

	@Inject
	TopicDAO topicDAO;
	@Override
	public List<Topic> selectTopics() {
		// TODO Auto-generated method stub
		return topicDAO.selectTopics();
	}
	@Override
	public List<Topic> selectTopicsByAsc() {
		// TODO Auto-generated method stub
		return topicDAO.selectTopicsByAsc();
	}
	@Override
	public List<Topic> selectTopicsByDesc() {
		// TODO Auto-generated method stub
		return topicDAO.selectTopicsByDesc();
	}
	@Override
	public List<Topic> selectTopicsByDate() {
		// TODO Auto-generated method stub
		return topicDAO.selectTopicsByDate();
	}
	@Override
	public void insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicDAO.insertTopic(topic);
	}
	@Override
	public Topic selectOneTopic(int topicID) {
		// TODO Auto-generated method stub
		return topicDAO.selectOneTopic(topicID);
	}

}
