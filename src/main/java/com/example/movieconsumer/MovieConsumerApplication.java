package com.example.movieconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MovieConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieConsumerApplication.class, args);
	}

}
