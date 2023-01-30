package com.new_rest_api;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewRestApiApplication.class, args);
	}
	
	
	@Bean
	public DozerBeanMapper mapper() {
	    return new DozerBeanMapper();
	}


}
