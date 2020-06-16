package com.unisys.entity;

public class Person {

	private String name;
	private String city;
	private Gender gender;

	public Person() {
	}

	public Person(String name, String city, Gender gender) {
		this.name = name;
		this.city = city;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", gender=" + gender + "]";
	}

}
