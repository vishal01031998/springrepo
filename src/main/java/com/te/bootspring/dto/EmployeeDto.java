package com.te.bootspring.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.te.bootspring.entity.EmployeeEducation;
import com.te.bootspring.entity.EmployeeSecondary;

import lombok.Data;
@Data
public class EmployeeDto {
	@Id
	private int empId;
	private String empName;
	private int empAge;
	
	private List<EmployeeEducation> educationInfo;
	
	private EmployeeSecondary employeeSecondaryInfo;
	

}
