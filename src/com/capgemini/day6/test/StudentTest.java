package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Student;
import com.capgemini.day6.domain.StudentInEntryOrder;

class StudentTest {

	@Test
	void testStudentProducts() {
		TreeSet<Student> st=new TreeSet<>();
		assertEquals(true, st.add(new Student(6,"sam","ece")));
		assertEquals(true, st.add(new Student(10,"ram","cse")));
		assertEquals(true, st.add(new Student(21,"sita","it")));
		//assertEquals(expected, actual);
		for (Student student : st) {
			System.out.println(student);
		}
		
	}
	
	@Test
	void testStudentInEntryOrderProducts() {
		ArrayList<StudentInEntryOrder> st=new ArrayList<>();
		assertEquals(true, st.add(new StudentInEntryOrder(6,"ram","ece")));
		assertEquals(true, st.add(new StudentInEntryOrder(10,"sham","cse")));
		assertEquals(true, st.add(new StudentInEntryOrder(21,"sita","it")));
		//assertEquals(expected, actual);
		for (StudentInEntryOrder studentInEntryOrder : st) {
			System.out.println(studentInEntryOrder);
		}
	}
	
}
