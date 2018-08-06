package com.cg.ui;

import java.util.Scanner;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.EmployeeController;
import com.cg.data.Employee;

public class UI {

	
	public static EmployeeController employeeController;
     
	static Employee empDetails = new Employee();
	
	public void setEmployeeController(EmployeeController employeeController) {
		this.employeeController = employeeController;
	}



	public static void  acceptData() {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		employeeController = (EmployeeController) context.getBean("employeeController");
		
		Scanner scanner = new Scanner (System.in);
		int choice;
		do {
		
		System.out.println("Enter your choice\n1.Add Employee\n2.View all employees\n3.View Employee by id.\n4.Delete Employee by id.\n5.To exit");
		choice=scanner.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter EmployeeId");
		        int id = scanner.nextInt();
		        empDetails.setId(id);
		        System.out.println("Enter Employee Name");
		        String name = scanner.next();
		        empDetails.setName(name);
		        employeeController.addEmployee(empDetails);
		        break;
		        
		case 2: System.out.println(employeeController.viewAllEmployee());
		        break;
		        
		case 3: System.out.println("Enter the employee id");
		        int empid = scanner.nextInt();
		        System.out.println(employeeController.getEmpById(empid));
		        break;
		        
		case 4: System.out.println("Enter the employee id");
		        int employeeid = scanner.nextInt();
		        employeeController.deleteEmp(employeeid);
		        System.out.println("Deleted Successfully");
		        break;
		        
		case 5: return;
		        

		}
		
		
		}while(true);
		
		
		
	}
}
