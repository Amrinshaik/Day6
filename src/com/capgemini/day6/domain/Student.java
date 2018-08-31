package com.capgemini.day6.domain;

import java.util.Objects;

public class Student implements Comparable <Student> {
	private int rollNumber;
    private String name;
    private String branch;
    
    
	public Student() {
		super();
	}


	public Student(int rollNumber, String name, String branch) {
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
	public int compareTo(Student s2) {
		int result=this.name.compareTo(s2.name);
		if(result==0)
			return this.branch.compareTo(s2.branch);
					return result;
	}
    
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", branch=" + branch + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Student c2 = (Student) obj;
		return this.name == c2.name && this.rollNumber == c2.rollNumber 
					&& this.branch == c2.branch;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber, branch);
	}
}
