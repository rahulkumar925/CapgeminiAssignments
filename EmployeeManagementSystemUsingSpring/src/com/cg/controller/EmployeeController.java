package com.cg.controller;

import java.util.List;

import com.cg.data.Employee;
import com.cg.service.EmployeeService;

public class EmployeeController {

	public EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void addEmployee(Employee emp) {
		employeeService.addEmployee(emp);
	}
	
	public List<Employee>  viewAllEmployee() {
		return employeeService.viewAllEmployee();
	}

	public Employee getEmpById(int id) {
		return  employeeService.getEmpById(id);
	}
	
	public List<Employee> deleteEmp(int id) {
		return  employeeService.deleteEmp(id);
	}
}
