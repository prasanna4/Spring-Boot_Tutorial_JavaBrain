package io.javabrains.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
public class CourseApiTutorial28SpringDataJpaAllCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiTutorial28SpringDataJpaAllCrudApplication.class, args);
	}
}