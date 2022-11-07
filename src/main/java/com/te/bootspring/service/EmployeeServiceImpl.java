package com.te.bootspring.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.bootspring.dao.EmployeeDao;
import com.te.bootspring.dto.EmployeeDto;
import com.te.bootspring.entity.Employee;
import com.te.bootspring.entity.EmployeeEducation;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeDao dao;
@Autowired
private ModelMapper mapper;

@Override
public EmployeeDto register(EmployeeDto empDto) {
	Employee request =mapper.map(empDto, Employee.class);
	Employee save = dao.save(request);
	return this.mapper.map(save, EmployeeDto.class);
}

@Override
public EmployeeDto addEmployee(EmployeeDto empDto) {
	Employee map= mapper.map(empDto, Employee.class);
	map.getEmployeeSecondaryInfo().setEmployeePrimaryInfo(map);
	for(EmployeeEducation e : map.getEducationInfo()) {
		e.setEmployeePrimaryInfo(map);
	}
	Employee entity= dao.save(map);
	return mapper.map(entity, EmployeeDto.class);
}


}
