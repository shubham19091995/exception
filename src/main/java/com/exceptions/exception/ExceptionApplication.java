package com.exceptions.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exceptions.exception.Repository.repo;
import com.exceptions.exception.models.product;

@SpringBootApplication
public class ExceptionApplication {
	@Autowired
	public repo customRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExceptionApplication.class, args);
	}

	@Bean
	public void saveit(){
customRepo.save(new product(1, "productName", 2, 200, "description"));
	}

}
