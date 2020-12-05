package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EventoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoApplication.class, args);
	}
}
