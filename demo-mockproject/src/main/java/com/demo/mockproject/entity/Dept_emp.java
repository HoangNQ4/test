/*package com.demo.mockproject.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.demo.mockproject.util.Dept_EmpId;

@Entity
@Table(name = "Dept_emp")
public class Dept_emp {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Dept_EmpId;
	
	@Id
	private Dept_EmpId dept_EmpId;
	
	@ManyToOne
	@JoinColumn(name="emp_no", nullable = false, unique = true)
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name="dept_no", nullable = false, unique = true)
	private Departments department;
	
	@Column(name = "from_date", nullable=false)
	private Date from_date;
	
	@Column(name = "to_date", nullable=false)
	private Date to_date;
	
	public Dept_emp(){
		
	}
	
	public Dept_emp(Date from_date, Date to_date) {
		super();
		this.from_date = from_date;
		this.to_date = to_date;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public int getDept_EmpId() {
		return Dept_EmpId;
	}

	public void setDept_EmpId(int dept_EmpId) {
		this.Dept_EmpId = dept_EmpId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

}
*/