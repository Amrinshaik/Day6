package com.capgemini.day6.domain;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String school;
	private String district;
	private int greatSchoolRanking;
	
	
	public School() {
		super();
	}


	public School(String name, String city, String school, String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.school = school;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
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


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}


	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
		return false;
		if(this.getClass()!=obj.getClass())
       return false;
		
		School c2=(School)obj;
		return this.name==c2.name && this.city==c2.city && this.school==c2.school && this.district==c2.district;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,city,school,district);
	}

	
	
}
