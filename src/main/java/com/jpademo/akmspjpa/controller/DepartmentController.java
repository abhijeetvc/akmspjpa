package com.jpademo.akmspjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.akmspjpa.model.Department;
import com.jpademo.akmspjpa.repository.DepartmentRepository;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping("/savedept")
	public String saveDept(@RequestBody Department department) {
		
		departmentRepository.save(department);
		return "Department saved";
		
	}

}
