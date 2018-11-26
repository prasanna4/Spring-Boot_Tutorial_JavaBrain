package io.javabrains.springboot.quickstart.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component

public class TopicService {

	@Autowired
	private TopicRepository topicRepositoryinstance;
	
	
	private List<Topic> topics= new ArrayList<>(Arrays.asList
	(new Topic("Spring","Spring Framework","Java Brain Spring Framework"),
	 new Topic("Java","Java","Java Brain Java Course"),
	 new Topic("Angular","Angular Framework","Java Brain angular 6 Framework")
	));
	
	public List<Topic> getAllTopics(){
	   
		List<Topic> topics=new ArrayList<>();
		
		 topicRepositoryinstance.findAll().forEach(topics::add);
		 return topics;
	}
	
	
	public Optional<Topic> getTopic(String idarg) {
		 return topicRepositoryinstance.findById(idarg);
	}


	public void addTopic(Topic topicarg) {
		topicRepositoryinstance.save(topicarg);
	}

	public void updateTopic(Topic topic, String id) {
		topicRepositoryinstance.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepositoryinstance.deleteById(id);
	}
}
