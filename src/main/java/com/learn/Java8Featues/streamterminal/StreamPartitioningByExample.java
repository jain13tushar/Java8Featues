package com.learn.Java8Featues.streamterminal;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class StreamPartitioningByExample {

	public static void partitioningBy_1() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
		Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
				.collect(partitioningBy(gpaPredicate));

		System.out.println("partitioningMap : " + partitioningMap);
	}

	public static void partitioningBy_2() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
		Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
				.collect(partitioningBy(gpaPredicate, toSet()));

		System.out.println("partitioningMap : " + partitioningMap);
	}

	public static void main(String[] args) {
		partitioningBy_1();
		partitioningBy_2();
	}

}
