package com.openclassroms.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassroms.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
	
}