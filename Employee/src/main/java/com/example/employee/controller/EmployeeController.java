package com.example.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.repository.EmployeeRepository;
import com.example.employee.model.Employee;
import com.example.employee.exception.ResourceNotFoundException;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository; 
	
	//Get all employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	
	
	
	//create employee rest api
	@PostMapping("/employees")
	public Employee createEmpoyee(@RequestBody Employee employee) {
		System.out.println("Received Employee: " + employee);
		return employeeRepository.save(employee);
	}
	
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
//		
//		Employee employee = employeeRepository.findById(id)
//				.orElseThrow(null);
//		
//		return ResponseEntity.ok(employee);
//		
//	}
	
//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
//		Employee employee = employeeRepository.findById(id)
//				.orElseThrow(null);
//		
//		employee.setFirstName(employeeDetails.getFirstName());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setEmailId(employeeDetails.getEmailId());
//		
//		Employee updatedEmployee = employeeRepository.save(employee);
//		return ResponseEntity.ok(updatedEmployee);
//	}

	
	

	
	
}
