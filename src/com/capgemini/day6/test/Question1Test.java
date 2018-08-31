package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.CellPhone;
import com.capgemini.day6.domain.Laptop;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.Television;

class Question1Test {

	@Test
	void testLaptopProducts() {
		ArrayList<Laptop> laptop=new ArrayList<>();
				
				assertEquals(true, laptop.add(new Laptop("dell","inspiron 556","Windows7","i3")));
				laptop.add(new Laptop("lenovo","LV456","Windows 10","i5"));
				laptop.add(new Laptop("HP","HP125","Windows 7","i7"));
                assertEquals(3, laptop.size());
}
	
	@Test
	void testCarProducts() {
		ArrayList<Car> car=new ArrayList<>();
		
		car.add(new Car("India","rt1",2016,600000.0));
		car.add(new Car("Germany","rxt",2015,890000.0));
		car.add(new Car("France","vri",2018,1000000.0));
		 assertEquals(3, car.size());
}
	
	@Test
	void testCellPhoneProducts() {
		ArrayList<CellPhone> cp=new ArrayList<>();
		
		cp.add(new CellPhone("Lenovo","xyz","sleak","lollypop",12000.0));
		cp.add(new CellPhone("mi","xy","fast charge","jellybean",19000.0));
		cp.add(new CellPhone("xaomi","xyzw","sleak","lollypop",24000.0));
		
		 assertEquals(3, cp.size());
}
	
	@Test
	void testTelevisionProducts() {
		ArrayList<Television> tv=new ArrayList<>();
	
	tv.add(new Television("LG","rt1",false,60000.0));
	 tv.add(new Television("Lenovo","rxt",false,50000.0));
	 tv.add(new Television("Samsung","vri",true,100000.0));
	 assertEquals(3, tv.size());
}

	@Test
	void testSchoolProducts() {
		ArrayList<School> s=new ArrayList<>();
	
	s.add(new School("Geetha","hyderabad","SMHS","Telangana",6));
	 s.add(new School("Preeti","Kurnool","AMHS","AP",5));
	 s.add(new School("shruthi","Mumbai","VMHS","CV",5));
	 assertEquals(3, s.size());
}
}
