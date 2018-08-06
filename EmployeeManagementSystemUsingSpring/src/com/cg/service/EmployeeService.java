package com.cg.service;

import java.util.List;

import com.cg.data.Employee;
import com.cg.data.EmployeeDao;

public class EmployeeService {

	public EmployeeDao employeedao;
	
	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}

	public void addEmployee(Employee emp) {
		employeedao.addEmployee(emp);
	}
	
	public List<Employee>  viewAllEmployee() {
		return employeedao.viewAllEmployee();
	}

	public Employee getEmpById(int id) {
		return employeedao.getEmpById(id);
	}
	
	public List<Employee> deleteEmp(int id) {
		return employeedao.deleteEmp(id);
	}
}

