package com.course.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.course.model.Person;

@Configuration
public class CsvToDbBatchConfiguration {

	// Reader
	
	@Bean
	ItemReader<Person> personReader() {
		return null;
	}
	
	// Processor
	
	// Writer
	
	// Step
	
	// Job
	
	
}
