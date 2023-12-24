package com.learn.Java8Featues.streamterminal;

import java.util.Optional;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;

public class StreamMinByMaxByExample {

	public static Optional<Student> minByExample() {

		return StudentDataBase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));

	}

	public static Optional<Student> maxByExample() {

		return StudentDataBase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));

	}

	public static void main(String[] args) {

		System.out.println(minByExample().get());

		System.out.println(maxByExample().get());

	}

}
