package com.learn.Java8Featues.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

/**
 * Converts(Transforms) one type to another as like map() method.
 * 
 * Used in the context of Stream where element in the stream represents multiple
 * elements.
 * 
 * @author tushar
 *
 */
public class StreamFlatMapExample {

	public static List<String> printStudentActivities() {
		return StudentDataBase.getAllStudents().stream()// Stream<Student>
				.map(Student::getActivities) // Stream<List<Student>>
				.flatMap(List::stream)// Stream<String>
				.collect(Collectors.toList());
	}

	public static List<String> printDistinctStudentActivities() {
		return StudentDataBase.getAllStudents().stream()// Stream<Student>
				.map(Student::getActivities) // Stream<List<Student>>
				.flatMap(List::stream)// Stream<String>
				.distinct().collect(Collectors.toList());
	}

	public static List<String> printDistinctSortedStudentActivities() {
		return StudentDataBase.getAllStudents().stream()// Stream<Student>
				.map(Student::getActivities) // Stream<List<Student>>
				.flatMap(List::stream)// Stream<String>
				.distinct().sorted().collect(Collectors.toList());
	}

	public static long printStudentActivitiesCount() {
		return StudentDataBase.getAllStudents().stream()// Stream<Student>
				.map(Student::getActivities) // Stream<List<Student>>
				.flatMap(List::stream)// Stream<String>
				.distinct() // Stream<String> -> with distinct function performed
				.count();
	}

	public static void main(String[] args) {

		System.out.println(printStudentActivities());

	}

}
