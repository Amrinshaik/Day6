package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import com.capgemini.day6.domain.CarOrder;

class CarOrderTest {
	@Test
	void testCarOrderProducts() {
		TreeSet<CarOrder> cr=new TreeSet<>();
		
		assertEquals(true, cr.add(new CarOrder("India","rt1",2016,600000.0)));
		assertEquals(true,cr.add(new CarOrder("Germany","rxt",2015,890000.0)));
		assertEquals(true,cr.add(new CarOrder("France","tt2",2018,2000000.0)));
		assertEquals(3, cr.size());
		for (CarOrder carOrder : cr) {
			System.out.println(carOrder);
		}
		
		
	}

}
