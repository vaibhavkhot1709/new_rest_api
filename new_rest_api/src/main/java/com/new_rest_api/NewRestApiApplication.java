package com.new_rest_api;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NewRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewRestApiApplication.class, args);
	}
	
	
	@Bean
	public DozerBeanMapper mapper() {
	    return new DozerBeanMapper();
	}
	
//	@Bean    no needto give this
//	public Docket api() {
//	    return new Docket(DocumentationType.SWAGGER_2);
//	}


}
