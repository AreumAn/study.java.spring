package com.areuman.bbs.dao;

import java.util.List;

import com.areuman.bbs.model.Topic;


public interface TopicDAO {
	
	List<Topic> selectTopics();
	List<Topic> selectTopicsByAsc();
	List<Topic> selectTopicsByDesc();
	List<Topic> selectTopicsByDate();
	void insertTopic(Topic topic);
}
