package com.te.bootspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.bootspring.dto.EmployeeDto;
import com.te.bootspring.dto.ResponseDto;

import com.te.bootspring.service.EmployeeService;

import lombok.AllArgsConstructor;


@RestController
//@Slf4j
@AllArgsConstructor
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@PostMapping("/register")
	public ResponseEntity<?>register(@RequestBody EmployeeDto dto){

		try {
			//service.register(empDto) ;
				return new ResponseEntity<>(new ResponseDto(false, "Registration Successfull", service.addEmployee(dto))
						, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ResponseDto>(
					new ResponseDto(true, "something went wrong" ,service.addEmployee(dto)), HttpStatus.BAD_REQUEST);
		}
		
	}
//	@GetMapping("/getById/{empId}")
//	public ResponseEntity<?> getById(@PathVariable String empId){
//		if(service.getEmployee(empId) != null) {
//			return new ResponseEntity<Employee>(service.getEmployee(empId),HttpStatus.OK);
//			
//		}
//		return new ResponseEntity<String>("Id not found",HttpStatus.BAD_REQUEST);
//
//}
}
