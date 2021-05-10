package com.zensar.task;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class OlxOnlineAdvertiseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxOnlineAdvertiseAppApplication.class, args);
	}

}
