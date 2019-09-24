package com.dependencyinjection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	private Address address;
	private Department department;
	
	@Autowired
	public Employee(Address address,Department department) {
		this.address = address;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", department=" + department + "]";
	}
	
}
