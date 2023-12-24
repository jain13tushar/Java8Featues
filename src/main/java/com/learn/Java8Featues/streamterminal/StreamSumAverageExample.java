package com.learn.Java8Featues.streamterminal;

import static java.util.stream.Collectors.summingInt;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;

public class StreamSumAverageExample {

	public static int sum() {
		return StudentDataBase.getAllStudents().stream().collect(summingInt(Student::getNoteBooks));
	}

	public static double average() {
		return StudentDataBase.getAllStudents().stream().collect(averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println("Total No of notebooks : " + sum());
		System.out.println("Average No of notebooks : " + average());
	}

}
