package com.demo.mockproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.mockproject.entity.Departments;
import com.demo.mockproject.entity.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {
	//public List<Employees> findByDepartmentDept_no(String departmentDept_no);

}
