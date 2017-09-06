package io.javaproject.learningspring.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
			new Topic("spring", "spring framework", "spring framework description"),	
			new Topic("java", "head first java", "head first description"),	
			new Topic("spring", "spring action", "spring action description")				
				);
	}
	
}
