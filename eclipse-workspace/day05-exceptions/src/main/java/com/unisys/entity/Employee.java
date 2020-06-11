package com.unisys.entity;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, double salary) throws InvalidIdException, InvalidNameException {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws InvalidIdException {
		if(id<0 || id>99999) {
			throw new InvalidIdException("Id must be between 0 - 99999");
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {
		if(name==null || name.trim().length()<3 || name.trim().length()>25) {
			throw new InvalidNameException();
		}
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
