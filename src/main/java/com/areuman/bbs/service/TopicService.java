package com.areuman.bbs.service;

import java.util.List;

import com.areuman.bbs.model.Topic;

public interface TopicService {

	List<Topic> selectTopics();
	List<Topic> selectTopicsByAsc();
	List<Topic> selectTopicsByDesc();
	List<Topic> selectTopicsByDate();
}
