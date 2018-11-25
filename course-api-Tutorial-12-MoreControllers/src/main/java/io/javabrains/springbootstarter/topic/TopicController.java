package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
 
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList
				(new Topic("Spring","Spring Framework","Java Brain Spring Framework"),
				 new Topic("Java","Java","Java Brain Java Course"),
				 new Topic("Angular","Angular Framework","Java Brain angular 6 Framework")
				);
		
	}
}
