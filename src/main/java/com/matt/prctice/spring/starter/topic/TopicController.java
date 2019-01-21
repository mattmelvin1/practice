package com.matt.prctice.spring.starter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matt.prctice.spring.starter.topic.dataobjects.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(
				new Topic("java", "stuff", "javastuff"),
				new Topic("Spring", "stuff", "spingstuff"),
				new Topic("Cool", "stuff", "coolstuff"));
	}

}
