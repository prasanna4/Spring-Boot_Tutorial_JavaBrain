package io.javabrains.springbootstarter.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {

	
	private List<Topic> topics= new ArrayList<>(Arrays.asList
	(new Topic("Spring","Spring Framework","Java Brain Spring Framework"),
	 new Topic("Java","Java","Java Brain Java Course"),
	 new Topic("Angular","Angular Framework","Java Brain angular 6 Framework")
	));
	
	public List<Topic> getAllTopics(){
	   System.out.println("inside: TopicService-getAllTopics");
		return topics;
	}
	
	
	public Topic getTopic(String idarg) {
		return topics.stream().filter(t->t.getId().equals(idarg)).findFirst().get();
	}


	public void addTopic(Topic topicarg) {
		topics.add(topicarg);
	}
}
