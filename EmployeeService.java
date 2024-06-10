package com.sj.empmanagementapplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
HashSet<Employee> empt=new HashSet<Employee>();
Employee emp1= new Employee(101,"Ravi",24,"Developer","IT", 50000);
Employee emp2= new Employee(102,"Sharma",24,"Tester","co",40000);
Employee emp3= new Employee(103,"Sham",25,"Engineer","ceo",60000);
Employee emp4= new Employee(104,"Saurabh",26,"Tester","c0o",70000);
Employee emp5= new Employee(105,"Sujit",27,"DevOps","Admin",40000);
Employee emp6= new Employee(102,"Shobha",28,"Casher","Bank",80000);
Scanner sc =new Scanner (System.in);
boolean found =false;
int id;
String name;
 int age;
 String department;
 String desiganation;
 double salary;
 public EmployeeService() {
	 empt.add(emp1);
	 empt.add(emp2);
	 empt.add(emp3);
	 empt.add(emp4);
	 empt.add(emp5);
	 empt.add(emp5);
	 empt.add(emp6);
 }
public void viewAllEmps() {
	for(Employee emp:empt) {
		System.out.println(emp);
	}
}
public void viewEmp() {
	System.out.println("Enter id: ");
	id=sc.nextInt();
	for(Employee emp:empt) {
		if(emp.getId()==id) {
			System.out.println(emp );
			found = true;
		}
	}
	if(!found) {
		System.out.println("Employee with this id is not present");
	}
}
public void updateEmployee() {
	System.out.println("Enter id: ");
	id=sc.nextInt();
	boolean found = false;
	for(Employee emp:empt) {
		if(emp.getId()==id) {
			System.out.println("Enter Name");
			name=sc.next();
			System.out.println("Enter Your Salary");
			salary=sc.nextDouble();
			emp.setName(name);
			emp.setSalary(salary);
			System.out.println("Update Details of employee are:");
			System.out.println(emp);
			found=true;
		}
	}
	if(!found) {
		System.out.println("Employee is not present");
	}
	else {
		System.out.println("Employee details update Sucessfully!!");
	}
}
public void deleteEmp() {
	System.out.println("Enter id");
	id=sc.nextInt();
	boolean found = false;
	Employee empdelete=null;
	for(Employee emp:empt) {
		if(emp.getId()==id) {
			empdelete=emp;
		found =true;
		}
	}
	if(!found) {
		System.out.println("Employee is not present ");
	}
	else {
		empt.remove(empdelete);
		System.out.println("Employee deleted Sucessfully!");	
	}
}
public void addEmp()
{
	System.out.println("Enter id");
	id=sc.nextInt();
	System.out.println("Enter Name");
	name=sc.next();
	System.out.println("Enter age");
	age=sc.nextInt();
	System.out.println("Enter desiganation");
	desiganation=sc.next();
	System.out.println("Enter department");
	department=sc.next();
	System.out.println("Enter Salary");
    sc.nextDouble();
    Employee emp=new Employee(id,name,age,desiganation,department,salary);
    empt.add(emp);
    System.out.println(emp);
    System.out.println("Employee Added Sicessfully");
	}
}

