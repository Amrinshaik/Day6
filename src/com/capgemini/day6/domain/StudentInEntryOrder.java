package com.capgemini.day6.domain;

public class StudentInEntryOrder {
	private int rollNumber;
    private String name;
    private String branch;
    
	public StudentInEntryOrder() {
		super();
	}

	public StudentInEntryOrder(int rollNumber, String name, String branch) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.branch = branch;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentInEntryOrder [rollNumber=" + rollNumber + ", name=" + name + ", branch=" + branch + "]";
	}
    
	
   
    
}
