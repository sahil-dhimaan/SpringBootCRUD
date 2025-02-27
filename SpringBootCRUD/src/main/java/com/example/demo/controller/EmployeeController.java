package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface empService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee emp = empService.addEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}	
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAll(){
		List<Employee> listEmp = new ArrayList<>();
		listEmp =  empService.getAll();
		return new ResponseEntity<List<Employee>>(listEmp,HttpStatus.OK);
	}
	
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee> getbyId(@PathVariable("empid") Long empid){
		Employee emp = empService.getById(empid);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void>  deleteById(@PathVariable("empid") Long empid){
		 empService.getDeleteById(empid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee emp = empService.addEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}	
	
}
