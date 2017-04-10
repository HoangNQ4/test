package com.demo.mockproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mockproject.entity.Departments;
import com.demo.mockproject.entity.Employees;
import com.demo.mockproject.service.EmployeesService;



@RestController
public class EmployeesController {
	
	@Autowired
	private EmployeesService employeesService;
	
	@RequestMapping("/departments/{dept_no}/employees")
	public ResponseEntity<List<Employees>> getAllEmployees(@PathVariable String dept_no){
		List<Employees> result = new ArrayList<>();
		try{
			result = employeesService.getAllEmployees(dept_no);
			return new ResponseEntity<List<Employees>>(result, HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<List<Employees>>(result, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping("/departments/{dept_no}/employees/{emp_no}")
	public ResponseEntity<Employees> getEmployeeById(@PathVariable int emp_no){
		Employees result = null;
		try{			
			result = employeesService.getEmployeeById(emp_no);
			return new ResponseEntity<Employees>(result, HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<Employees>(result, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments/{dept_no}/employees")
	public ResponseEntity<String> addemployee(@RequestBody Employees employee, @PathVariable String dept_no){
		try{
			employee.setDepartment(new Departments(dept_no, ""));
			if(employeesService.addEmployee(employee) == true){
				return new ResponseEntity<String>("successfull", HttpStatus.OK);
			}
			else{
				return new ResponseEntity<String>("emp_no Existed", HttpStatus.BAD_REQUEST);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<String>("Exception",
			    HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{dept_no}/employees/{emp_no}")
	public ResponseEntity<String> updateEmployee(@RequestBody Employees employee, @PathVariable String dept_no, @PathVariable int emp_no){
		try{
			employee.setDepartment(new Departments(dept_no, ""));
			employeesService.updateEmployee(employee);
			return new ResponseEntity<String>("successfull", HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<String>("Exception",
			    HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{dept_no}/employees/{emp_no}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int emp_no){
		try{
			employeesService.deleteEmployee(emp_no);
			return new ResponseEntity<String>("successfull", HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<String>("Exception",
			    HttpStatus.BAD_REQUEST);
		}
	}

}
