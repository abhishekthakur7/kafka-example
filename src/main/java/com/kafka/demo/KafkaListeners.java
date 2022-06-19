package com.kafka.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	//if we have more listener then groupId should be unique across all listeners
	@KafkaListener(topics = {"newTopic"}, groupId = "someGroupId")
	void listener(String data) {
		System.out.println("Listener received: " + data + " 👍");
	}

}
