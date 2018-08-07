package io.spring.quickstart.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicsService {
private List<topics> toPics = new ArrayList<> (Arrays.asList(
		new topics("Spring","Spring framework","Spring framework Desc"),
		new topics("java","java framework","java framework Desc"),
		new topics("js","js framework","js framework Desc")));
public List<topics> getAllTopics()
{
	return toPics;
}


public topics getTopics(String id) {
	// TODO Auto-generated method stub
	return toPics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}


public void addTopics(topics topic) {
	toPics.add(topic);
	
}


public void updateTopics(topics topic,String id) {
	for(int i=0; i<toPics.size();i++)
	{
		topics t = toPics.get(i);
		if(t.getId().equals(id))
		{
			toPics.set(i,topic);
		}
	}
	
}


public void deleteTopics(String id) {
	toPics.removeIf(t -> t.getId().equals(id));
	
}


}
