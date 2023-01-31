package com.codemind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.Service.EmployeeService;
import com.codemind.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {

		System.out.println("Inside EmployeeController getAllEmployee()");

		return employeeService.getAllEmployee();
	}

	@PostMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee) {

		System.out.println("Inside EmployeeController deleteEmployee()");

		return employeeService.saveEmployee(employee);
	}

	@DeleteMapping("employee/{id}")
	public String deleteEmployee(@PathVariable("id") Integer employeeId) {

		System.out.println("Inside EmployeeController deleteEmployee()");

		return employeeService.deleteEmployee(employeeId);

	}

   @PutMapping("employee/") public Employee updateEmployee(@RequestBody
  Employee employee, @PathVariable("id") Integer empId) {
  
  System.out.println("Inside EmployeeController updateEmployee()");
  
  return employeeService.updateEmployee(employee, empId); }
  
 }
 

