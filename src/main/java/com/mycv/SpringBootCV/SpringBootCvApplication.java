package com.mycv.SpringBootCV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class SpringBootCvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCvApplication.class, args);
	}

}
