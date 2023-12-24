package com.learn.Java8Featues.parallelstream;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class ParallelStreamExample1 {

	public static List<String> sequentialPrintStudentActivities() {

		long startTime = System.currentTimeMillis();

		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(toList());

		long endTime = System.currentTimeMillis();

		System.out.println("Duration to execute the pipeline in sequential : " + (endTime - startTime));

		return studentActivities;
	}

	public static List<String> parallelPrintStudentActivities() {

		long startTime = System.currentTimeMillis();

		List<String> studentActivities = StudentDataBase.getAllStudents().parallelStream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(toList());

		long endTime = System.currentTimeMillis();

		System.out.println("Duration to execute the pipeline in parallel : " + (endTime - startTime));

		return studentActivities;
	}

	public static void main(String[] args) {

		sequentialPrintStudentActivities();

		parallelPrintStudentActivities();

	}

}
