package com.tsr.beans;

public class Person {
	
	private int personNo;
	private String personName;
	private int age;
	private String gender;
	
	public Person() {
		super();
	}

	public Person(int personNo, String personName, int age, String gender) {
		super();
		this.personNo = personNo;
		this.personName = personName;
		this.age = age;
		this.gender = gender;
	}

	public int getPersonNo() {
		return personNo;
	}

	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [personNo=" + personNo + ", personName=" + personName + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
}
