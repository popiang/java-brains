package com.popiang.springboot.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService service;

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return service.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return service.getTopic(id);
	}
	
}
