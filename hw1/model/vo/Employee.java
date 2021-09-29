package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	public Employee() {
	}
	
	public Employee(String name,int age, double height, double weight, int salary,String dept) {
		super(name,age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " salary :" + salary + " dept :" + dept;
	}

}
