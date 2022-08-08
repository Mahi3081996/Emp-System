package com.empmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empmanagement.entity.Employee;
import com.empmanagement.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@RequestMapping("/add")
	public void add(@RequestBody Employee employee) {
		empService.add(employee);
	}

}
