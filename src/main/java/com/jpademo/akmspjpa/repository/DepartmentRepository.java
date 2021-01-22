package com.jpademo.akmspjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpademo.akmspjpa.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
