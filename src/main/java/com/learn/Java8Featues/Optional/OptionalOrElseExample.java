package com.learn.Java8Featues.Optional;

import java.util.Optional;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class OptionalOrElseExample {

	public static String optionalOrElse() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		String name = studentOptional.map(Student::getName).orElse("Default");

		return name;
	}

	public static String optionalOrElseGet() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");

		return name;
	}

	public static String optionalOrElseThrow() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		String name = studentOptional.map(Student::getName)
				.orElseThrow(() -> new RuntimeException("No Data Available"));

		return name;
	}

	public static void main(String[] args) {

		System.out.println(optionalOrElse());

		System.out.println(optionalOrElseGet());

		System.out.println(optionalOrElseThrow());

	}

}
