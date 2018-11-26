package io.javabrains.springboot.quickstart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public Optional<Topic> getTopic(@PathVariable String id) {
		
		return topicserviceinstance.getTopic(id);
	
	}
	
	@RequestMapping( method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicserviceinstance.addTopic(topic);
		
	}
	
	
	@RequestMapping( method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicserviceinstance.updateTopic(topic,id);
		
	}
	
	
	@RequestMapping( method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic( @PathVariable String id) {
		topicserviceinstance.deleteTopic(id);
		
	}
}
