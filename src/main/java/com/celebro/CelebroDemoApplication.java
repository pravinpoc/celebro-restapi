package com.celebro;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class CelebroDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CelebroDemoApplication.class, args);
	}
	
	 @Bean
	 public ModelMapper modelMapper() {
	     return new ModelMapper();
	 }

}

