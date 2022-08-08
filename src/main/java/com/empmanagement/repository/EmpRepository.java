package com.empmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empmanagement.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
