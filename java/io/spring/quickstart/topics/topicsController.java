package io.spring.quickstart.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicsController {
	@Autowired
	private topicsService topicsservice;
	
	@RequestMapping("/topics")
public List<topics> getAllTopics()
{
	return topicsservice.getAllTopics();
}



@RequestMapping("/topics/{id}")
public topics getTopic(@PathVariable String id)
{
return topicsservice.getTopics(id);
}

@RequestMapping(method=RequestMethod.POST, value="/topics")
public void addTopics(@RequestBody topics topic)
{
	topicsservice.addTopics(topic);
}

@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
public void UpdateTopics(@RequestBody topics topic, @PathVariable String id)
{
	topicsservice.updateTopics(topic,id);
}

@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
public void deleteTopics(@PathVariable String id)
{
	topicsservice.deleteTopics(id);
}

}
