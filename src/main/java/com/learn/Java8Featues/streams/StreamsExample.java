package com.learn.Java8Featues.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);

		Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream().peek(student -> {
			System.out.println(student);
		}).filter(studentPredicate).filter(studentGpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap);

	}

}
