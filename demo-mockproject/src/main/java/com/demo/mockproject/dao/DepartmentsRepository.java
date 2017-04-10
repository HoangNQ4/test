package com.demo.mockproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.mockproject.entity.Departments;

public interface DepartmentsRepository extends CrudRepository<Departments, String> {

}
