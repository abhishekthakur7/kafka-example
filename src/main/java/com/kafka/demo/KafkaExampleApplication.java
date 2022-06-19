package com.kafka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExampleApplication.class, args);
	}

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("newTopic", "Hello world " + i);
			}
		};
	}

}
