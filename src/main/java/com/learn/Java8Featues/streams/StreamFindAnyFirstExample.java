package com.learn.Java8Featues.streams;

import java.util.Optional;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

/**
 * findFirst() - Returns first element in the stream.
 * 
 * findAny() - Returns the first encountered element in the stream.
 * 
 * @author tushar
 *
 */
public class StreamFindAnyFirstExample {

	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
				// Adam
				// Jenny
				// Emily
				.filter(student -> student.getGpa() >= 3.9).findAny();
	}

	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
				// Adam
				// Jenny
				// Emily
				.filter(student -> student.getGpa() >= 4.1).findFirst();
	}

	public static void main(String[] args) {
		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if (studentOptionalFindAny.isPresent()) {
			System.out.println("Found the Student : " + studentOptionalFindAny.get());
		} else {
			System.out.println("Student Not Found !");
		}

		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if (studentOptionalFindFirst.isPresent()) {
			System.out.println("Found the First Student : " + studentOptionalFindFirst.get());
		} else {
			System.out.println("Student Not Found !");
		}
	}

}
