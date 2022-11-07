package com.te.bootspring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.bootspring.entity.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, String> {
	//Employee findByEmpId(String empId);

}
