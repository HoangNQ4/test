package com.demo.mockproject.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.mockproject.util.Constant.Gender;

@Entity
@Table(name = "Employees")
public class Employees {
	
	@Id
    @Column(name = "ID", nullable=false)
	private int emp_no;
	
	@Column(name = "birth_date", nullable=false)
	private Date birth_date;
	
	@Column(name = "first_name", nullable=false)
	private String first_name;
	
	@Column(name = "last_name",nullable=false)
	private String last_name;
	
	@Column(name = "gender", nullable=true)
	private Gender gender;
	
	@Column(name = "hire_date", nullable=false)
	private Date hire_date;
	
	@ManyToOne
	@JoinColumn(name="dept_no", nullable = false)
	private Departments department;
	
	public Employees(){
		
	}
	
	public Employees(int emp_no, Date birth_date, String first_name, String last_name, Gender gender, Date hire_date, String dept_no) {
		super();
		this.emp_no = emp_no;
		this.birth_date = birth_date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.hire_date = hire_date;
		this.department = new Departments(dept_no, "");
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

}
