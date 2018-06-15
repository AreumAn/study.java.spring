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

}
