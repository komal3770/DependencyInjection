package com.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	private Department department;

	public Company(){
		System.out.println("Constructor called");
	}
	
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Company [department=" + department + "]";
	}
	
	
	
}
