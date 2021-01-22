package com.jpademo.akmspjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpademo.akmspjpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
