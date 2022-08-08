package com.empmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmanagement.entity.Employee;
import com.empmanagement.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
	public void add(Employee employee)
	{
		System.out.println("Employee Data "+employee);
		empRepository.save(employee);
	}
	}

