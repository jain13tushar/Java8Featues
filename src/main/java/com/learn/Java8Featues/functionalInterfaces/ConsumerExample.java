package com.learn.Java8Featues.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

	public static void printStudents() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c2);
	}

	public static void printNameAndActivities() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c3.andThen(c4)); // consumer chaining
	}

	public static void printNameAndActivitiesUsingCondition() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach((student) -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				c3.andThen(c4).andThen(c2).accept(student);
			}
		}); // consumer chaining
	}

	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("java8");

		// printStudents();

		printNameAndActivities();

		printNameAndActivitiesUsingCondition();

	}

}
