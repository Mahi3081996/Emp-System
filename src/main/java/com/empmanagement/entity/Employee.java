package com.empmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class Employee {
	
	
 @javax.persistence.Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String empName;
	 private String empCity;
	 private int empMob;
	 
	 
	public Employee() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpCity() {
		return empCity;
	}


	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}


	public int getEmpMob() {
		return empMob;
	}


	public void setEmpMob(int empMob) {
		this.empMob = empMob;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empCity=" + empCity + ", empMob=" + empMob + "]";
	}


	public Employee(int id, String empName, String empCity, int empMob) {
		super();
		this.id = id;
		this.empName = empName;
		this.empCity = empCity;
		this.empMob = empMob;
	}
	

	 
	

}
