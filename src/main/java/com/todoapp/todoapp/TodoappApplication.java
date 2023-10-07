package com.todoapp.todoapp;

import com.todoapp.todoapp.Controller.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoappApplication {

//	@Bean
//	public CorsFilter corsFilter() {
//		return new CorsFilter();
//	}

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

}
