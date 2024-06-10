package com.sj.empmanagementapplication;
import java.io.Serializable;
import java.time.*;
public class Employee {
private int id;
private String name;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDesganation() {
	return desganation;
}

public void setDesganation(String desganation) {
	this.desganation = desganation;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

private int age;
private String desganation;
private String department;
private double salary;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desganation=" + desganation + ", department="
			+ department + ", salary=" + salary + "]";
}
public Employee(int id,String name,int age, String desiganation,String department, double salary) {
	super();
	this.id=id;
	this.name=name;
	this.age=age;
	this.desganation =desiganation;
	this.department=department;
	this.salary=salary;
	
}

}
