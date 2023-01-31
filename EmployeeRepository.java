package com.codemind.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemind.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public Employee getByName(String name);

}
