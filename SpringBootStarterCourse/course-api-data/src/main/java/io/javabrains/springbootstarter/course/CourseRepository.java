package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	//public List<Course> findByName(String name); You don't have to implement the method; Just declare with "findByProperty" format and Spring Data JPA will implement
	public List<Course> findByTopicId(String topicId);	
	
}
