package com.learn.Java8Featues.streamterminal;

import java.util.stream.Collectors;

import com.learn.Java8Featues.data.StudentDataBase;

public class StreamCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() > 3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {

		System.out.println(count());

	}

}
