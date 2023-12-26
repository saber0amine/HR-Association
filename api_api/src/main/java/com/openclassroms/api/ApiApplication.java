package com.openclassroms.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.openclassroms.api.model.Employee;
import com.openclassroms.api.repository.EmployeeRepository;

@EnableJpaRepositories(basePackages = "com.openclassroms.api.repository")

@SpringBootApplication(scanBasePackages = "com.openclassroms.api")
public class ApiApplication {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    public static void main(String[] args) {
	        SpringApplication.run(ApiApplication.class, args);
	    }

	    public void run(String... args) {

	        Iterable<Employee> allEmployees = employeeRepository.findAll();
	        System.out.println("All Employees:");
	        for (Employee employee : allEmployees) {
	            System.out.println("helllo eclipse");
	        }

	     
	    }

}
