package com.learn.Java8Featues.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

/**
 * Filter the elements in the stream.
 * 
 * @author tushar
 *
 */
public class StreamFilterExample {

	public static List<Student> filterStudents() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGender().equals("female"))
				.filter(student -> student.getGpa() >= 3.9).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);
	}

}
