package com.pravi.copyConstructor;

public class Person 
{
	private int personId;
	private String personName;
	
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	
	
	

}
