package com.capgemini.day6.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class StudentMapTest {

	@Test
	void test() {
		Map<String,ArrayList<String>> students = new HashMap<>(); 
		students.put("John", new ArrayList<String>(Arrays.asList("Mango","Orange","Apple")));
		students.put("Deago", new ArrayList<String>(Arrays.asList("papaya","grapes")));
		students.put("Alex", new ArrayList<String>(Arrays.asList("berries","pears","melons")));
		
		//entrySet() : extracts all entries from hashmap and creates a set
		for(Map.Entry record:students.entrySet()){
		    System.out.println(record.getKey() + " : " + record.getValue());
		}
}
}
