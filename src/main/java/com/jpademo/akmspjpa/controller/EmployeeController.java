package com.jpademo.akmspjpa.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.akmspjpa.model.Employee;
import com.jpademo.akmspjpa.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return "Employee saved";
	}

	@GetMapping("/getemployees")
	public List<Employee> getEmployeeData(){
		return employeeRepo.findAll();
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		employeeRepo.deleteById(id);
		return "Employee deleted";
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		Optional<Employee> e=employeeRepo.findById(employee.getId());
		e.get().setName(employee.getName());
		e.get().setCity(employee.getCity());
		employeeRepo.save(e.get());
		
		return "EMployee updated";
	}
	
}
