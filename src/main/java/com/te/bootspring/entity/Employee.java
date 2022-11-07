package com.te.bootspring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Employee implements Serializable {
	@Id
	private int empId;
	private String empName;
	private int empAge;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	@JsonManagedReference
	private List<EmployeeEducation> educationInfo;
	@OneToOne(cascade= CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	@JsonManagedReference
	private EmployeeSecondary employeeSecondaryInfo;
	
	

}
