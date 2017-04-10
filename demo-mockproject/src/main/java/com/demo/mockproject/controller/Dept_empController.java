/*package com.demo.mockproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mockproject.entity.Dept_emp;
import com.demo.mockproject.service.Dept_empService;

@RestController
public class Dept_empController {
	
	@Autowired
	private Dept_empService dept_empService;
	
	//Get
	@RequestMapping("/dept_emp")
	public List<Dept_emp> getAllDept_emp(){
		return dept_empService.getAllDept_emp();
	}
	
	//Get by ID
	@RequestMapping("/dept_emp/emp_no={emp_no}")
	public Dept_emp getDept_empByEmp_no(@PathVariable int emp_no){
		return dept_empService.getDept_empByEmp_no(emp_no);
	}
	
	@RequestMapping("/dept_emp/dept_no={dept_no}")
	public Dept_emp getDept_empByDept_no(@PathVariable String dept_no){
		return dept_empService.getDept_empByDept_no(dept_no);
	}
	
	//Post
	@RequestMapping(method=RequestMethod.POST, value="/dept_emp")
	public ResponseEntity<String> addDept_emp(@RequestBody Dept_emp dept_emp){
		try{
			if(dept_empService.addDept_emp(dept_emp)){
				return new ResponseEntity<String>("ok", HttpStatus.OK);
			}
			return new ResponseEntity<String>("input invalid", HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Exception", HttpStatus.BAD_REQUEST);
		}
	}
	
	//Put
	@RequestMapping(method=RequestMethod.PUT, value="/dept_emp/emp_no={emp_no}")
	public ResponseEntity<String> updateDept_empByEmp_no(@RequestBody Dept_emp dept_emp, @PathVariable int emp_no){
		try{
			if(dept_empService.updateDept_empByEmp_no(dept_emp, emp_no)){
				return new ResponseEntity<String>("ok", HttpStatus.OK);
			}
			return new ResponseEntity<String>("input invalid", HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Exception", HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/dept_emp/dept_no={dept_no}")
	public ResponseEntity<String> updateDept_empByDept_no(@RequestBody Dept_emp dept_emp, @PathVariable String dept_no){
		try{
			if(dept_empService.updateDept_empByDept_no(dept_emp, dept_no)){
				return new ResponseEntity<String>("ok", HttpStatus.OK);
			}
			return new ResponseEntity<String>("input invalid", HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Exception", HttpStatus.BAD_REQUEST);
		}
	}
	
	//Delete
	@RequestMapping(method=RequestMethod.DELETE, value="/dept_emp/emp_no={emp_no}")
	public ResponseEntity<String> deleteDept_empByEmp_no(@PathVariable int emp_no){
		try{
			if(dept_empService.deleteDept_empByEmp_no(emp_no)){
				return new ResponseEntity<String>("ok", HttpStatus.OK);
			}
			return new ResponseEntity<String>("input invalid", HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Exception", HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/dept_emp/dept_no={dept_no}")
	public ResponseEntity<String> deleteDept_empByDept_no(@PathVariable String dept_no){
		try{
			if(dept_empService.deleteDept_empByDept_no(dept_no)){
				return new ResponseEntity<String>("ok", HttpStatus.OK);
			}
			return new ResponseEntity<String>("input invalid", HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<String>("Exception", HttpStatus.BAD_REQUEST);
		}
	}

}
*/