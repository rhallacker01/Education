package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

//GET	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	} //method returns a list of objects; Spring MVC will convert this list into a Json; Json will get returned when calling /topics url
	
	@RequestMapping("/topics/{id}") //{id} = token for a variable in the URL
	public Topic getTopic(@PathVariable String id) { //maps URL path variable^ to the method parameter
		return topicService.getTopic(id);
	}
	
//POST	
	@RequestMapping(method=RequestMethod.POST, value="/topics") //Map this request to any POST to /topics
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
//PUT	
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}") 
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
//DELETE
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}") 
	public void deleteTopic(@PathVariable String id) { 
		topicService.deleteTopic(id);
	}
	
	
	
	
	
}
