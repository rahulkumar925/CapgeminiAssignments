//Create Employee Information class with fields empID, EmployeeName,EmployeeDesignation, EmpSalary,employeecommission with
//their setter and getter methods.

package com.capgemini.employeeinfo;

public class EmployeeInformation {
	
	int empId;
	String empName;
	String empDesig;
	double empSalary;
	double employeeComm;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public double getEmployeeComm() {
		return employeeComm;
	}
	public void setEmployeeComm(double employeeComm) {
		this.employeeComm = employeeComm;
	}
	
	@Override
	public String toString() {
		return "EmployeeInformation [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig
				+ ", empSalary=" + empSalary + ", employeeComm=" + employeeComm + "]";
	}
			

}
