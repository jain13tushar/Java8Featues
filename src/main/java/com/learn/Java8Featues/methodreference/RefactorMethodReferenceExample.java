package com.learn.Java8Featues.methodreference;

import java.util.function.Predicate;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> p2 = RefactorMethodReferenceExample::greaterThanGradeLevel;

	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {

		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

		System.out.println(p2.test(StudentDataBase.studentSupplier.get()));

	}

}
