package com.cts.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class QuestionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsServiceApplication.class, args);
	}

}
