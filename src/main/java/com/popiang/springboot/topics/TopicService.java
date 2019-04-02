package com.popiang.springboot.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>();

	public TopicService() {
		
		topics.add(new Topic("spring", "Spring FrameWork", "Spring Framework Description"));
		topics.add(new Topic("java", "Java Core", "Fundamentals of Java"));
		topics.add(new Topic("php", "PHP Object Oriented", "Blah blah blah"));
		
	}
	
	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
