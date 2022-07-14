package com.wipro.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "emp_info")
public class Employee 
{
	@Id
	@Column(name = "emp_id")
	private Integer empId;
	
	@Column(name = "emp_name",nullable = false,length = 100)
	private String empName;
	
	@Column(name = "emp_email",nullable = false,unique = true,length = 100)
	private String empEmail;
	
	//@JsonIgnore
	@Column(name = "emp_password", nullable = false,length = 10)
	private String empPassword;
	
	@Column(name = "emp_salary",nullable = true)
	private Float empSalary;
	
	// Default Constuctor / Parameter Constructor
	// Getter and Setter
	// toString
}