package com.cg.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	List <Employee> employee = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		employee.add(emp);
	}
	
	public List<Employee> viewAllEmployee() {
		return employee;
	}
	
	public Employee getEmpById(int id) {
		
		for(Employee employee1 : employee) {
			if(employee1.getId() == id) {
				return employee1;
			}
		}
		return null;
		
	}
	
	public List<Employee> deleteEmp(int id) {
		
		Employee employee2 = null;
		for(Employee employee1: employee) {
			if(employee1.getId()==id) {
			 employee2 = employee1;
			}
		}
		employee.remove(employee2);
		return employee;
	}

}
