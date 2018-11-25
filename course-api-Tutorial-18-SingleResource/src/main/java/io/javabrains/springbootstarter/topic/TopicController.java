package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
 
	@Autowired
	private TopicService topicserviceinstance;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return topicserviceinstance.getAllTopics();
		
	}

	
	
   /*	@RequestMapping("/topics/{foo}")
	public Topic getTopic(@PathVariable("foo") String id) {
		
		return topicserviceinstance.getTopic(id);
	
	}*/
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		
		return topicserviceinstance.getTopic(id);
	
	}
	
}
