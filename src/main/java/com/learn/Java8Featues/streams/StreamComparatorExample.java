package com.learn.Java8Featues.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class StreamComparatorExample {

	public static List<Student> sortStudentsByName() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentsByGpa() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentsByGpaDesc() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		sortStudentsByName().forEach(System.out::println);

	}

}
