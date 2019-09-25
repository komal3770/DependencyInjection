package com.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.dependencyinjection.beans.Company;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, 
		  DataSourceTransactionManagerAutoConfiguration.class, 
		  HibernateJpaAutoConfiguration.class})
public class SetterInjectionMain {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SetterInjectionMain.class);
		Company company = context.getBean(Company.class);
		System.out.println(company);
	}

}
