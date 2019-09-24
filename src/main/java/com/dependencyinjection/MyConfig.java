package com.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dependencyinjection.beans.Address;
import com.dependencyinjection.beans.Department;

@Configuration
public class MyConfig {
	
	@Bean
	public Address address() {
		return new Address("Mumbai", "Maharashtra");
	}
	@Bean
	public Department department() {
		return new Department("Research");
	}
}
