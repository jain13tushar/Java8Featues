package com.learn.Java8Featues.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

/**
 * Convert(transform) one type to another.
 * 
 * @author tushar
 *
 */
public class StreamMapExample {

	public static List<String> namesList() {
		return StudentDataBase.getAllStudents().stream() // Stream<Student>
				// Student as an input -> Student Name
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase)// Stream<String> -> uppercase operation on each input.
				.collect(Collectors.toList()); // List<String>
	}

	public static Set<String> uniqueNameList() {
		return StudentDataBase.getAllStudents().stream() // Stream<Student>
				// Student as an input -> Student Name
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase)// Stream<String> -> uppercase operation on each input.
				.collect(Collectors.toSet()); // Set<String>
	}

	public static void main(String[] args) {

		System.out.println(namesList());
		System.out.println(uniqueNameList());

	}

}
