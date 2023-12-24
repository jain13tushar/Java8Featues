package com.learn.Java8Featues.streamterminal;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGender));
		System.out.println(studentMap);
	}

	public static void customizedGroupingBy() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println(studentMap);
	}

	public static void twoLevelGrouping1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel,
						groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(studentMap);
	}

	public static void twoLevelGrouping2() {
		Map<String, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
		System.out.println(studentMap);
	}

	public static void threeArgumentGroupBy() {
		LinkedHashMap<String, Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
		System.out.println(studentMap);
	}

	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(studentMapOptional);

		Map<Integer, Student> studentMapOptional1 = StudentDataBase.getAllStudents().stream().collect(groupingBy(
				Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		System.out.println(studentMapOptional1);
	}

	public static void calculateLeastGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
		System.out.println(studentMapOptional);
	}

	public static void main(String[] args) {
		groupStudentsByGender();
		customizedGroupingBy();
		twoLevelGrouping1();
		twoLevelGrouping2();
		threeArgumentGroupBy();
		calculateTopGpa();
		calculateLeastGpa();
	}

}
