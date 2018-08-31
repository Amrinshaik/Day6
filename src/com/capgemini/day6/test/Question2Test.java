package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;


import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.CellPhone;
import com.capgemini.day6.domain.Laptop;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.Television;

class Question2Test {

	@Test
	void testCarProducts() {
		HashSet<Car> cr=new HashSet<>();
		
		assertEquals(true, cr.add(new Car("India","rt1",2016,600000.0)));
		assertEquals(true,cr.add(new Car("Germany","rxt",2015,890000.0)));
		assertEquals(false,cr.add(new Car("India","rt1",2016,600000.0)));
		assertEquals(2, cr.size());
		
	}

	@Test
	void testCellPhoneProducts() {
		HashSet<CellPhone> cp=new HashSet<>();
		
		assertEquals(true, cp.add(new CellPhone("Lenovo","xyz","sleak","lollypop",12000.0)));
		assertEquals(false,cp.add(new CellPhone("Lenovo","xyz","sleak","lollypop",12000.0)));
		assertEquals(true,cp.add(new CellPhone("xaomi","xyzw","sleak","jellybean",24000.0)));
		assertEquals(2, cp.size());
}
	
	@Test
	void testLaptopProducts() {
		HashSet<Laptop> lt=new HashSet<>();
		
		assertEquals(true, lt.add(new Laptop("dell","inspiron 556","Windows7","i3")));
		assertEquals(false,lt.add(new Laptop("dell","inspiron 556","Windows7","i3")));
		assertEquals(true,lt.add(new Laptop("HP","HP125","Windows 7","i7")));
}
	
	@Test
	void testSchoolProducts() {
		HashSet<School> sc=new HashSet<>();
		
		assertEquals(true, sc.add(new School("Geetha","hyderabad","SMHS","Telangana",6)));
		assertEquals(true,sc.add(new School("Preeti","Kurnool","AMHS","AP",5)));
		assertEquals(false,sc.add(new School("Geetha","hyderabad","SMHS","Telangana",6)));
}
	
	@Test
	void testTelevisionProducts() {
		HashSet<Television> tv=new HashSet<>();
		
		assertEquals(true, tv.add(new Television("LG","rt1",false,60000.0)));
		assertEquals(false,tv.add(new Television("LG","rt1",false,60000.0)));
		assertEquals(true,tv.add(new Television("Samsung","vri",true,100000.0)));
}
}
