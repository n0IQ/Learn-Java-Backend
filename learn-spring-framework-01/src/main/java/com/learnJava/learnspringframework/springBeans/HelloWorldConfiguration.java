package com.learnJava.learnspringframework.springBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String Country, String City) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Mohit";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Sangeeta", 49);
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age());
	}
	
	@Bean(name="address2")
	public Address address() {
		return new Address("India", "Mumbai");
	}
}
