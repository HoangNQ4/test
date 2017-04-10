package com.demo.mockproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mockproject.dao.DepartmentsRepository;
import com.demo.mockproject.entity.Departments;

@Service
public class DepartmentsService {
	
	@Autowired
	private DepartmentsRepository departmentsRepository;
	
	public List<Departments> getAllDepartments(){
		//List<Topic> topics = new ArrayList<>();
		return (List<Departments>) departmentsRepository.findAll();//.forEach(topics::add);
		//return topics;
	}
	
	public Departments getDepartmentById(String id){
		return departmentsRepository.findOne(id);
	}

	public void addDepartment(Departments department) {
		departmentsRepository.save(department);
	}

	public void updateDepartment(Departments department, String id) {
		departmentsRepository.save(department);
	}

	public void deleteDepartment(String id) {
		departmentsRepository.delete(id);
	}

}
