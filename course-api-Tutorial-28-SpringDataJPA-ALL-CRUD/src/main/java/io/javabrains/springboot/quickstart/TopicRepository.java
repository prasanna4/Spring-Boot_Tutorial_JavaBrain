package io.javabrains.springboot.quickstart;


import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String> {

	
}
