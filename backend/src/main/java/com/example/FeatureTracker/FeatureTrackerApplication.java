package com.example.FeatureTracker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FeatureTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureTrackerApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("CommandLineRunner running");

			String[] beanNames = ctx.getBeanDefinitionNames();

		};
	}

}
