package com.EY.Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EYassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EYassignmentApplication.class, args);
	}
}
