package com.jpademo.akmspjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

//Relations: a) OneToOne, b) OneToMany, c) ManyToOne, d) ManyToMany

@Entity
@Getter
@Setter
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String city;
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;

}
