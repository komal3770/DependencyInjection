package com.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.dependencyinjection.beans.Employee;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, 
								  DataSourceTransactionManagerAutoConfiguration.class, 
								  HibernateJpaAutoConfiguration.class})
public class ConstructorDependencyinjectionApplication {

	public static void main(String[] args) {
		System.out.println(getEmployeeFromContext());
	}

	public static Employee getEmployeeFromContext() {
		ApplicationContext context = SpringApplication.run(ConstructorDependencyinjectionApplication.class);
		return context.getBean(Employee.class);
	}
}
