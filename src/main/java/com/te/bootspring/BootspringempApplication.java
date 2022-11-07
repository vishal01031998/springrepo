package com.te.bootspring;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootspringempApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootspringempApplication.class, args);
	}
    @Bean
	public ModelMapper mapper() {
    	return new ModelMapper();
		
	}
	
	

}
