/*package com.demo.mockproject.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.mockproject.dao.Dept_empRepository;
import com.demo.mockproject.entity.Dept_emp;

@Service
public class Dept_empService {
	
	@Autowired
	private Dept_empRepository dept_empRepository;
	
	//Get
	public List<Dept_emp> getAllDept_emp(){
		//List<Topic> topics = new ArrayList<>();
		return (List<Dept_emp>) dept_empRepository.findAll();//.forEach(topics::add);
		//return topics;
	}
	
	//-------------------------
	//Get by ID
	public Dept_emp getDept_empByEmp_no(int emp_no){
		return getAllDept_emp().stream().filter(t ->t.getEmployee().getEmp_no() == emp_no).findFirst().get();
	}
	
	public Dept_emp getDept_empByDept_no(String dept_no) {
		return getAllDept_emp().stream().filter(t ->t.getDepartment().getDept_no().equals(dept_no)).findFirst().get();
	}
	//--------------------------

	//Post
	public Boolean addDept_emp(Dept_emp dept_emp) {
		if(dept_empRepository.findOne(dept_emp.getDept_EmpId()) == null){
			dept_empRepository.save(dept_emp);
			return true;
		}
		else{
			return false;
		}
	}

	//-------------------------
	//Update
	public boolean updateDept_empByEmp_no(Dept_emp dept_emp, int emp_no) {
		Dept_emp d_e = getAllDept_emp().stream().filter(t ->t.getEmployee().getEmp_no() == emp_no).findFirst().get();
		if(d_e != null){
			dept_emp.setDept_EmpId(d_e.getDept_EmpId());
			dept_empRepository.save(dept_emp);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean updateDept_empByDept_no(Dept_emp dept_emp, String dept_no) {
		Dept_emp d_e = getAllDept_emp().stream().filter(t ->t.getDepartment().getDept_no().equals(dept_no)).findFirst().get();
		if(d_e != null){
			dept_emp.setDept_EmpId(d_e.getDept_EmpId());
			dept_empRepository.save(dept_emp);
			return true;
		}
		else{
			return false;
		}
	}
	//-------------------------

	//-------------------------
	//Delete
	public boolean deleteDept_empByEmp_no(int emp_no) {
		if(getAllDept_emp().stream().filter(t ->t.getEmployee().getEmp_no() == emp_no).findFirst() != null){
			Dept_emp d_e = getAllDept_emp().stream().filter(t ->t.getEmployee().getEmp_no() == emp_no).findFirst().get();
			dept_empRepository.delete(d_e.getDept_EmpId());
			return true;
		}
		else{
			return false;
		}
	}

	public boolean deleteDept_empByDept_no(String dept_no) {
		Dept_emp d_e = null;
		d_e = getAllDept_emp().stream().filter(t ->t.getDepartment().getDept_no().equals(dept_no)).findFirst().get();
		if(d_e != null){
			dept_empRepository.delete(d_e.getDept_EmpId());
			return true;
		}
		else{
			return false;
		}
	}
	//-------------------------

}
*/