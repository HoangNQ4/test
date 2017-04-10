package com.demo.mockproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mockproject.dao.EmployeesRepository;
import com.demo.mockproject.entity.Departments;
import com.demo.mockproject.entity.Employees;

@Service
public class EmployeesService {
	
	@Autowired
	private EmployeesRepository employeesRepository;
	
	public List<Employees> getAllEmployees(String dept_no){
		List<Employees> emp = (List<Employees>) employeesRepository.findAll();
		List<Employees> empRe = new ArrayList<>();
		emp.stream().filter(t ->t.getDepartment().getDept_no().equals(dept_no)).forEach(empRe::add);
		return empRe;
	}
	
	public Employees getEmployeeById(int emp_no){
		return employeesRepository.findOne(emp_no);
	}

	public boolean addEmployee(Employees employees) {
		if(getEmployeeById(employees.getEmp_no()) == null){
			employeesRepository.save(employees);
			return true;
		}
		else{
			return false;
		}
	}

	public void updateEmployee(Employees employees) {
		employeesRepository.save(employees);
	}

	public void deleteEmployee(int id) {
		employeesRepository.delete(id);
	}

}
