package com.dependencyinjection.beans;

public class Department {
	private String dName;

	public Department(String dName) {
		this.dName = dName;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}



	@Override
	public String toString() {
		return "Department [dName=" + dName + "]";
	}
	
	
}
