package com.learn.Java8Featues.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class DefaultMethodExample2 {

	static Consumer<Student> studentConsumer = (student -> System.out.println(student));
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

	public static void sortByName(List<Student> studentList) {
		System.out.println("After Sort");
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}

	public static void sortByGPA(List<Student> studentList) {
		System.out.println("After Sort");
		Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);

		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}

	public static void comparatorChaining(List<Student> studentList) {
		System.out.println("After Sort");

		studentList.sort(gradeComparator.thenComparing(nameComparator));
		studentList.forEach(studentConsumer);
	}

	public static void sortWithNullValues(List<Student> studentList) {
		Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);
	}

	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();

		// studentList.forEach(studentConsumer);

		// sortByName(studentList);

		sortWithNullValues(studentList);

	}

}
