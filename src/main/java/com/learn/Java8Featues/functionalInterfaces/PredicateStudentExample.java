package com.learn.Java8Featues.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentsByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {

			if (p1.test(student)) {
				System.out.println(student);
			}

		});
	}

	public static void filterStudentsByGpa() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {

			if (p2.test(student)) {
				System.out.println(student);
			}

		});
	}

	public static void filterStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> {

			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			} else {
				System.out.println(student);
			}

		});
	}

	public static void main(String[] args) {
		filterStudentsByGradeLevel();
		filterStudentsByGpa();
	}

}
