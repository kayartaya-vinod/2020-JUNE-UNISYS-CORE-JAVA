package com.unisys.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.unisys.utils.DateUtil;

public class Person  implements Comparable<Person>, Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Date dob;
	private transient Address address;

	public Person() {
	}

	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}

	public Person(String name, String dob) {
		this.name = name;
		this.dob = DateUtil.toDate(dob);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setDob(String dob) {
		this.dob = DateUtil.toDate(dob);
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dob, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + DateUtil.toString(dob) + ", address=" + address + "]";
	}

	// this provides a natural ordering for two person objects
	@Override
	public int compareTo(Person other) {

		int ret = this.name.compareTo(other.name);
		if (ret == 0) {
			ret = this.dob.compareTo(other.dob);
		}
		return ret;
	}

	static {
		//System.out.println("Person class loaded to VM!");
	}

	public void print() {
		System.out.println("Name = " + name);
		System.out.println("DOB  = " + DateUtil.toString(dob));
	}
	
}
