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
import com.demo.mockproject.service.DepartmentsService;


@RestController
public class DepartmentsController {
	
	@Autowired
	private DepartmentsService departmentsService;
	
	@RequestMapping("/departments")
	public ResponseEntity<List<Departments>> getAllEmployees(){
		List<Departments> result = new ArrayList<>();
		try{
			result = departmentsService.getAllDepartments();
			return new ResponseEntity<List<Departments>>(result, HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<List<Departments>>(result, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping("/departments/{id}")
	public ResponseEntity<Departments> getDepartmentById(@PathVariable String id){
		Departments result = null;
		try{
			result = departmentsService.getDepartmentById(id);
			return new ResponseEntity<Departments>(result, HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<Departments>(result, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments")
	public ResponseEntity<String> addDepartment(@RequestBody Departments department){
		try{
			departmentsService.addDepartment(department);
			return new ResponseEntity<String>("successful", HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<String>("exception", HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{id}")
	public ResponseEntity<String> updateDepartment(@RequestBody Departments department, @PathVariable String id){
		try{
			departmentsService.updateDepartment(department, id);
			return new ResponseEntity<String>("successfull", HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<String>("exception", HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{id}")
	public ResponseEntity<String> deleteDepartment(@PathVariable String id){
		try{
			departmentsService.deleteDepartment(id);
			return new ResponseEntity<String>("successfull", HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		    return new ResponseEntity<String>("exception", HttpStatus.BAD_REQUEST);
		}
	}

}
