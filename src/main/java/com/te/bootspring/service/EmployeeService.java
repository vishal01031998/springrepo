package com.te.bootspring.service;

import com.te.bootspring.dto.EmployeeDto;
import com.te.bootspring.entity.Employee;

public interface EmployeeService {

	public EmployeeDto register(EmployeeDto empDto);
	public EmployeeDto addEmployee(EmployeeDto empDto);

//	public Employee getEmployee(String empId);

}
